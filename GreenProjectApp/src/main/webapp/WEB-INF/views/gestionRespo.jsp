<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/bootstrap/bootstrap-3.3.6-dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/bootstrap/bootstrap-3.3.6-dist/css/bootstrap-theme.min.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-1.12.3.min.js"> </script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/bootstrap/bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
<title>Gapp</title>
<style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 20px;
    }
    
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:750px;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; 
    }
  }
  #searchForm {
	position:absolute;
  	top:40%;
}
h1 {
	position:absolute;
  	top:10%;
}
  </style>
</head>
<body>

<%@ include file="headerStudent.jsp" %>

<div class="container text-center">    
  <div class="col-xs-20 col-md-12">
			<ul class="nav nav-justified">
				<li><h4 class="lead"><a href="indexUtilisateur">UTILISATEURS</a></h4></li>
				<li><h4 class="lead"><a href="indexSession">SESSIONS</a></h4></li>
				<li><h4 class="lead"><a href="indexComp">COMPETENCES</a></h4></li>
				<li><h1><strong class="glyphicon glyphicon-education"></strong></h1></li>
				<li><h4 class="lead"><a href="indexAssign">ASSIGNATIONS</a></h4></li>
				<li><h4 class="lead"><a href="indexFamComp">FAMILLES</a></h4></li>
				<li><h4 class="lead"><a href="indexEquipe">EQUIPES</a></h4></li>
			</ul>
		</div>	
</div><br>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="<%=request.getContextPath()%>/resources/img/h3.jpg" alt="Image">
        <div class="carousel-caption">
          <h3>Sell $</h3>
          <p>Money Money.</p>
        </div>      
      </div>

      <div class="item">
        <img src="<%=request.getContextPath()%>/resources/img/h2.jpg"alt="Image">
        <div class="carousel-caption">
          <h3>More Sell $</h3>
          <p>Lorem ipsum...</p>
        </div>      
      </div>
    </div>
    <div class="container text-center">
    	
    	<h1>Beinvenue sur L'administration GAPP</h1>
    </div>
    <form class="col-sm-12" id="searchForm">
    <div class="form-group col-sm-4 col-sm-offset-4">
      <div class="input-group input-group-lg center-block">
        <input type="text" class="form-control" placeholder="Search">
        <span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span>
      </div>
    </div>
  </form>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>

<%@ include file="footer.jsp" %>

</body>
</html>