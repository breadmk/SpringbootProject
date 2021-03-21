function list(){
	location.href="/board/list";
}

function update(){
	var no = $("#no").val();
	location.href="/board/update?no="+no;
}

function deletechk(){
	var no = $("#no").val();
	location.href="/board/delete?no="+no;
}