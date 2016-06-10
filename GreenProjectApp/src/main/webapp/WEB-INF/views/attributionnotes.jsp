<!DOCTYPE html>
<html>
<head>
	<spring:url value="/resources/css/attributionnotes.css" var="cssSpec" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href=${cssSpec}>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<title>Mockup Formulaire attribution notes</title>
</head>
<body>
	<form>
	<h2>Elève #1</h2>
	<a href=""><b>Equipe #3</a> :</b> Elève #1, <a href="">Elève #2</a>, <a href="">Elève #3</a>
	<ul>
		<li>
			<h3 class="famille-intitule" id="famille-intitule1">Famille de compétences #1</h3>
			<div class="liste-comp" id="liste-comp1">
				<table>
					<tr>
						<td></td>
						<td>Note</td>
						<td>Commentaire</td>
					</tr>
					<tr>
						<td>Compétence #1A</td>
						<td><input type="range" min="1" max="5" step="1" name="noteComp1A"/></td>
						<td><input type="text" name="commentaireComp1A"></td>
					</tr>
					<tr>
						<td>Compétence #1B</td>
						<td><input type="range" min="1" max="5" step="1" name="noteComp1B"/></td>
						<td><input type="text" name="commentaireComp1B"></td>
					</tr>
					<tr>
						<td>Compétence #1C</td>
						<td><input type="range" min="1" max="5" step="1" name="noteComp1C"/></td>
						<td><input type="text" name="commentaireComp1C"></td>
					</tr>
				</table>
			</div>
		</li>
		<li>
			<h3 class="famille-intitule" id="famille-intitule2">Famille de compétences #2</h3>
			<div class="liste-comp" id="liste-comp2">
				<table>
					<tr>
						<td></td>
						<td>Note</td>
						<td>Commentaire</td>
					</tr>
					<tr>
						<td>Compétence #2A</td>
						<td><input type="range" min="1" max="5" step="1" name="noteComp2A"/></td>
						<td><input type="text" name="commentaireComp2A"></td>
					</tr>
					<tr>
						<td>Compétence #2B</td>
						<td><input type="range" min="1" max="5" step="1" name="noteComp2B"/></td>
						<td><input type="text" name="commentaireComp2B"></td>
					</tr>
					<tr>
						<td>Compétence #2C</td>
						<td><input type="range" min="1" max="5" step="1" name="noteComp2C"/></td>
						<td><input type="text" name="commentaireComp2C"></td>
					</tr>
				</table>
			</div>
		</li>
	</ul>
	<input type="submit" name="Terminer"/>
	</form>
</body>
	<script>
		//A déplacer dans un meilleur endroit à terme,
		//peut être utile pour d'autres pages
		function toggleDisplay(e) {
			$(e.data).toggle();
			console.log("+");
		}
		
		$(".liste-comp").toggle();
		$("#famille-intitule1").click("#liste-comp1", toggleDisplay);
		$("#famille-intitule2").click("#liste-comp2", toggleDisplay);
	</script>
</html>