<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp" />
 <h3 style="margin-left: 30px;color: red;">Select a delivery address</h3>
 <div class="order_container">
    <h4>Most recently used</h4>
         <form action="/orderConfirmation" method="post">
             <ul >
                <c:forEach var="address" items="${addressList}">
                <li id="order_inputs"><input type="radio" name="address1"> ${address.address1} ${address.address2} ${address.state} ${address.city} ${address.pincode}
                </li>
                </c:forEach>
             </ul>
         </form>
         <div class="address_btn_container">
             <button id="address_btn">
                use this address
             </button>
         </div>
 </div>

 <jsp:include page="newsletter-bottom.jsp" />
 <jsp:include page="footer.jsp" />