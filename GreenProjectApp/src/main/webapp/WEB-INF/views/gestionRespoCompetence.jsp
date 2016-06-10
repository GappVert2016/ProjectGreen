<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
<title>Insert title here</title>
</head>

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
  </style>
</head>
<body>

<%@ include file="headerRespo.jsp" %>
<div class="container text-center">    
  <div class="row">
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
	</div>
</div><br>
<div class="container text-center"> 

<h2>Gestion des competences</h2>
  <form:form class="form-horizontal" role="form" modelAttribute="competenceForm" method="POST" action="saveCompetence">
    
    <div class="form-group">
      <label class="control-label col-sm-2" >Id:</label>
      <div class="col-sm-10">
        <form:input class="form-control" path="idCompetence" placeholder=""></form:input>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" >Nom Competence:</label>
      <div class="col-sm-10">          
        <form:input class="form-control" path="nomCompetence" ></form:input>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" >Nom Famille:</label>
      <div class="col-sm-10">          
        <form:select class="form-control" path="familleCompetence.idFamille" items="${listFamComps}" itemValue="idFamille" itemLabel="nomFamille"></form:select>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Sauvegarder</button>
      </div>
    </div>
  </form:form>
</div><br>
<div class="container text-center">
  <table class="table">
    <thead>
      <tr>
        <th>Nom competence</th>
        <th>Nom Famille</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${listCompetences}" var="assignations">
			<tr class=" info">
			<td>${assignations.nomCompetence }</td>
			<td>${assignations.familleCompetence.nomFamille }</td>
			<td><a href="suppCompetence?idCompetence=${assignations.idCompetence }">Supprimer</a></td>		
			<td><a href="editCompetence?idCompetence=${assignations.idCompetence }">Modifier</a></td>
			
			</tr>		
		</c:forEach>
    </tbody>
  </table>
</div>  

<%@ include file="footer.jsp" %>


</body>
</html>