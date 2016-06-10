<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

	<table>
			<tr>
				<th>ID</th><th>email</th><th>idLDAP</th>
				<th>nomUtilisateur</th><th>prenomUtilisateur</th><th>role</th>
			</tr>
			<c:forEach items="${utilisateurs}" var="sas">
				<tr>
					<td>${sas.idUtilisateur }</td>
					<td>${sas.email }</td>
					<td>${sas.nomUtilisateur }</td>
					<td>${sas.prenomUtilisateur }</td>
				</tr>
			
			</c:forEach>
		</table>
	
	
	<table>
		<tr>
			<th>idEquipe</th><th>nomEquipe</th><th>nomSessionApp</th>
		</tr>
		<c:forEach items="${listEquipes}" var="equipe">
			<tr>
				<td>${equipe.idEquipe }</td>
				<td>${equipe.nomEquipe }</td>
				<td>${equipe.sessionApp.idApp }</td>
				
				
			</tr>
		
		</c:forEach>
		
</table>

 
	<table>
		<tr>
			<th>idEquipe</th><th>nomEquipe</th><th>nomSessionApp</th>
		</tr>
		<c:forEach items="${assignation}" var="asssignation">
			<tr>
				<td>${asssignation.idAssignationsEquipe }</td>
				<td>${asssignation.equipe.idEquipe }</td>
				<td>${asssignation.utilisateur.nomUtilisateur }</td>
				
				
			</tr>
		
		</c:forEach>
		
</table>

<!--    		<p>${groupe.nomEquipe }</p> 
<c:forEach var="i" begin="1" end="5">
   Item <c:out value="${i}"/><p>
</c:forEach>
 -->	

<c:forEach var="i" begin="1" end="5">
   Item <p>
	
	<table>
		<tr>
			<th>idEquipe</th><th>nomEquipe</th><th>nomSessionApp</th>
		</tr>
		<c:forEach items="${utilisateurGroupe<c:out value=${i}/>}" var="utilisateurGroupe">
			<tr>
				<td>${utilisateurGroupe.equipe.idEquipe }</td>
				<td>${utilisateurGroupe.equipe.nomEquipe }</td>
				<td>${utilisateurGroupe.utilisateur.idUtilisateur }</td>
				<td>${utilisateurGroupe.utilisateur.email }</td>
				<td>${utilisateurGroupe.utilisateur.nomUtilisateur }</td>
				<td>${utilisateurGroupe.utilisateur.prenomUtilisateur }</td>
			</tr>
		
		</c:forEach>
		
		
		
	</table>

</c:forEach>

		 







