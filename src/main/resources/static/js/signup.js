window.onload = function() {
	let chk = document.getElementById("chk1");
	$("#chk1").change(function(){
		if($("#chk1").is(":checked")){
			$("#chk1").val("y");
		}else{
			$("#chk1").val("n");
			
		}
	});
	
	$("#chk2").change(function(){
		if($("#chk2").is(":checked")){
			$("#chk2").val("y");
		}else{
			$("#chk2").val("n");
		}
	});
	
	
	let btn = $("#temsBtn");
	btn.click(function(e){
		if($("#chk1").val()=='n' || $("#chk2").val()=='n'){
			$("#errMsg").text("필수 약관에 모두 동의해 주세요");
			e.preventDefault();
		}else{
			return true;
		}
	});
};





