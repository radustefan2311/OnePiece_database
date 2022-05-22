<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
  <!-- Bootstrap -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  <!-- Google Fonts -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <!-- Google Fonts -->
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100;400;900&family=Ubuntu&display=swap" rel="stylesheet">
  <!-- CSS Link -->
   <link rel="stylesheet" type="text/css" href="/OnePiece-database/styles.css">
  <!-- Font Awesome -->
  <script src="https://kit.fontawesome.com/5977b5a018.js" crossorigin="anonymous"></script>
  <style>
  body {
  font-family: "Montserrat";
  text-align: center;
}

h1, h2, h3, h4, h5, h6 {
  font-family: "Montserrat";
  font-weight: 900;
}

p {
  color: #8f8f8f;
}

/* Headings */
.big-heading {
  font-family: "Montserrat";
  font-size: 3.5rem;
  line-height: 1.5;
  font-weight: 900;
}

.section-heading {
  font-size: 3rem;
  line-height: 1.5;
}

/* Containers */
.container-fluid {
  padding: 7% 15%;
}

/* Sections */
.colored-section {
  background-color: #19bcec;
  color: #fff;
}

.white-section {
  background-color: #fff;
}

/* Navigation Bar */
.navbar {
  padding: 0 0 4.5rem;
}

.navbar-brand {
  font-family: "Ubuntu";
  font-size: 2.5rem;
  font-weight: bold;
}

.nav-item {
  padding: 0 18px;
}

.nav-link {
  font-size: 1.2rem;
  font-family: "Montserrat"
}

/* Download Buttons */
.download-button {
  margin: 5% 3% 5% 0;
}

/* Title Section */
#title .container-fluid {
  padding: 3% 15% 7%;
  text-align: left;
}

/* Title Image */
.title-image {
  width: 60%;
  transform: rotate(25deg);
  position: absolute;
  right: 30%;
}

.img-poz {
  position: relative;
}

/* Feature Section */
#features {
  position: relative;
  z-index: 1;
}

.feature-title {
  font-size: 1.5rem;
}

.feature-box {
  padding: 5%;
}

.icon {
  color: #19bcec;
  margin-bottom: 1rem;
}

.icon:hover {
  color:  #1d9cc2;
}

/* Testimonial Section */
#testimonials {
  background-color: #19bcec;
}

.testimonial-text {
  font-size: 3rem;
  line-height: 1.5;
}

.testimonial-image {
  width: 10%;
  border-radius: 100%;
  margin: 20px;
}

#press {
  background-color: #ef8172;
  padding-bottom: 3%;
}

.press-logo {
  width: 15%;
  margin: 20px 20px 50px;
}

/* Pricing Section */
#pricing {
  padding: 80px;
}

.price-text {
  font-size: 3rem;
  line-height: 1.5;
}

.pricing-column {
  padding: 3% 2%;
}

/* Footer */
.social-icon {
  margin: 20px 10px;
}

@media (max-width: 1028px) {
  #title {
    text-align: center;
  }

  .title-image {
    position: static;
    transform: rotate(0);
  }
}
  </style>
</head>

<body>

  <section class="colored-section" id="title">

    <div class="container-fluid">


      <!-- Nav Bar -->


      <nav class="navbar navbar-expand-lg navbar-dark">

        <a class="navbar-brand" href="">OnePiece-db</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
          <ul class="navbar-nav ms-auto">
            <li class="nav-item">
              <a class="nav-link" href="#footer">Contact</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#pricing">Pricing</a>
            </li>
          </ul>
        </div>

      </nav>


      <!-- Title -->

      <div class="row">

        <div class="col-md-6">
          <h1 class="big-heading">Welcome to the One Piece World</h1>
        </div>

        <div class="img-poz col-md-6">
          <img class="title-image" src="https://cdn.vox-cdn.com/thumbor/QmYUW4WDPUe5cakWg1doB00HdBk=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/19656977/5986912410_682fed19e2_b.jpg" alt="iphone-mockup">
        </div>

      </div>
    </div>
  </section>


  <!-- Features -->

  <section class="white-section" id="features">

    <div class="container-fluid">



      <div class="row">
        <div class="feature-box col-md-4">
          <i class="icon fa-solid fa-circle-check fa-4x"></i>
          <h3 class="feature-title">Easy to use.</h3>
          <p>Everyone can use it.</p>
        </div>
        <div class="feature-box col-md-4">
          <i class="icon fa-solid fa-bullseye fa-4x"></i>
          <h3 class="feature-title">Information</h3>
          <p>Find everything you need.</p>
        </div>
        <div class="feature-box col-md-4">
          <i class="icon fa-solid fa-heart fa-4x"></i>
          <h3 class="feature-title">For the fans.</h3>
          <p>If you are a fan, you will enjoy this.</p>
        </div>
      </div>
    </div>
  </section>


  <!-- Testimonials -->

  <section class="colored-section" id="testimonials">

    <div id="testimonial-carousel" class="carousel slide" data-ride="false">
      <div class="carousel-inner">
        <div class="carousel-item active container-fluid">
          <h2 class="testimonial-text">I have found everything about my character.</h2>
          <em>Alex, New York</em>
        </div>
        <div class="carousel-item container-fluid">
          <h2 class="testimonial-text">Wow! Didn't know Luffy could do that.</h2>
          <em>Beverly, Illinois</em>
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#testimonial-carousel" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#testimonial-carousel" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
    </div>

  </section>

 <section class="white-section" id="features">

    <div class="container-fluid">

       <div class="row align-items-start">
    		<div class="col">
     			 <div class="card" style="width: 18rem;">
  					<img class="card-img-top" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOlfgrwa9XvfNNafxdIY3CcsEZfhpB35_t2eicUCIcqL8U-Gz3zoeEGxtv7qSnVHo8C2Y&usqp=CAU" alt="Card image cap">
 					 <p class="card-text">Everything to know about emperors.</p>
  					<div class="card-body">
  					<a href="ItUserDevices.jsp" class="btn btn-primary">See the list.</a>
  					</div>
      
    		</div>
   	 	</div>
   	 	<div class="col">
     			 <div class="card" style="width: 18rem;">
  					<img class="card-img-top" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOlfgrwa9XvfNNafxdIY3CcsEZfhpB35_t2eicUCIcqL8U-Gz3zoeEGxtv7qSnVHo8C2Y&usqp=CAU" alt="Card image cap">
 					 <p class="card-text">Everything to know about emperors.</p>
  					<div class="card-body">
  					<a href="ItUserDevices.jsp" class="btn btn-primary">See the list.</a>
  					</div>
      
    		</div>
   	 	</div>
   	 	<div class="col">
     			 <div class="card" style="width: 18rem;">
  					<img class="card-img-top" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOlfgrwa9XvfNNafxdIY3CcsEZfhpB35_t2eicUCIcqL8U-Gz3zoeEGxtv7qSnVHo8C2Y&usqp=CAU" alt="Card image cap">
 					 <p class="card-text">Everything to know about emperors.</p>
  					<div class="card-body">
  					<a href="ItUserDevices.jsp" class="btn btn-primary">See the list.</a>
  					</div>
      
    		</div>
   	 	</div>
   	 	<div class="col">
     			 <div class="card" style="width: 18rem;">
  					<img class="card-img-top" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOlfgrwa9XvfNNafxdIY3CcsEZfhpB35_t2eicUCIcqL8U-Gz3zoeEGxtv7qSnVHo8C2Y&usqp=CAU" alt="Card image cap">
 					 <p class="card-text">Everything to know about emperors.</p>
  					<div class="card-body">
  					<a href="ItUserDevices.jsp" class="btn btn-primary">See the list.</a>
  					</div>
      
    		</div>
   	 	</div>
   	 	
   	 	
   	 	
    </div>
  </div>
    
    
    
    
  </section>

  <!-- Footer -->

  <footer class="white-section" id="footer">

    <div class="container-fluid">
      <i class="social-icon fa-brands fa-facebook"></i>
      <i class="social-icon fa-brands fa-twitter"></i>
      <i class="social-icon fa-brands fa-instagram"></i>
      <i class="social-icon fa-solid fa-envelope"></i>
      <p>© Copyright TinDog</p>

    </div>
  </footer>


</body>

</html>