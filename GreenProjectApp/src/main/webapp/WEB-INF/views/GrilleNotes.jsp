<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="scripts/javascript-traitement.js"></script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Grille notes</title>
	</head>
	
	<body>
	
	
			${utilisateur.nomUtilisateur}
	
	
	<ul>
	
   	<c:forEach items="${listCompetenceParFam}" var="famComp">
		
		<li> ${famComp[0].comptence.familleCompetence.nomFamille } </li>
		
	<div>
		<table class="table" border>
				<tr>
					<th colspan=2>${famComp[0].comptence.familleCompetence.nomFamille }</th>
					
				</tr>
				<c:forEach items="${famComp}" var="competence">


					<tr>
						<td>${competence.comptence.nomCompetence }</td>
						<td>${competence.valeurNote }</td>
						<td>${competence.commentaire }</td>
						
					</tr>
					
				</c:forEach>
			</table>	
	
	</div>
	

	</c:forEach>
	
	
	</ul>
			


	   
	</body>
	
	
	</html>
	