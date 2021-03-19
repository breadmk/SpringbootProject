<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<script src="/static/js/insert.js"></script>
<div class="container">
  <h2>학원등록</h2>
<form method="post" action="/board/insertOk">
  <table class="table">
      <tr>
        <td>학원명</td>
        <td><input type="text" class="form-control" name="name"></td>
      </tr>
      <tr>
        <td>위치</td>
         <td><input type="text" class="form-control" name="location"></td>
      </tr>
      <tr>
        <td>강의명</td>
         <td><input type="text" class="form-control" name="process"></td>
      </tr>
      <tr>
        <td>강사명</td>
         <td><input type="text" class="form-control" name="teacher"></td>
      </tr>
       <tr>
        <td>별점</td>
         <td>
         <input type="radio" class="optradio" name="score" value="1">★
         <input type="radio" class="optradio" name="score" value="2">★★
         <input type="radio" class="optradio" name="score" value="3">★★★
         <input type="radio" class="optradio" name="score" value="4">★★★★
         <input type="radio" class="optradio" name="score" value="5">★★★★★
         </td>
      </tr>
      <tr>
      	<td>상세정보</td>
      	<td><textarea id="summernote" name="content"></textarea></td>
      </tr>
      <tr>
      	<td colspan="2" align="center"><input type="submit" value="등록"></td>
      </tr>
  </table>
  </form>
</div>

</body>
</html>