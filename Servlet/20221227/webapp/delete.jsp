<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>삭제할 사원 번호</h1>
	<form action="delete.do" method="post">
		<label for = "empno">사원번호</label>
		<input type = "text" name = "empno"/>
		<input type = "submit" value = "삭제"/>
		<br/>
		<a href = "select.do">데이터 목록</a>
	</form>
</body>
</html>