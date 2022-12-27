<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp 테이블 목록 보기</title>
</head>
<body>
	<h1>Emp 테이블 목록보기</h1>
	<form action = "select.do">
		<input type = "submit" value = "검색"/>
	</form>
	<table border="1">
		<tr>
			<td>사원 번호</td>
			<td>사원 이름</td>
			<td>직책</td>
			<td>관리자 번호</td>
			<td>입사일</td>
			<td>연봉</td>
			<td>커미션</td>
			<td>부서 번호</td>
		</tr>
		
		<c:forEach var = "dto" items="${select}">
			<tr>
				<td>${dto.empno }</td>
				<td>${dto.ename }</td>
				<td>${dto.job }</td>
				<td>${dto.mgr }</td>
				<td>${dto.hiredate }</td>
				<td>${dto.sal }</td>
				<td>${dto.comm }</td>
				<td>${dto.deptno }</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href = "insertForm.do">Emp테이블 입력</a> &nbsp&nbsp&nbsp&nbsp&nbsp
	<a href = "deleteForm.do">사원목록 삭제</a> &nbsp&nbsp&nbsp&nbsp&nbsp
	<a href = "updateForm.do">사원 연봉 수정</a>
	
	
</body>
</html>