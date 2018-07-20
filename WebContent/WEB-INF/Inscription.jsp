<jsp:include page="header.jsp" />

	<form method="post" action="test2">
		 <div class="form-group">
			<label for="inscription">Nom: </label>
			<input type="text"  class="form-control" name="nom1" id="nom" />
		</div>
		 <div class="form-group">
			<label for="pass">Mot de passe: </label>
			<input type="text"  class="form-control" name="pass1" id="pass" />
		</div>
		<div class="form-group">
			<label for="pass">Mdp à nouveau: </label>
			<input type="text"  class="form-control" name="pass2" id="pass" />
		</div>
		 <button type="submit" class="btn btn-default">Submit</button>
	</form>
	
<jsp:include page="footer.jsp" />
