<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>
		ADD <small>page</small>
	</h1>
	<form action="insert.do" class="form-horizontal" method="post" >
		<div class="form-group">
			<label for="">���</label>
			<input type="text" class="form-control" name="sabun" id="" placeholder="sabun" />
		</div>
		<div class="form-group">
			<label for="">�̸�</label>
			<input type="text" class="form-control" name="name" id="" placeholder="name" />
		</div>
		<div class="form-group">
			<label for="">��¥</label>
			<input type="date" class="form-control" name="nalja" id="" />
		</div>
		<div class="form-group">
			<label for="">�ݾ�</label>
			<input type="text" class="form-control" name="pay" id="" placeholder="pay" />
		</div>
		<button type="submit" class="btn btn-default">submit</button>
	</form>
</body>
</html>