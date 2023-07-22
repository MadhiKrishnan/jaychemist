<jsp:include page="header.jsp" />
<!-- products-breadcrumb -->
	<div class="products-breadcrumb">
		<div class="container">
			<ul>
				<li><i class="fa fa-home" aria-hidden="true"></i><a href="index.html">Home</a><span>|</span></li>
				<li>Sign In & Sign Up</li>
			</ul>
		</div>
	</div>
<!-- //products-breadcrumb -->
<!-- banner -->
	<div class="banner">
		<div class="w3l_banner_nav_left">
		<nav class="navbar nav_bottom">
			 <!-- Brand and toggle get grouped for better mobile display -->
			  <div class="navbar-header nav_2">
				  <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				  </button>
			   </div>
			   <!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<ul class="nav navbar-nav nav_1">
						<li><a href="products.html">Branded Foods</a></li>
						<li><a href="household.html">Households</a></li>
						<li class="dropdown mega-dropdown active">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Veggies & Fruits<span class="caret"></span></a>
							<div class="dropdown-menu mega-dropdown-menu w3ls_vegetables_menu">
								<div class="w3ls_vegetables">
									<ul>
										<li><a href="vegetables.html">Vegetables</a></li>
										<li><a href="vegetables.html">Fruits</a></li>
									</ul>
								</div>
							</div>
						</li>
						<li><a href="kitchen.html">Kitchen</a></li>
						<li><a href="short-codes.html">Short Codes</a></li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Beverages<span class="caret"></span></a>
							<div class="dropdown-menu mega-dropdown-menu w3ls_vegetables_menu">
								<div class="w3ls_vegetables">
									<ul>
										<li><a href="drinks.html">Soft Drinks</a></li>
										<li><a href="drinks.html">Juices</a></li>
									</ul>
								</div>
							</div>
						</li>
						<li><a href="pet.html">Pet Food</a></li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Frozen Foods<span class="caret"></span></a>
							<div class="dropdown-menu mega-dropdown-menu w3ls_vegetables_menu">
								<div class="w3ls_vegetables">
									<ul>
										<li><a href="frozen.html">Frozen Snacks</a></li>
										<li><a href="frozen.html">Frozen Nonveg</a></li>
									</ul>
								</div>
							</div>
						</li>
						<li><a href="bread.html">Bread & Bakery</a></li>
					</ul>
				 </div><!-- /.navbar-collapse -->
			</nav>
		</div>
		<div class="w3l_banner_nav_right">
<!-- login -->
		<div class="w3_login">
			<h3>Sign In & Sign Up</h3>
			<div class="w3_login_module">
				<div class="module form-module">

				  <div class="form">
                  					<h2>Create an account</h2>
                  					<form action="#" method="post">
                                    					  <input type="text" name="Username" placeholder="First Name" required=" ">
                                    					  <input type="text" name="Username2" placeholder="Last Name" required=" ">

                                    					<p class="gender">Gender  :<span>
                                    						<label for="male">male</label>
                                    						<input type="radio" name="gender" id="male" value="male" checked>
                                    						<label for="female">Female</label>
                                    						<input type="radio" name="gender" id="female" value="female">
                                    					</span></p>
                                    					<br>


                                    					  <input type="password" name="Password" placeholder="Password" required=" ">
                                    					  <input type="email" name="Email" placeholder="Email Address" required=" ">
                                    					  <input type="text" name="Phone" placeholder="Phone Number" required=" ">
                                    					  <input type="submit" value="Register">
                                    					</form>
                  				  </div>
				  <div class="form">
					<h2>Create an account</h2>
					<form action="/registerUser" method="post">
                    <input type="text" name="firstName" placeholder="First Name" required=" ">
                    <input type="text" name="lastName" placeholder="Last Name" required=" ">

                    <div class="pb-1 gender_container">
                    <p class="gender">Gender  :<span>
                    <label for="male">Male</label>
                    <input type="radio" name="gender" id="male" value="male" checked>
                    <label for="female">Female</label>
                    <input type="radio" name="gender" id="female" value="female">
                    </span></p>
                    </div>

                    <input type="password" name="password" placeholder="Password" required=" ">
                    <input type="email" name="emailId" placeholder="Email Address" required=" ">
                    <input type="number" name="phone" placeholder="Phone Number" required=" ">
                    <input type="text" name="address1" placeholder="Address Line 1" required=" ">
                    <input type="text" name="address2" placeholder="Address Line 2" required=" ">
                    <input type="text" name="state" placeholder="State" required=" ">
                    <input type="text" name="city" placeholder="City" required=" ">
                    <input type="number" name="pincode" placeholder="Pincode" required=" ">
                    <input type="submit" value="Register">
                    </form>
				  </div>
				  <div class="cta"><a href="#">Forgot your password?</a></div>
				</div>
			</div>
			<script>
				$('.toggle').click(function(){
				  // Switches the Icon
				  $(this).children('i').toggleClass('fa-pencil');
				  // Switches the forms
				  $('.form').animate({
					height: "toggle",
					'padding-top': 'toggle',
					'padding-bottom': 'toggle',
					opacity: "toggle"
				  }, "slow");
				});
			</script>
		</div>
<!-- //login -->
		</div>
		<div class="clearfix"></div>
	</div>
<!-- //banner -->
<jsp:include page="newsletter-top.jsp" />
<jsp:include page="newsletter-bottom.jsp" />
<jsp:include page="footer.jsp" />