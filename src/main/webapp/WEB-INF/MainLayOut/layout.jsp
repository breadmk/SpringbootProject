<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- title을 개별 jsp에 있는 title로 적용한다. -->
<title>MK::<sitemesh:write property='title' /></title>

<!-- jQuery, BootStrap 웹 라이브러리를 등록 했으므로 url 적용되는 개별 jsp에 등록 금지 -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" 	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
header, footer {
	background: AntiqueWhite;
}
pre {
	background: white;
	border: 0px;
}
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}
/* Add a gray background color and some padding to the footer */
footer {
	background-color: #f2f2f2;
	padding: 25px;
}
.carousel-inner img {
	width: 100%; /* Set width to 100% */
	margin: auto;
	min-height: 200px;
}
/* Hide the carousel text when the screen is less than 600 pixels wide */
@media ( max-width : 600px) {
	.carousel-caption {
		display: none;
	}
}
.form-group{
	width:300px;
	
}
article {
	min-height:600px;
}
.container{
/* 	text-align: center; */
}
#containerDiv{
	text-align: center;
}
#welcome {
	color: grey;
	margin: 0 auto;
}
/* #nav{float:left;} */
/* #nav li a { display:block; width:100%; padding:10px 0;} */
/* #nav li a:hover { background:#eee; } */
</style>
<script type="text/javascript">
	$(document).ready(function() {
	});
</script>
<!-- 개별 jsp의 head 태그안에 있는 css, js를 넣어준다. -->
<sitemesh:write property='head' />
</head>
<body>
	<header>
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="/">MK-Mall</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">
						<li><a href="/board/list">일반게시판</a></li>
						<li><a href="/qna/list">질문답변</a></li>
						<li><a href="/image/list">이미지</a></li>
					</ul>
					<!-- 오른쪽에 위치하는 메뉴바 -->
					<ul class="nav navbar-nav navbar-right">
							<li><a href="/member/signup"><span class="glyphicon glyphicon-user"></span> 회원가입</a></li>
							<li><a href="/member/login"><span	class="glyphicon glyphicon-log-in"></span> Login</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<div class="container">
	
		<sitemesh:write property='body' />
	</div>
	<footer class="container-fluid text-center">
		<p>이 홈페이지의 저작권은 강민규에게 있습니다.</p>
	</footer>
</body>
</html>
