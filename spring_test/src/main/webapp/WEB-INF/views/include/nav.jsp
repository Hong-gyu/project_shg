<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p>  유저정보 </p>
${user.id}, ${user.name } <br>
<a href="<%=request.getContextPath()%>/board/list"><button class="btn btn-outline-primary" type="button">게시글</button></a>
<a href="<%=request.getContextPath()%>/signin"><button class="btn btn-outline-success" type="button">로그인</button></a>
<a href="<%=request.getContextPath()%>/signup"><button class="btn btn-outline-danger" type="button">회원가입</button></a>
<a href="<%=request.getContextPath()%>/member/mypage"><button class="btn btn-outline-warning" type="button">마이페이지</button></a>
</body>
</html>
