<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>

<body align="center">

	<h1>Bienvenue</h1>
	
	<h2>connexion</h2><br />
	
	<form method="post">
		<span>login : </span><input name="login" type=text value= '<%= request.getAttribute("login") %>' /><br /><br />
		<span> pass : </span><input name="pass" type=password value= '' /><br /><br />
		<button type="submit">connexion</button><br /><br />
	</form>

	<br /><br />
	
	



</body>
</html>

