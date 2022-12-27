<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EMP테이블 데이터 저장 실습</h1>
	<form action="insert.do" method="post">
		<fieldset>
			<legend>EmpForm</legend>
			<ul>
				<li>
					<label for = "empno">사원번호</label>
					<input type = "text" name = "empno">
				</li>
				<li>
					<label for = "ename">사원이름</label>
					<input type = "text" name = "ename">
				</li>
				<li>
					<label for = "job">직급</label>
					<input type = "text" name = "job">
				</li>
				<li>
					<label for = "mgr">사수번호</label>
					<input type = "text" name = "mgr">
				</li>
				<li>
					<label for = "hiredate">입사일</label>
					<input type = "text" name = "hiredate">
				</li>
				<li>
					<label for = "sal">연봉</label>
					<input type = "text" name = "sal">
				</li>
				<li>
					<label for = "comm">보너스</label>
					<input type = "text" name = "comm">
				</li>
				<li>
					<label for = "deptno">부서번호</label>
					<input type = "text" name = "deptno">
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