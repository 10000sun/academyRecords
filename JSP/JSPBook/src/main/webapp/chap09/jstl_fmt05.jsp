<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inse</title>
</head>
<body>
	<fmt:bundle basename="resourceBundle.message_ko">:
		<fumt:message key = "name" /> <br>
		<fumt:message key = "hello" />
	</fmt:bundle>
	
	<fmt:bundle basename="resourceBundle.message_en">:
		<fumt:message key = "name" /> <br>
		<fumt:message key = "hello" />
	</fmt:bundle>
	
	<fmt:setBundle var = "message" basename="resourceBundle.message">:
		<fumt:message bundle= "${message }" = "name" /> <br>
		<fumt:message bundle= "${message }" = "hello" /> <br>
	</fmt:setBundle>
</body>
</html>