<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1>스트럿츠 시작</h1>
<ul>
	<li>
		<a href="test01.action">test01</a>
	</li>
	<li>
		<a href="test02.action">test02</a>
	</li>
	<li>
		<a href="test03.action">test03</a>
	</li>
	<li>
		<a href="test04.action?msg=abcd">test04</a>
	</li>
	<li>
		<a href="guest/test05.action">test05</a>
	</li>
</ul>
<form action="result.action">
	<label for="">id</label>
	<input type="text" id="" name="id" /><br />
	<label for="">pw</label>
	<input type="text" id="" name="pw" /><br />
	<button type="submit">전송</button>
</form>
</body>
</html>