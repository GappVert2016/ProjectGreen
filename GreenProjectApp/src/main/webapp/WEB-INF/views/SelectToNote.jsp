<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="scripts/javascript-traitement.js"></script>
<title>Fiche détaillée des notes</title>
</head>

<body>
<div class="container">

<div class="align-select">
	<select id="mySelect">

		<option value=''>------ Choix du groupe -----</option>

		<c:forEach items="${listEquipes}" var="equipe">
			<option value=${equipe }>${equipe }</option>
		</c:forEach>

	</select>
</div>

	<c:forEach items="${listElevesParGroupe}" var="eleveL">
		<div id="${eleveL[0].equipe.nomEquipe }" class="div-equipe">
			<table class="table" border>
				<tr>
					<th colspan=3 style="text-align: center">${eleveL[0].equipe.nomEquipe }</th>
				</tr>
				<tr>
					<th>Nom</th>
					<th>Prenom</th>
					<th></th>
				</tr>
				<c:forEach items="${eleveL}" var="eleve">


					<tr>
						<td>${eleve.utilisateur.nomUtilisateur }</td>
						<td>${eleve.utilisateur.prenomUtilisateur }</td>
						<td>
							<a href="noter?idUtilisateur=${eleve.utilisateur.idUtilisateur }">Noter</a>
								|
							<a href="grilleNotes?idUtilisateur=${eleve.utilisateur.idUtilisateur }">Consulter
								Notes</a>
						</td>
					</tr>



				</c:forEach>
				<tfoot>
					<tr>
						<th COLSPAN=5 style="text-align: center;"><a
							href="noter?idEquipe=${eleveL[0].equipe.idEquipe }">Noter le
								Groupe</a><a
							href="grilleNotes?idUEquipe=${eleveL[0].equipe.idEquipe  }">Consulter
								Notes du Groupe</a></th>
					</tr>
				</tfoot>
			</table>
		</div>

	</c:forEach>


</div>
	<!-- 
	<div id="GoupeA2" class="competences table-responsive">

		<table class="table">
			<tr>
				<th>Nom</th>
				<th>Prenom</th>
				<th>NomEquipe</th>
				<th>IDEquipe</th>
				<th>IDEquipeAss</th>
			</tr>
			<c:forEach items="${listElevesParGroupe2}" var="eleve">
				<tr>
					<td>${eleve.utilisateur.nomUtilisateur }</td>
					<td>${eleve.utilisateur.prenomUtilisateur }</td>
					<td>${eleve.equipe.nomEquipe }</td>
					<td>${eleve.equipe.idEquipe }</td>
					<td><a href="">Noter</a></td>
				</tr>

			</c:forEach>
		</table>

	</div>

	<div id="GoupeA3" class="competences table-responsive">


		<table class="table">
			<tr>
				<th>Nom</th>
				<th>Prenom</th>
				<th>NomEquipe</th>
				<th>IDEquipe</th>
				<th>IDEquipeAss</th>
			</tr>
			<c:forEach items="${listElevesParGroupe3}" var="eleve">
				<tr>
					<td>${eleve.utilisateur.nomUtilisateur }</td>
					<td>${eleve.utilisateur.prenomUtilisateur }</td>
					<td>${eleve.equipe.nomEquipe }</td>
					<td>${eleve.equipe.idEquipe }</td>
					<td><a href="">Noter</a></td>
				</tr>

			</c:forEach>
		</table>

	</div>

	<div id="GoupeA4" class="competences table-responsive">

		<table class="table">
			<tr>
				<th>Nom</th>
				<th>Prenom</th>
				<th>NomEquipe</th>
				<th>IDEquipe</th>
				<th>IDEquipeAss</th>
			</tr>
			<c:forEach items="${listElevesParGroupe4}" var="eleve">
				<tr>
					<td>${eleve.utilisateur.nomUtilisateur }</td>
					<td>${eleve.utilisateur.prenomUtilisateur }</td>
					<td>${eleve.equipe.nomEquipe }</td>
					<td>${eleve.equipe.idEquipe }</td>
					<td><a href="">Noter</a></td>
				</tr>

			</c:forEach>
		</table>

	</div>

	<div id="GoupeA5" class="competences table-responsive">

		<table class="table">
			<tr>
				<th>Nom</th>
				<th>Prenom</th>
				<th>NomEquipe</th>
				<th>IDEquipe</th>
				<th>IDEquipeAss</th>
			</tr>
			<c:forEach items="${listElevesParGroupe5}" var="eleve">
				<tr>
					<td>${eleve.utilisateur.nomUtilisateur }</td>
					<td>${eleve.utilisateur.prenomUtilisateur }</td>
					<td>${eleve.equipe.nomEquipe }</td>
					<td>${eleve.equipe.idEquipe }</td>
					<td><a href="">Noter</a></td>

				</tr>

			</c:forEach>
		</table>

	</div>

	<div id="GoupeA6" class="competences table-responsive">

		<table class="table">
			<tr>
				<th>Nom</th>
				<th>Prenom</th>
				<th>NomEquipe</th>
				<th>IDEquipe</th>
				<th>IDEquipeAss</th>
			</tr>
			<c:forEach items="${listElevesParGroupe6}" var="eleve">
				<tr>
					<td>${eleve.utilisateur.nomUtilisateur }</td>
					<td>${eleve.utilisateur.prenomUtilisateur }</td>
					<td>${eleve.equipe.nomEquipe }</td>
					<td>${eleve.equipe.idEquipe }</td>
					<td><a href="">Noter</a></td>

				</tr>

			</c:forEach>
		</table>

	</div>


	<div id="GoupeA7" class="competences table-responsive">

		<table class="table">
			<tr>
				<th>Nom</th>
				<th>Prenom</th>
				<th>NomEquipe</th>
				<th>IDEquipe</th>
				<th>IDEquipeAss</th>
			</tr>
			<c:forEach items="${listElevesParGroupe7}" var="eleve">
				<tr>
					<td>${eleve.utilisateur.nomUtilisateur }</td>
					<td>${eleve.utilisateur.prenomUtilisateur }</td>
					<td>${eleve.equipe.nomEquipe }</td>
					<td>${eleve.equipe.idEquipe }</td>
					<td><a href="">Noter</a></td>

				</tr>

			</c:forEach>
		</table>


	</div>
-->

</body>
</html>

<style>

.container{
margin:10px 10px;

}
.clearfix {
clear: both;
}
.align-select{
margin:auto;
margin-bottom:50px;
text-align:center;
}
.div-equipe{
display: none;
}

@media only screen and (max-width: 950px) {
}

@media only screen and (min-width: 950px) {
	.competences {
		width: 70%;
		margin-right: 5%;
		margin-left: 5%;
		margin-top: 50px;
		
	}
	
}
	
</style>


<script type="text/javascript">
	var value = '';
	$('#mySelect').on('change', function() {
		$('#' + value).css("display", "none");
		value = $(this).val();
		$('#' + value).css("display", "block");
	});
</script>
