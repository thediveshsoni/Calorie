<%@page import="javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>

  <title></title>
  <link rel="stylesheet" type="text/css" href="bootstrap.css">
  <link rel="stylesheet" type="text/css" href="semantic.css">
  <link rel="stylesheet" href="sliderResponsive.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark bg-success navbar fixed-top" style="margin-top: px;"  >
<div class="container-fluid">
  <a class="navbar-brand  " style="font-size: 35px;"  href="#">FarmBuss</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav " >
      <li class="nav-item active ">
        <a class="nav-link " href="home1.html">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item text-primary">
        <a class="nav-link" href="">Business Market</a>
      </li>
      <li class="nav-item text-primary">
        <a class="nav-link" href="Producer.html">Producer Market</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Culnary</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Health</a>
      </li>
      <li class=" nav-item dropdown">
        <a class=" nav-link  dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Farmers HUb
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="#">Advanced tools</a>
          <a class="dropdown-item" href="#">Advanced Technologies</a>
          <a class="dropdown-item" href="#">Insurance Scehmes</a>
        </div>
      </li>
    </ul>
      <div>
          <div style="margin-right: 20px; margin-left:360px; padding-top: 15px;">
          <form class="navbar-form navbar-right form-inline ">
                     <div class="container">
                      <div class="row">
                       <div class="col-md-6 mb-3">
      <div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Log in
  </button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item" href="#">Farmer</a>
    <a class="dropdown-item" href="#">Business</a>
    
  </div>
</div>
      
    </div>
                   <div class="col-md-6 mb-3">
                   <div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Sign up
  </button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item" href="#">Farmer</a>
    <a class="dropdown-item" href="#">business</a>
    
  </div>
</div>
     
    </div>


                     </div>
                     </div>

                    </form>
</div>
    </div>
  </div>
  </div>
</nav>

<div class="row " style="margin-top: 150px;  margin-left: 50px;" >
<div class="col-md-3">
<div class="ui statistic">
  <div class="label">
    Goal
  </div>
  <div class="value">
  <% int s=(int)session.getAttribute("a");
  
  out.println(s);
  
  %> 
   

  </div>
</div>
</div>

<div class="col-md-1">
<h1 style="font-size: 40px">-</h1>

</div>





<div class="col-md-3">
<div class="ui statistic">
  <div class="label">
  food
  </div>
  <div class="value">
   <%
   
 
   
    %>
  </div>
</div>
</div>



<div class="col-md-1">
<h1 style="font-size: 40px">=</h1>

</div>






<div class="col-md-3">
<div class="ui statistic">
  <div class="label">
    remaning
  </div>
  <div class="value">

  </div>
</div>
</div>
</div>

<h4 style="text-align: center;">breakfast</h4>
<form action="CalorieCount" method="GET">
<div class=" container" style="margin-top: 60px;"> 
<div class="row">
<div class="col-md-3">


 <div class="field">
        	Breakfast:<select name="breakfast1" id="breakfast">
	<option value="1">Egg Bolied</option>
	<option value="2">Egg fried</option>
	<option value="3">Egg Omlet</option>
	<option value="4">Paratha</option>
	<option value="5">Bread with Butter</option>
	<option value="6">Bread</option>
	<option value="7">Coffee</option>
	<option value="8">Tea</option>
	</select>

</div>
 <div class="form-group mx-3 mt-4">
    <label for="inputPassword2" class="sr-only">quantity</label>
    <input type="text" class="form-control" name="b1" id="inputPassword2" placeholder="Quantity">
  </div>
 
</div>









<div class="col-md-3">
<div class="field">
         	Breakfast:<select name="breakfast2" id="breakfast">
	<option value="1">Egg Bolied</option>
	<option value="2">Egg fried</option>
	<option value="3">Egg Omlet</option>
	<option value="4">Paratha</option>
	<option value="5">Bread with Butter</option>
	<option value="6">Bread</option>
	<option value="7">Coffee</option>
	<option value="8">Tea</option>
	</select>

</div>
<div class="form-group mx-sm-3 mt-4">
    <label for="inputPassword2" class="sr-only">quantity</label>
    <input type="text" class="form-control"  name="b2" id="inputPassword2" placeholder="Quantity">
  </div>
</div>


<div class="col-md-3">




 <div class="field">
          	Breakfast:<select name="breakfast3" id="breakfast">
	<option value="1">Egg Bolied</option>
	<option value="2">Egg fried</option>
	<option value="3">Egg Omlet</option>
	<option value="4">Paratha</option>
	<option value="5">Bread with Butter</option>
	<option value="6">Bread</option>
	<option value="7">Coffee</option>
	<option value="8">Tea</option>
	</select>

</div>
<div class="form-group mx-sm-3 mt-4">
    <label for="inputPassword2" class="sr-only">quantity</label>
    <input type="text" class="form-control" name="b3" id="inputPassword2" placeholder="Quantity">
  </div>
</div>
</div>



<input type="submit" value="submit">
</form>







<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="jquery.scrollbox.js"></script>
<script type="text/javascript" src="semantic.js"></script>
<script type="text/javascript"  src="sliderResponsive.js"></script>

</body>




</html>

