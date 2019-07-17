
function checkform(form){
	var inputs = document.getElementByTagName('input');
	for(var i = 0; i<inputs.length; i++){
		if(inputs[i].hasAttribute("required")){
			if(inputs[i].value==""){
				alert("please fill all the required field");
				return false;
			}
		}
	}
	return true;

}

