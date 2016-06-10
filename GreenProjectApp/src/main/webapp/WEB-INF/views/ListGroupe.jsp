<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>



<table>
		<tr>
			<th>NOMEquipe</th><th>ID SessionEquipe</th><th>IDEquipe</th>
		</tr>
		<c:forEach items="${listEquipes}" var="equipe">
			<tr>
				<td>${equipe.nomEquipe }</td>
				
			</tr>
		
		</c:forEach>
</table>

