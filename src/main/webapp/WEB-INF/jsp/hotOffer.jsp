<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- top-brands -->
	<div class="top-brands">
		<div class="container">
			<h3>Hot Offers</h3>
			<div class="agile_top_brands_grids">


			<c:forEach var="item" items="${hotOffers}" >

				<div class="col-md-3 top_brand_left">
					<div class="hover14 column">
						<div class="agile_top_brand_left_grid">
							<div class="tag"><img src="images/tag.png" alt=" " class="img-responsive" /></div>
							<div class="agile_top_brand_left_grid1">
								<figure>
									<div class="snipcart-item block" >
										<div class="snipcart-thumb">
											<a href="single.html"><img title=" " alt=" " src="${item.imageUrl}" /></a>
											<p>${item.productName}</p>
											<h4>Rs ${item.productPrice + 474} <span>Rs ${item.productPrice}</span></h4>
										</div>
										<div class="snipcart-details top_brand_home_details">
											<form action="checkout" method="post">
												<fieldset>
													<input type="hidden" name="cmd" value="_cart" />
													<input type="hidden" name="productId" value="${item.productId}" />
													<input type="hidden" name="add" value="1" />
													<input type="hidden" name="business" value=" " />
													<input type="hidden" name="item_name" value="${item.productName}" />
													<input type="hidden" name="amount" value="${item.productPrice}" />
													<input type="hidden" name="discount_amount" value="1.00" />
													<input type="hidden" name="currency_code" value="INR" />
													<input type="hidden" name="return" value=" " />
													<input type="hidden" name="cancel_return" value=" " />
													<input type="submit" name="submit" value="Add to cart" class="button" />
												</fieldset>
											</form>
										</div>
									</div>
								</figure>
							</div>
						</div>
					</div>
				</div>

				</c:forEach>








				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //top-brands -->