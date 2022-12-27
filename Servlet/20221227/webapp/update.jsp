<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EMP테이블 데이터 수정</h1>
	<form action="update.do" method="post">
		<fieldset>
			<legend>EmpForm</legend>
			<ul>
				<li>
					<label for = "empno">수정할 사원번호</label>
					<input type = "text" name = "empno">
				</li>
				<li>
					<label for = "sal">수정할 연봉</label>
					<input type = "text" name = "sal">
				</li>
				<li>
					<input type = "submit" value = "저장">
				</li>
				<br/>
				<a href = "select.do">데이터 목록</a>
			</ul>
		</fieldset>
	</form>
</body>
</html>