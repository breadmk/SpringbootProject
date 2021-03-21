<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="/static/js/content.js"></script>
<div class="container">
  <h2>학원상세정보</h2>
  <table class="table table-hover">
  <input type="hidden" value="${param.no}" id="no">
    <thead>
      <tr>
        <th>학원명</th>
        <th>지역</th>
        <th>과정명</th>
        <th>강사명</th>
        <th>별점</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${dto.name}</td>
        <td>${dto.location}</td>
        <td>${dto.process}</td>
        <td>${dto.teacher}</td>
        <td>${dto.score}</td>
      </tr>
      <tr>
      	<td>내용</td>
      	<td colspan="5">${dto.content}</td>
      </tr>
      <tr>
      	<td colspan="2">등록일</td>
        <td>${dto.writedate}</td>
      </tr>
      <tr>
      <td colspan="5" align="center">
      	<button type="button" class="btn btn-info" id="insert" onclick="list()">목록</button>
      	<button type="button" class="btn btn-info" id="update" onclick="update()">수정</button>
      	<button type="button" class="btn btn-info" id="delete" onclick="deletechk()">삭제</button>
      </td>
      </tr>
    </tbody>
  </table>
</div>

</body>
</html>