<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<img alt="logo" src="../imgs/logo.png" />
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><a href="../">Home</a></li>
					<li><a href="./list.do">List</a></li>
					<li class="active">Guest</li>
				</ol>
				<div class="jumbotron">
					<h1>Add page</h1>
					<p>입력페이지 입니다</p>
					<p>
						<a class="btn btn-primary btn-lg" href="list.do" role="button">목록으로</a>
					</p>
				</div>
				<div class="page-header">
					<h1>
						Add page <small>입력페이지</small>
					</h1>
				</div>
				<form action="insert.do" class="from-horizontal">
					<label for=""></label><input type="text" name="sabun" /> <input type="text" name="name" />
					<input type="date" name="nalja" /> <input type="text" name="pay" />
					<button class="btn btn-primary btn-lg" type="submit">확인</button>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">비트교육센터 서울시 서초구 서초동 1327-15 비트아카데미빌딩｜
				사업자등록번호 : 214-85-24928 (주)비트컴퓨터 서초지점 대표이사 : 조현정 / 문의 : 02-3486-9600
				/ 팩스 : 02-6007-1245 통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 권도혁
				Copyright (c) 비트캠프 All rights reserved.</div>
		</div>
	</div>
</body>
</html>