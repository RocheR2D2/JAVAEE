<jsp:include page="header.jsp" />
	<div class="container">
	<form method="post" action="Connexion">
		 <div class="form-group">
			<label for="inscription">Email: </label>
			<input type="text"  class="form-control" name="email0" id="email0" />
		</div>
		 <div class="form-group">
			<label for="pass">Mot de passe: </label>
			<input type="password"  class="form-control" name="pass0" id="pass0" />
		</div>
		 <input type="submit" class="btn btn-default" value="Connecter"></input>
	</form>
	</div>
<jsp:include page="footer.jsp" />
