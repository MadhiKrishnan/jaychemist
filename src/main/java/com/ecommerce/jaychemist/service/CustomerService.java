package com.ecommerce.jaychemist.service;

import com.ecommerce.jaychemist.entity.*;
import com.ecommerce.jaychemist.repository.AddressRepo;
import com.ecommerce.jaychemist.repository.PartyRepository;
import com.ecommerce.jaychemist.repository.PersonRepo;
import com.ecommerce.jaychemist.repository.UserLoginRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerService {

    private PartyRepository partyRepository;
    private UserLoginRepo userLoginRepo;
    private AddressRepo addressRepo;
    private PersonRepo personRepo;
    private EmailService emailService;


    @Transactional
    public Party registerUser(String partyType, UserLogin userLogin,
                              Person person,CustomerAddress customerAddress){
        Party party = partyRepository.save(new Party(partyType));
        if(party != null){
            customerAddress.setParty(party);
            addressRepo.save(customerAddress);

            person.setParty(party);
            personRepo.save(person);

            userLogin.setParty(party);
            userLoginRepo.save(userLogin);

            //emailService.sendSimpleEmail(userLogin.getEmailId(),"Welcome To JAY Chemist","You have been registered successfully! Your Party Id is : "+party.getPartyId());
            return party;
        }
        return null;
    }

    public boolean checkLogin(UserLogin userLogin, HttpServletRequest httpServletRequest){
        UserLogin retrivedData = userLoginRepo.findByEmailId(userLogin.getEmailId());
        if(retrivedData != null) {
            //check for password
            if(userLogin.getPassword().equals(retrivedData.getPassword())){
                Person person = personRepo.findByParty(retrivedData.getParty());
                httpServletRequest.getSession().setAttribute("person",person);
                log.info("User is genuen");
                return true;
            }
        }
        return false;
    }
}
