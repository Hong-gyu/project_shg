<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title> 스프링 테스트 </title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p>  유저정보 </p>
${user} <br>
<a href="<%=request.getContextPath()%>/board/list"><button class="btn btn-outline-primary" type="button">게시글</button></a>
<a href="<%=request.getContextPath()%>/signin"><button class="btn btn-outline-success" type="button">로그인</button></a>
<a href="<%=request.getContextPath()%>/signup"><button class="btn btn-outline-danger" type="button">회원가입</button></a>
<a href="<%=request.getContextPath()%>/member/mypage"><button class="btn btn-outline-warning" type="button">마이페이지</button></a>
</body>
</html>
