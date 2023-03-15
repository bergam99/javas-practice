<div style="width:100%; height:30px; justify-content:space-between; display:flex;">

	<span></span><br />

	<form method="post" style="display:flex;">
		<span style="display: inline-flex;align-items: center;">login</span>
			<input name="login-connexion" type=text value= '<%= session.getAttribute("login") %>' style="margin: 0 8px;"/><br /><br />
		<span style="display: inline-flex;align-items: center;"> pass</span>
			<input name="pass-connexion" type=password style="margin:0 8px;" /><br /><br />
		<button type="submit" class="btn-connexion">connexion</button><br /><br />
	</form>
	
</div>
<br />