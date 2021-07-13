<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
	<title> 게시글 작성 : 스프링테스트 게시판</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<form class="container" method="post" action = "<%=request.getContextPath()%>/board/register">
		<h1> 게시글 작성하기 </h1>
	    <div class="form-group">
		      <label> 제목 </label>
		      <input type="text" class="form-control" name="title">
		</div>
	    <div class="form-group">
		      <label> 내용 </label>
		      <textarea type="text" class="form-control" rows="10" name="contents">${board.contents}</textarea>
		</div>
		<button class = "btn btn-outline-success">등록</button>
		<a href="<%=request.getContextPath()%>/board/list"><button class="btn btn-outline-primary" type="button">목록</button></a>
	</form>

</body>
</html>