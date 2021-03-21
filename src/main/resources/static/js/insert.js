$(document).ready(function() {
	  $('#summernote').summernote({
 	    	placeholder: 'content',
	        minHeight: 370,
	        maxHeight: null,
	        focus: true, 
	        lang : 'ko-KR'
	  });
	
	$("#directInput").hide();
	$("#selbox").change(function(){
		if($("#selbox").val()=="1"){
			$("#directInput").show();
		}else{
			$("#directInput").hide();
		}
	});
	});