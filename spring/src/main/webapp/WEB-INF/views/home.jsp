<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<title> 메인 </title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar bg-light">
	  <ul class="navbar-nav">
	    <li class="nav-item">
	      <a class="nav-link" href="<%=request.getContextPath()%>/board/list">게시글</a>
	    </li>
	    <li class="nav-item">
	      	<c:if test="${user == null}">
	      		<a class="nav-link" href="<%=request.getContextPath()%>/signin">로그인</a>
	      	</c:if>
	    </li>
	    <li class="nav-item">
	    	<c:if test="${user == null}">
	      		<a class="nav-link" href="<%=request.getContextPath()%>/signup">회원가입</a>
	      	</c:if>
	    </li>
	    <li class="nav-item">
	    	<c:if test="${user != null}">
	      		<a class="nav-link" href="<%=request.getContextPath()%>/member/mypage">마이페이지</a>
	      	</c:if>
	    </li>
   	    <li class="nav-item">
	    	<c:if test="${user != null}">
	      		<a class="nav-link" href="<%=request.getContextPath()%>/signout">로그아웃</a>
	      	</c:if>
	    </li>
	  </ul>
	</nav>
</body>
</html>