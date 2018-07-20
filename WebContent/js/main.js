$(document).ready(function(){
	if( $('input[name=checkbox1]').is(':checked') ){
	    alert("jQuery c'est super");
	} 
});

function displayMdp() {
	  // Get the checkbox
	  var checkBox = document.getElementById("check1");
	  // Get the output text
	  var panel = document.getElementById("panel_mdp1");

	  // If the checkbox is checked, display the output text
	  if (checkBox.checked == true){
		  panel.style.display = "block";
	  } else {
		  panel.style.display = "none";
	  }
	}