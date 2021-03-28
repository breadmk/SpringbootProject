<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="/static/css/signup.css">
<script src="/static/js/signup.js"></script>
 <form action="/member/signOk">
 <div class="title"><h1>국비정보교류</h1></div>
	<fieldset class="terms">
		<legend>약관</legend>
		<div class="field mb10 tal"><input type="checkbox" value="n" id="chk1"/> 약관1에 동의(필수)</div>
		<div class="terms">
			- 약관1 -<br/>
			약관내용1<br/>
			약관내용2<br/>
			약관내용3<br/>
			약관내용4<br/>
			약관내용5<br/>
			약관내용6<br/>
			약관내용7<br/>
			약관내용8<br/>
			약관내용9
		</div>
		<div class="field mb10 mt10 tal"><input type="checkbox" value="n" id="chk2"/> 약관2에 동의(필수)</div>
		<div class="terms mb10">
			- 약관1 -<br/>
			약관내용1<br/>
			약관내용2<br/>
			약관내용3<br/>
			약관내용4<br/>
			약관내용5<br/>
			약관내용6<br/>
			약관내용7<br/>
			약관내용8<br/>
			약관내용9
		</div>
		<div class="field mb10 mt10 tal"><input type="checkbox" /> 약관3에 동의</div>
		<div class="terms mb10">
			- 약관1 -<br/>
			약관내용1<br/>
			약관내용2<br/>
			약관내용3<br/>
			약관내용4<br/>
			약관내용5<br/>
			약관내용6<br/>
			약관내용7<br/>
			약관내용8<br/>
			약관내용9
		</div>
		<div class="field mt5 mb5" id="errMsg"></div>
		<div class="field">
			<a href="/"><input type="button" value="취소" title="취소" alt="취소" class="termsBtn mr5" /></a>
			<input type="submit" value="확인" title="확인" alt="확인" class="termsBtn" id="temsBtn" />
		</div>
	</fieldset>
 </form>