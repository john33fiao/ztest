<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<style type="text/css">
table a {
	display: block;
}
</style>
<title>Insert title here</title>

</head>
<body>
	<h1>
		List <small>Page</small>
	</h1>
	<table class="table table-hover">
		<tr class="info">
			<td>사번</td>
			<td>이름</td>
			<td>날짜</td>
			<td>금액</td>
		</tr>
		<c:forEach var="bean" items="${alist }">
			<tr>
				<td><a href="detail.do?idx=${bean.sabun }">${bean.sabun }</a></td>
				<td><a href="detail.do?idx=${bean.sabun }">${bean.name }</a></td>
				<td><a href="detail.do?idx=${bean.sabun }">${bean.nalja }</a></td>
				<td><a href="detail.do?idx=${bean.sabun }">${bean.pay }</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="add.do" class="btn btn-default btn-success">add</a>
</body>
</html>