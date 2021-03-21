<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
	h2{
		margin: auto;
	}
	.container{
		margin-top: 30px;
		display: inline-block;
	}
	.insert .form-group{
		margin:auto;
	}
</style>
<!-- include summernote css/js-->
<link href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.11/summernote-bs4.css" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.11/summernote-bs4.js"></script>
<!-- include summernote-ko-KR -->
<script src="/static/summernote/summernote-ko-KR.js"></script>
<script src="/static/js/update.js"></script>
<div class="container">
  <h2>학원등록</h2>
<form method="post" action="/board/updateOk">
<input type="hidden" value="${param.no}" name="no">
  <table class="table">
      <tr>
        <td>학원명</td>
        <td>
        <input type="hidden" value="${dto.name}" id="selected">
         <select name="name" id="selbox">
        	<option value="쌍용교육센터">쌍용교육센터</option>
        	<option value="솔데스크">솔데스크</option>
        	<option value="한국소프트웨어인재개발원">한국소프트웨어인재개발원</option>
        	<option value="이젠아이티">이젠아이티</option>
        	<option value="더조은아이티">더조은아이티</option>
        	<option value="1">직접입력
        		<input type="text" name="name" class="form-control" id="directInput">
        	</option>
         </select>
        </td>
      </tr>
      <tr>
        <td>위치</td>
         <td><input type="text" class="form-control" name="location" value="${dto.location}"></td>
      </tr>
      <tr>
        <td>강의명</td>
         <td><input type="text" class="form-control" name="process" value="${dto.process}"></td>
      </tr>
      <tr>
        <td>강사명</td>
         <td><input type="text" class="form-control" name="teacher" value="${dto.process}"></td>
      </tr>
       <tr>
        <td>별점</td>
         <td>
         <input type="hidden" value="${dto.score}" id="score">
         <input type="radio" class="optradio" name="score" value="1">★
         <input type="radio" class="optradio" name="score" value="2">★★
         <input type="radio" class="optradio" name="score" value="3">★★★
         <input type="radio" class="optradio" name="score" value="4">★★★★
         <input type="radio" class="optradio" name="score" value="5">★★★★★
         </td>
      </tr>
      <tr>
      	<td>상세정보</td>
      	<td><textarea id="summernote" name="content">${dto.content}</textarea></td>
      </tr>
       <tr>
        <td>본인확인번호</td>
         <td><input type="password" class="form-control" name="pwd">
         <c:if test="${param.chk==1}">
         <span>비밀번호가 틀렸습니다.</span>
         </c:if>
         </td>
      </tr>
      <tr>
      	<td colspan="2" align="center"><input type="submit" value="수정"></td>
      </tr>
  </table>
  </form>
</div>

</body>
</html>