<jsp:include page="header.jsp" />

	<form method="post" action="test2">
		 <div class="form-group">
			<label for="login">Nom: </label>
			<input type="text"  class="form-control" name="nom" id="nom" />
		</div>
		 <div class="form-group">
			<label for="pass">Mot de passe: </label>
			<input type="text"  class="form-control" name="pass" id="pass" />
		</div>
		 <button type="submit" class="btn btn-default">Submit</button>
	</form>
	
<jsp:include page="footer.jsp" />
