<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	request.do의 요청입니다.<br>
	get + post 방식 모두 확인하겠습니다<br>
	
	<h1>get 방식</h1>
	
	id : ${param.id} <br>
	name : ${param.name} <br>
	age : ${param.age} <br>
	
	<h1>Post 방식</h1>
	
	id : ${mvo.id} <br>
	name : ${mvo.name} <br>
	age : ${mvo.age} <br>
	
	
</body>
</html>