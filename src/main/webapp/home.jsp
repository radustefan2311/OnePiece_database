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
  <link rel="stylesheet" href="/OnePiece-database/styles.css" type="text/css">
  <!-- Font Awesome -->
  <script src="https://kit.fontawesome.com/5977b5a018.js" crossorigin="anonymous"></script>
  <!-- Favcoin -->
  <link rel="icon" href="dog.ico">
</head>

<body>

  <section class="colored-section" id="title">

    <div class="container-fluid">


      <!-- Nav Bar -->


      <nav class="navbar navbar-expand-lg navbar-dark">

        <a class="navbar-brand" href="">tindog</a>
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
            <li class="nav-item">
              <a class="nav-link" href="cta">Download</a>
            </li>
          </ul>
        </div>

      </nav>


      <!-- Title -->

      <div class="row">

        <div class="col-md-6">
          <h1 class="big-heading">Meet new and interesting dogs nearby.</h1>
          <button type="button" class="btn btn-dark btn-lg download-button"><i class="fa-brands fa-apple"></i> Download</button>
          <button type="button" class="btn btn-outline-light btn-lg download-button"><i class="fa-brands fa-google-play"></i> Download</button>
        </div>

        <div class="img-poz col-md-6">
          <img class="title-image" src="images/iphone6.png" alt="iphone-mockup">
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
          <p>So easy to use, even your dog could do it.</p>
        </div>
        <div class="feature-box col-md-4">
          <i class="icon fa-solid fa-bullseye fa-4x"></i>
          <h3 class="feature-title">Elite Clientele</h3>
          <p>We have all the dogs, the greatest dogs.</p>
        </div>
        <div class="feature-box col-md-4">
          <i class="icon fa-solid fa-heart fa-4x"></i>
          <h3 class="feature-title">Guaranteed to work.</h3>
          <p>Find the love of your dog's life or your money back.</p>
        </div>
      </div>
    </div>
  </section>


  <!-- Testimonials -->

  <section class="colored-section" id="testimonials">

    <div id="testimonial-carousel" class="carousel slide" data-ride="false">
      <div class="carousel-inner">
        <div class="carousel-item active container-fluid">
          <h2 class="testimonial-text">I no longer have to sniff other dogs for love. I've found the hottest Corgi on TinDog. Woof.</h2>
          <img class="testimonial-image" src="images/dog-img.jpg" alt="dog-profile">
          <em>Pebbles, New York</em>
        </div>
        <div class="carousel-item container-fluid">
          <h2 class="testimonial-text">My dog used to be so lonely, but with TinDog's help, they've found the love of their life. I think.</h2>
          <img class="testimonial-image" src="images/lady-img.jpg" alt="lady-profile">
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


  <!-- Press -->

  <section class="colored-section" id="press">
    <img class="press-logo" src="images/techcrunch.png" alt="tc-logo">
    <img class="press-logo" src="images/tnw.png" alt="tnw-logo">
    <img class="press-logo" src="images/bizinsider.png" alt="biz-insider-logo">
    <img class="press-logo" src="images/mashable.png" alt="mashable-logo">

  </section>


  <!-- Pricing -->

  <section id="pricing">

    <section class="white-section" id="pricing">

      <h2 class="section-heading">A Plan for Every Dog's Needs</h2>
      <p>Simple and affordable price plans for your and your dog.</p>

      <div class="row">

        <div class="pricing-column col-md-4 col-sm-6">
          <div class="card">
            <div class="card-header">
              <h3>Chihuahua</h3>
            </div>
            <div class="card-body d-grid gap-2">
              <h2 class="price-text">Free</h2>
              <p>5 Matches Per Day</p>
              <p>10 Messages Per Day</p>
              <p>Unlimited App Usage</p>
              <p> <br> </p>
              <button class="btn btn-lg btn-outline-dark" type="button">Sign Up</button>
            </div>
          </div>
        </div>

        <div class="pricing-column col-md-4 col-sm-6">
          <div class="card">
            <div class="card-header">
              <h3>Labrador</h3>
            </div>
            <div class="card-body d-grid gap-2">
              <h2 class="price-text">$49 / mo</h2>
              <p>Unlimited Matches</p>
              <p>Unlimited Messages</p>
              <p>Unlimited App Usage</p>
              <p> <br> </p>
              <button class="btn btn-lg btn-dark" type="button">Sign Up</button>
            </div>
          </div>
        </div>

        <div class="pricing-column col-md-4">
          <div class="card">
            <div class="card-header">
              <h3>Mastiff</h3>
            </div>
            <div class="card-body d-grid gap-2">
              <h2 class="price-text">$99 / mo</h2>
              <p>Priority Listing</p>
              <p>Unlimited Matches</p>
              <p>Unlimited Messages</p>
              <p>Unlimited App Usage</p>
              <button class="btn btn-lg btn-dark" type="button">Sign Up</button>

            </div>
          </div>
        </div>
        



      </div>

    </section>
  </section>


  <!-- Call to Action -->

  <section class="colored-section" id="cta">

    <div class="container-fluid">



      <h3 class="big-heading">Find the True Love of Your Dog's Life Today.</h3>
      <button type="button" class="btn btn-dark btn-lg download-button"><i class="fa-brands fa-apple"></i> Download</button>
      <button type="button" class="btn btn-outline-light btn-lg download-button"><i class="fa-brands fa-google-play"></i> Download</button>

    </div>
  </section>


  <!-- Footer -->

  <footer class="white-section" id="footer">

    <div class="container-fluid">
      <i class="social-icon fa-brands fa-facebook"></i>
      <i class="social-icon fa-brands fa-twitter"></i>
      <i class="social-icon fa-brands fa-instagram"></i>
      <i class="social-icon fa-solid fa-envelope"></i>
      <p>� Copyright TinDog</p>

    </div>
  </footer>


</body>

</html>