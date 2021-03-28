<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<div class="title"><h1>국비정보 교류</h1></div>
<link rel="stylesheet" href="/static/css/signup.css">

<form action="/member/loginOk" method="post">
	<fieldset class="join">
		<legend>회원가입</legend>
		<h3><label for="id">아이디</label></h3>
		<div class="field"><input type="text" name="id" maxlength="12" placeholder="아이디" class="input" /></div>
		<div class="field errMsg"></div>
		<h3><label for="pw">비밀번호</label></h3>
		<div class="field"><input type="password" name="pw" maxlength="12" placeholder="비밀번호" class="input" /></div>
		<div class="joininput"><input type="submit" id="login" value="로그인"></div>
	</fieldset>
</form>
<script src="/static/js/signok.js"></script>