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
<h1>insert page</h1>
<form action="insert.action">
	<p>
		<label for="name">name</label>
		<input type="text" name="name" id="name" value="${name }" />
		${fieldError.nameErr }
	</p>
	<p>
		<label for="pay">pay</label>
		<input type="text" name="pay" id="pay" value="${pay }" />
		${fieldError.payErr }
	</p>
	<p><button type="submit">입력</button>
	</p>
</form>
</body>
</html>