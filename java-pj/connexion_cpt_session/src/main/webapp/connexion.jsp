<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Entity.*" %>
<%@ page import="java.util.*" %>


<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>accueil</title>
</head>

<body>

	<h1 align="center">connexion réussie : <%= session.getAttribute("login") %></h1>

</body>

</html>