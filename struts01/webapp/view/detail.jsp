<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
<h1>detail page</h1>
<table>
	<tr>
		<td>sabun</td>
		<td>${bean.sabun }</td>
	</tr>
	<tr>
		<td>name</td>
		<td>${bean.name }</td>
	</tr>
	<tr>
		<td>nalja</td>
		<td>${bean.nalja }</td>
	</tr>
	<tr>
		<td>pay</td>
		<td>${bean.pay }</td>
	</tr>
	<tr>
		<td colspan="2">
		<a href="edit.action?idx=${bean.sabun }">[수정]</a>
		<a href="del.action?idx=${bean.sabun }">[삭제]</a>
		</td>
	</tr>
</table>
</body>
</html>