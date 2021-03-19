function insert(){
	location.href="/board/insert";
}

$(function(){
	$(".rowLine").click(function(){
		var no = $(this).find("#no").text();
		location.href="/board/content?no="+no;
		
	})
})