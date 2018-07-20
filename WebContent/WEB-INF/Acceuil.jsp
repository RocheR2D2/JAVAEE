<jsp:include page="header.jsp" />
	
	<div class="container">
		
		<form method="post" action="homeServelet">	
			<div class="row">
				<div class = "col-xs-2">
					<label class="text-center">
						<p><b>Url à<br>raccourcir</b></p>
					</label>
				</div>
				<div class = "col-xs-7">
					<div class="panel panel-default" >
					     <div class="panel-body text-center" style="padding:8px;"><input name="fullurl"  type="url" class="form-control" id="comment"></input></div>
					</div>
				</div>
				
				<div class = "col-xs-3">
					<div class="panel panel-info">
					    <div class="panel-body text-center"><button type="submit">Raccourir</button></div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2"></div>
				<div class="col-xs-5" style="padding-top:5px">
					<input  onclick="displayMdp()" type="checkbox" name="check1" id="check1">
					<label for="check1" class="input-label">Sécurisée avec mot de passe</label>
				</div>
				<div class = "col-xs-5">
					<div class="panel panel-default" style="display:none" id="panel_mdp1">
					     <div  class="panel-body text-center" style="padding:8px;"><input name="mdp1"  type="text" class="form-control" id="mdp1"></input></div>
					</div>
				</div>
			</div>
			<p class="text-center" style="color:black">Créer un compte pour voir nos autres options possibles</p>
		</form>
	</div>
	
<jsp:include page="footer.jsp" />
