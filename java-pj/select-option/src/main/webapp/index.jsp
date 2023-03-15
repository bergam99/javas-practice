<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<% 
		ArrayList<String> p = new ArrayList<>();
		p = (ArrayList<String>) request.getAttribute("products");
		
		if(p != null) {
	%>
		<div>
		<h1><%=p.get(0) %></h1>
		</div>
		<br /><br />
	
	<% } else { %>
		
		<p> pas de produits disponible </p>
		<br /><br />
	
	<% } %>

	<form method=get id='my-form'>

	    <select id="isTitles" name="select" onchange="return setValue();">
	        <option value="categorie 1" id='cat' >categorie 1</option>
	        
	        <option value="categorie 2" >categorie 2</option>
	        
	        <option value="categorie 3" >categorie 3</option>
	        
	        <option value="categorie 4" >categorie 4</option>
	        
	    </select> 
	    
	    <button type="submit">click</button>
	</form>


	<script src="script.js"></script>

</body>
</html>