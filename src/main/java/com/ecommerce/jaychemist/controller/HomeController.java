package com.ecommerce.jaychemist.controller;

import com.ecommerce.jaychemist.dto.Popup;
import com.ecommerce.jaychemist.entity.*;
import com.ecommerce.jaychemist.repository.*;
import com.ecommerce.jaychemist.service.CustomerService;
import com.ecommerce.jaychemist.service.EmailService;
import com.oracle.wls.shaded.org.apache.xpath.operations.Mod;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.List;

@Controller
@Slf4j
@AllArgsConstructor
public class HomeController {

    private PartyRepository partyRepository;
    private PersonRepo personRepo;
    private AddressRepo customerAddressRepo;
    private UserLoginRepo userLoginRepo;
    private CustomerService customerService;
    private ProductRepo productRepo;
    private ProductCategoryRepo productCategoryRepo;
    private EmailService emailService;

    @RequestMapping("/")
    @Transactional
    public String getHome(Model model){
        List<Product> products = productRepo.findByProductCategory(productCategoryRepo.findByProductCategoryName("Multi vitamin tablets"));
        model.addAttribute("hotOffers",products);
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model){
        return "login";
    }

    @RequestMapping("/register")
    public String register(Model model){
        return "register";
    }

    @RequestMapping(value = "/registerUser",method = RequestMethod.POST)
    public String registerUser(Model model, @ModelAttribute Person person
            ,@ModelAttribute CustomerAddress customerAddress,
                               @ModelAttribute UserLogin userLogin){
        Party party = customerService.registerUser("CUSTOMER",userLogin,person,customerAddress);
        if(party != null){
            model.addAttribute("popup",Popup.builder().heading("SUCCESS").message("Registered Successfully!!").build());
        }else {
            model.addAttribute("popup",Popup.builder().heading("ERROR").message("Error While Registering!!").build());
        }
        return "index";
    }


    @RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
    public String checkLogin(Model model, @ModelAttribute UserLogin userLogin, HttpServletRequest httpServletRequest){
        if(customerService.checkLogin(userLogin,httpServletRequest)){
            model.addAttribute("popup",Popup.builder().heading("SUCCESS").message("Logged IN Successfully!!").build());
            return "index";
        }
        model.addAttribute("popup",Popup.builder().heading("ERROR").message("Invalid User and password!!").build());
        return "login";
    }

    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public String logout(Model model,HttpServletRequest httpServletRequest){
        httpServletRequest.getSession().invalidate();
        model.addAttribute("popup",Popup.builder().heading("SUCCESS").message("Logged Out Successfully!!").build());
        return "index";
    }

    @RequestMapping(value = "/checkout",method = RequestMethod.POST)
    public String checkoutAddress(Model model,HttpServletRequest httpServletRequest){
        Person person = (Person) httpServletRequest.getSession().getAttribute("person");
        if(person!= null){;
            List<CustomerAddress> customerAddress = customerAddressRepo.findAllByParty(person.getParty());
            model.addAttribute("addressList",customerAddress);
        }else {
            return "login";
        }
        return "CheckoutAddress";
    }



    @RequestMapping(value = "/orderConfirmation",method = RequestMethod.POST)
    public String orderConfirmation(HttpServletRequest httpServletRequest){
        return "orderconfirmation";
    }

    @RequestMapping(value = "/view",method = RequestMethod.GET)
    public String view(){
        return "CheckoutAddress";
    }



//    @GetMapping("/test")
//    @Transactional
//    public ResponseEntity<Party> callService(){
//        Party party = partyRepository.save(new Party("CUSTOMER",new Date(),new Date()));
//        if(party!=null){
//            personRepo.save(new Person("Madhi","Krishnan", Gender.MALE,party));
//            customerAddress.save(new CustomerAddress("Address1","Address2","Mumbai","Maharashtra",400055,party));
//            userLoginRepo.save(new UserLogin("madhikrishnan522@gmail.com","password",party));
//        }
//        return new ResponseEntity<Party>(party,HttpStatus.OK);
//    }

}
