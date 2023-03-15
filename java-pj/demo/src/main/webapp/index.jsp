<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="Entity.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	
	<% if(session.getAttribute("currentUser") == null) { %>
	<%@ include file = "disconnect.jsp" %>
	<% } else { %>
	
	<div style="width:98%; text-align: right;">
	<span>Utilisateur <strong>

	<%= session.getAttribute("login") %>
	</strong> connecté</span><br />
	<span style="font-style:italic;">
	<form method=post>
	<button type="submit" name="disconnect" style="background-color: transparent;border: 1px solid transparent;cursor:pointer;color:blue;">se déconnecter</button>
	</form>
	<br/>
	</div><br />
	
	<% } %>

	<!-- je recupere l'attribut de la request dans une liste -->
	<% ArrayList<Product> store = new ArrayList<>();
		store = (ArrayList<Product>) request.getAttribute("store");
	%>
	
	<!-- je verifie si la liste n'est pas vide -->
	<% if(store != null) { %>
	
	<!-- je boucle dessus pour recuperer chaque produit -->
	<% for(int i = 0; i < store.size() ; i++) { %>

	<div style="width:80%; height:150px; border: solid 1px black; margin: 60px auto 0 auto;display:flex;">
	
		<div style="width:20%; height:100px; border: solid 1px red; margin-right: 20px;display:block;margin-top:20px;margin-left:20px;text-align:center;">
			
			<!-- je recupere les attributs grace aux getters de la class produit pour les affichers dans une balise -->
			<span><%= store.get(i).getName() %></span><br />
			<p><%= store.get(i).getPrice() %> €</p>
		</div>
		
		<!-- ici l'attribut description avec le getter de la class produit -->
		<div style="width:75%; height:100px; border: solid 1px red; margin-right: 20px;margin-top:20px;margin-left:20px;text-align:center;">
			<p><%= store.get(i).getDescription() %></p><br />
		</div>
	
	</div>
	
	<% } %>
	
	<!-- sinon je n'ai pas de produit -->
	<% } else { %>
	<div style="text-align:center;">
	<span>produit indisponible... refaite votre recherche</span>
	</div>
		<% } %>

 
</body>
</html>