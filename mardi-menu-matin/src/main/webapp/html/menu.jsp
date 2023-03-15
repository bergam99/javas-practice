
<style>

li {
  display: inline;
}

li {
  float: left;
}

a {
  display: block;
  padding: 8px;
  background-color: #dddddd;
}

ul {
  background-color: #dddddd;
}

</style>




<ul>
  <li><a href="./accueil">accueil</a></li>
  <li><a href="./catalogue">catalogue</a></li>
  <li><a href=<%= request.getContextPath() + "/contact" %>>contact</a></li>
  <li><a href="about.html">About</a></li>
</ul>


<br /><br />

	<ul class="ul-2">
	<form method=post>
	  <li  class="li-2">
	  	<input name='cat-Femme' type='submit' value='Femme' style='margin-right:5px;background-color:transparent;border:none;cursor:pointer;'>
	  </li>
	  <li  class="li-2">
	  	<input name='cat-Homme' type='submit' value='Homme' style='margin-right:5px;background-color:transparent;border:none;cursor:pointer;'>
	  </li>
	  <li  class="li-2">
	  	<input name='cat-Enfant' type='submit' value='Enfant' style='margin-right:5px;background-color:transparent;border:none;cursor:pointer;'>
	  </li>
	  </form>
	</ul>


