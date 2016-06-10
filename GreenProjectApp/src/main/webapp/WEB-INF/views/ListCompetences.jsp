
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
	
<!-- 	<table>
		<tr>
			<th>ID</th><th>NOM SESSIONAPP</th><th>DESCRIPTION</th>
		</tr>
		<c:forEach items="${competences}" var="cmp">
			<tr>
				<td>${cmp.idCompetence }</td>
				<td>${cmp.bloqueCompetence }</td>
				<td>${cmp.coefficient }</td>
				<td>${cmp.descriptionCompetence }</td>
				<td>${cmp.nomCompetence }</td>
				<td>${cmp.familleCompetence.idFamille }</td>
			</tr>
		
		</c:forEach>
	</table>
	
		<table>
		<tr>
			<th>ID</th><th>NOM SESSIONAPP</th><th>DESCRIPTION</th>
		</tr>
		<c:forEach items="${familleCompetences}" var="fcmp">
			<tr>
				<td>${fcmp.idFamille }</td>
				<td>${fcmp.nomFamille }</td>
			</tr>
		
		</c:forEach>
	</table>
	
  	<p>${famille1.nomFamille }</p>  
	
<table>	<c:forEach items="${familleC1}" var="familleC1">
			<tr>
				<td>${familleC1.idCompetence }</td>
				<td>${familleC1.bloqueCompetence }</td>
				<td>${familleC1.coefficient }</td>
				<td>${familleC1.descriptionCompetence }</td>
				<td>${familleC1.nomCompetence }</td>
				<td>${familleC1.familleCompetence.idFamille }</td>			
				<td><a href="suppFam?idCompetence=${familleC1.idCompetence }">Supp</a></td>
			</tr>
		
		</c:forEach>
</table>	

  	<p>${famille2.nomFamille }</p>  

<table>	<c:forEach items="${familleC2}" var="familleC2">
			<tr>
				<td>${familleC2.idCompetence }</td>
				<td>${familleC2.bloqueCompetence }</td>
				<td>${familleC2.coefficient }</td>
				<td>${familleC2.descriptionCompetence }</td>
				<td>${familleC2.nomCompetence }</td>
				<td>${familleC2.familleCompetence.idFamille }</td>
			</tr>
		
		</c:forEach>
</table>  -->
	</body>
</html>