<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouts de clients</title>
</head>
<body>

	<h1>Formulaire d'ajout d'un client</h1>
	<form action="${pageContext.request.contextPath}/ajoutClient"
		method="POST">
		<label for="code">Code Client</label> <input type="text" id="code"
			name="code" value="code"> <label for="prenom">Prénom
			Client</label> <input type="text" id="prenom" name="prenom" value="prenom">
		<label for="nom">Nom Client</label> <input type="text" id="nom"
			name="nom" value="nom"> <label for="age">Age Client</label> <input
			type="text" id="age" name="age" value="age"> <label
			for="email">email Client</label> <input type="email" id="email"
			name="email" value="votre email"> <label for="mdp">mot
			de passe Client</label> <input type="text" id="mdp" name="mdp"
			value="mot de passe"> <label for="tel">Téléphone
			Client</label> <input type="text" id="tel" name="tel" value="Téléphone">
		<label for="adresse">Adresse Client</label> <input type="text"
			id="adresse" name="adresse" value="adresse"> <label for="cp">Code
			Postal Client</label> <input type="text" id="cp" name="cp" value="cp">
		<label for="ville">Ville Client</label> <input type="text" id="ville"
			name="ville" value="ville"> <label for="pays">Pays
			Client</label> <input type="text" id="pays" name="pays" value="pays">

		<input type="submit" value="Ajouter" />
	</form>

</body>
</html>