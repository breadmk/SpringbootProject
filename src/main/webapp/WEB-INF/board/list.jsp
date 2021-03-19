<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
table tr th{
	text-align: center;
}
table tr td{
	text-align: center;
}
</style>
<script src="/static/js/list.js"></script>
<div class="container">
  <h2>국비학원 정보교류</h2>
  <table class="table table-hover">
    <thead>
      <tr>
        <th>번호</th>
        <th>지역</th>
        <th>학원명</th>
        <th>강의명</th>
        <th>강사명</th>
        <th>별점</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="list">
      <tr class="rowLine">
        <td id="no">${list.no}</td>
        <td>${list.location}</td>
        <td>${list.name}</td>
        <td>${list.process}</td>
        <td>${list.teacher}</td>
        <td>${list.score}</td>
      </tr>
      </c:forEach>
      <tr>
      	<td colspan="6"><button type="button" class="btn btn-default" id="insert" onclick="insert()">등록</button></td>
      	</tr>
  </table>