<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<div class="title"><h1>국비정보 교류</h1></div>
<link rel="stylesheet" href="/static/css/signup.css">

<form>
	<fieldset class="join">
		<legend>회원가입</legend>
		<h3><label for="id">아이디</label></h3>
		<div class="field"><input type="text" name="id" maxlength="12" placeholder="아이디" class="input" /></div>
		<div class="field errMsg"></div>
		<h3><label for="pw">비밀번호</label></h3>
		<div class="field"><input type="password" name="pw" maxlength="12" placeholder="비밀번호" class="input" /></div>
		<div class="field errMsg"></div>
		<h3><label for="pw2">비밀번호 확인</label></h3>
		<div class="field"><input type="password" name="pw2" maxlength="12" placeholder="비밀번호확인" class="input" /></div>
		<div class="field errMsg"></div>
		<h3><label for="name">이름</label></h3>
		<div class="field"><input type="text" name="name" placeholder="이름" class="input" /></div>
		<div class="field errMsg"></div>
		<h3><label for="phone">연락처</label></h3>
		<div class="field"><input type="text" name="phone" placeholder="연락처" class="input" /></div>
		<div class="field errMsg"></div>
		<h3><label for="birth">생년월일</label></h3>
		<div class="field"><input type="text" name="birth" placeholder="생년월일 2021-01-01" class="input" /></div>
		<div class="field errMsg"></div>
		<h3><label for="gender">성별</label></h3>
		<div class="field">남자 <input type="radio" name="gender" value="m" checked="checked" /> 여자 <input type="radio" name="gender" value="f" /></div>
		<div class="field errMsg"></div>
		<div class="field">                   
		<input class="form-control" style="width: 40%; display: inline;" placeholder="우편번호" name="zipcode" id="addr1" type="text" readonly="readonly" >
    	<button type="button" class="btn btn-info" id="searAddrBtn">주소검색</button></h3>                          
		</div>
		<div class="field">
    	<input class="form-control" style="top: 5px;" placeholder="도로명 주소" name="addr" id="addr2" type="text" readonly="readonly" />
		</div>
		<div class="field">
	    <input class="form-control" placeholder="상세주소" name="addr_detail" id="addr_detail" type="text"  />
		</div>
		<div class="field errMsg"></div>
		<h3><label for="email">이메일</label></h3>
		<div class="field"><input type="text" name="email" placeholder="이메일" class="input" /></div>
		<div class="field errMsg"></div>
	</fieldset>
</form>
		<div class="joininput"><button id="join">가입하기</button></div>
		
<script src="/static/js/signok.js"></script>