<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<!-- Mirrored from themazine.com/html/inobiz/contact.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 15 May 2019 08:37:46 GMT -->
<head>
		<meta charset="UTF-8">
		<!-- For IE -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge">

		<!-- For Resposive Device -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<title>inobiz -  Business & Agency Template</title>

		<!-- Favicon -->
		<link rel="icon" type="image/png" sizes="56x56" href="userResources/images/fav-icon/icon.png">


		<!-- Main style sheet -->
		<link rel="stylesheet" type="text/css" href="userResources/css/style.css">
		<!-- responsive style sheet -->
		<link rel="stylesheet" type="text/css" href="userResources/css/responsive.css">


		<!-- Fix Internet Explorer ______________________________________-->

		<!--[if lt IE 9]>
			<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
			<script src="vendor/html5shiv.js"></script>
			<script src="vendor/respond.js"></script>
		<![endif]-->


	</head>

	<body>
		<div class="main-page-wrapper">

			<!-- ===================================================
				Loading Transition
			==================================================== -->
			<div id="loader-wrapper">
				<div id="loader"></div>
			</div>




			<!--
			=============================================
				Theme Header
			==============================================
			-->
			<header class="theme-menu-wrapper">
				<div class="container">
					<jsp:include page="header.jsp"></jsp:include>

					<jsp:include page="menu.jsp"></jsp:include>
				</div> <!-- /.container -->
			</header> <!-- /.theme-menu-wrapper -->


			<!--
			=============================================
				Theme Inner Banner
			==============================================
			-->
			<div class="theme-inner-banner">
				<div class="opacity">
					<div class="container">
						<p>Inpire Your Business, Our talent team member of business agency </p>
						<h2>Contact</h2>
						<ul>
							<li><a href="index-2.html">Home</a></li>
							<li>.</li>
							<li><a href="#">Page</a></li>
							<li>.</li>
							<li>Contact</li>
						</ul>
					</div> <!-- /.container -->
				</div> <!-- /.opacity -->
			</div> <!-- /.theme-inner-banner -->


			<!--
			=============================================
				Contact Form
			==============================================
			-->
			<div class="contact-form section-margin-bottom">
				<div class="container">
					<div class="text-center">
						<h2>Let's talk</h2>
						<p>Suspe ndisse suscipit sagittis leo sit met dimentum estibulum issim posuere cubilia Curae Suspendisse at <br> consectetur massa. Curabitur non ipsum nisinec dapibus elit. Donec nec</p>
					</div>
					<form action="http://themazine.com/html/inobiz/inc/sendemail.php" class="form-validation" autocomplete="off">
						<div class="row">
							<div class="col-md-4 col-xs-12">
								<input type="text" placeholder="Name" name="name">
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<input type="email" placeholder="Email" name="email">
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<input type="text" placeholder="Subject" name="sub">
							</div>
						</div> <!-- /.row -->
						<textarea placeholder="Message" name="message"></textarea>
						<button class="theme-button-one p-bg-color">Send us</button>
					</form>

					<!--Contact Form Validation Markup -->
					<!-- Contact alert -->
					<div class="alert-wrapper" id="alert-success">
						<div id="success">
							<button class="closeAlert"><i class="fa fa-times" aria-hidden="true"></i></button>
							<div class="wrapper">
				               	<p>Your message was sent successfully.</p>
				             </div>
				        </div>
				    </div> <!-- End of .alert-wrapper -->
				    <div class="alert-wrapper" id="alert-error">
				        <div id="error">
				           	<button class="closeAlert"><i class="fa fa-times" aria-hidden="true"></i></button>
				           	<div class="wrapper">
				               	<p>Sorry!Something Went Wrong.</p>
				            </div>
				        </div>
				    </div> <!-- End of .alert-wrapper -->
				</div> <!-- /.container -->
			</div> <!-- /.contact-form -->



			<!--
			=============================================
				Contact Address
			==============================================
			-->
			<div class="contact-address section-margin-bottom">
				<div class="container">
					<div class="row">
						<div class="col-md-4 col-sm-6 col-xs-12 address-list float-right">
							<ul class="address">
								<li>
									<i class="fa fa-map-marker" aria-hidden="true"></i>
									Barisal City , NY 10036, United States
								</li>
								<li>
									<i class="fa fa-envelope-o" aria-hidden="true"></i>
									inobiz_info@gmail.com
								</li>
								<li>
									<i class="fa fa-phone" aria-hidden="true"></i>
									+8801713879773
								</li>
							</ul>
							<ul class="icon">
								<li><a href="#" class="tran3s"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
								<li><a href="#" class="tran3s"><i class="fa fa-linkedin" aria-hidden="true"></i></a></li>
								<li><a href="#" class="tran3s"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
								<li><a href="#" class="tran3s"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
							</ul>
						</div> <!-- /.address-list -->

						<div class="col-md-8 col-sm-6 col-xs-12">
							<!-- Google Map _______________________ -->
							<div class="map-canvas"></div>
						</div>
					</div> <!-- /.row -->
				</div> <!-- /.container -->
			</div> <!-- /.contact-address -->



			<!--
			=============================================
				Bottom Banner
			==============================================
			-->
			<div class="bottom-banner">
				<div class="container">
					<div class="row">
						<div class="col-md-9 col-sm-8 col-xs-12">
							<h3>If you have any querry for related Business… Just touch on this button</h3>
						</div>
						<div class="col-md-3 col-sm-4 col-xs-12">
							<a href="contact.html" class="theme-button-one float-right">Contact us</a>
						</div>
					</div>
				</div> <!-- /.container -->
			</div> <!-- /.bottom-banner -->


			<!--
			=============================================
				Footer
			==============================================
			-->
			<jsp:include page="footer.jsp"></jsp:include>


	        <!-- Scroll Top Button -->
			<button class="scroll-top tran3s">
				<i class="fa fa-angle-up" aria-hidden="true"></i>
			</button>





		<!-- Js File_________________________________ -->

		<!-- j Query -->
		<script src="userResources/vendor/jquery.2.2.3.min.js"></script>
		<!-- Bootstrap JS -->
		<script src="userResources/vendor/bootstrap/bootstrap.min.js"></script>
		<!-- Bootstrap Select JS -->
		<script type="text/javascript" src="userResources/vendor/bootstrap-select/dist/js/bootstrap-select.js"></script>
		<!-- Camera Slider -->
		<script type='text/javascript' src='userResources/vendor/Camera-master/scripts/jquery.mobile.customized.min.js'></script>
	    <script type='text/javascript' src='userResources/vendor/Camera-master/scripts/jquery.easing.1.3.js'></script>
	    <script type='text/javascript' src='userResources/vendor/Camera-master/scripts/camera.min.js'></script>
	    <!-- Mega menu  -->
		<script type="text/javascript" src="userResources/vendor/bootstrap-mega-menu/js/menu.js"></script>
		<!-- WOW js -->
		<script src="userResources/vendor/WOW-master/dist/wow.min.js"></script>
		<!-- owl.carousel -->
		<script src="userResources/vendor/owl-carousel/owl.carousel.min.js"></script>
		<!-- Validation -->
		<script type="text/javascript" src="userResources/vendor/contact-form/validate.js"></script>
		<script type="text/javascript" src="userResources/vendor/contact-form/jquery.form.js"></script>
		<!-- Google map js -->
		<!-- <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjQLCCbRKFhsr8BY78g2PQ0_bTyrm_YXU" type="text/javascript"></script>
		<script src="userResources/vendor/sanzzy-map/dist/snazzy-info-window.min.js"></script> -->


		<!-- Theme js -->
		<script type="text/javascript" src="userResources/js/theme.js"></script>
		<!-- <script type="text/javascript" src="userResources/js/map-script.js"></script> -->

		</div> <!-- /.main-page-wrapper -->
	</body>

<!-- Mirrored from themazine.com/html/inobiz/contact.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 15 May 2019 08:37:50 GMT -->
</html>
