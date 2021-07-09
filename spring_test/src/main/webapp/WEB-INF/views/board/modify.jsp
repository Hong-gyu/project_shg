<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
	<title> 게시글 수정 : 스프링테스트 게시판</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container" method="post" action="<%=request.getContextPath()%>/board/modify">
		<h1>게시글 수정하기</h1>
	    <div class="form-group">
		      <label> 제목 </label>
		      <input type="text" class="form-control" name="title" value="${board.title}">
		</div>
	    <div class="form-group">
		      <label> 작성자 </label>
		      <input type="text" class="form-control" name="writer" value="${board.writer}" readonly>
		</div>
	    <div class="form-group">
		      <label> 내용 </label>
		      <textarea type="text" class="form-control" rows="10" name="contents">${board.contents}</textarea>
		</div>
		<input type = "hidden" name = "num" value = "${board.num}">
		<button class = "btn btn-outline-success">수정</button>
		<a href="<%=request.getContextPath()%>/board/list"><button class = "btn btn-outline-danger">목록</button></a>
	</div>

</body>
</html>