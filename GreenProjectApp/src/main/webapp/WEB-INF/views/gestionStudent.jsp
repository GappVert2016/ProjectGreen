<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<table>
<tr>

<th>nomUtilisateur</th><th>note</th><th>commentaire</th> <th>famillescompetences </th> 
<th>compentences</th>
</tr>
<c:forEach items="${notes}" var="note">
<tr>
   <td>${note.utilisateur.nomUtilisateur}</td>
<td>${note.valeurNote}</td>
<td>${note.commentaire }</td>
<td>${note.comptence.familleCompetence.nomFamille }</td>
<td>${note.comptence.nomCompetence }</td>



<td>${sas.prenomUtilisateur }</td>
</tr>

</c:forEach>
</table>
</div>

</body>
</html>