<jsp:include page="header.jsp" />
	<div class="container">
	<form method="post" action="Inscription">
		 <div class="form-group">
			<label for="inscription">Email: </label>
			<input type="text"  class="form-control" name="email1" id="email1" />
		</div>
		 <div class="form-group">
			<label for="pass">Mot de passe: </label>
			<input type="password"  class="form-control" name="pass1" id="pass1" />
		</div>
		<div class="form-group">
			<label for="pass">Mdp à nouveau: </label>
			<input type="password"  class="form-control" name="pass2" id="pass2" />
		</div>
		 <input type="submit" class="btn btn-default" value="Créer un Compte"></input>
	</form>
	</div>
<jsp:include page="footer.jsp" />
