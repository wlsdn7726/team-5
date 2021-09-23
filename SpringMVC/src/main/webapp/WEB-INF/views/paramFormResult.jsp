<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<h2> paramForm 결과화면 </h2>

멤버 아이디 : ${memberVO.id}<br>
멤버 이름 : ${memberVO.name}<br>
멤버 나이 : ${memberVO.age}<br>

세션 : <%= session.getAttribute("login") %> 님 로그인 확인!<br>
세션 : ${sessionScope.login} 님 로그인 확인!<br>


</body>
</html>