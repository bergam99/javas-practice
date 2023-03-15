<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div style="text-align:center;">
	
	<% if(session.getAttribute("user") == null) { %>
		<form method=post>
		
			<label>login : </label><input name="txt-login" type="text"><br /><br />
			<label>pass : </label><input name="txt-pass" type="password"><br /><br />
			<button type="submit">connexion</button>
		
		</form><br />
	<% } else {%>
	
	<p>utilisateur <%= session.getAttribute("login") %> est connecté</p><br /><br />
	
	
	<form method=post>
	<button type="submit" name="deco" style="background-color: transparent;cursor:pointer;border:none;">deconnection</button>
	</form>
	
	<% } %>
	
	</div>
	
	
</body>
</html>