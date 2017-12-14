<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script>
	var result = false;
	var url = "delete.do?idx="+${bean.sabun };
		$(function(){
			$('form').submit(function(){
				return result;
			});
			$('button').eq(0).hide();
			$('button').eq(3).hide();
			$('button').eq(1).click(function(){
				$('button').eq(0).show();
				$('button').eq(1).hide();
				$('button').eq(2).hide();
				result = true;
				$('h1').html("Update <small>page</small>");
				$('input').eq(1).prop('readonly', false);
				$('input').eq(3).prop('readonly', false);
			});
			$('button').eq(2).click(function(){
				$('button').eq(3).show();
				$('button').eq(1).hide();
				$('button').eq(2).hide();
			});
			$('button').eq(3).click(function(){
				$(location).attr("href", url);
			});
		});
	</script>
<title>Insert title here</title>
</head>
<body>
	<h1>Detail <small>page</small></h1>
	<form action="update.do" class="form-horizontal" method="post" >
		<div class="form-group">
			<label for="">사번</label>
			<input type="text" value="${bean.sabun }" readonly="readonly" class="form-control" name="sabun" id="" placeholder="sabun" />
		</div>
		<div class="form-group">
			<label for="">이름</label>
			<input type="text" value="${bean.name }" readonly="readonly" class="form-control" name="name" id="" placeholder="name" />
		</div>
		<div class="form-group">
			<label for="">날짜</label>
			<input type="date" value="${bean.nalja }" readonly="readonly" class="form-control" name="nalja" id="" />
		</div>
		<div class="form-group">
			<label for="">금액</label>
			<input type="text" value="${bean.pay }" readonly="readonly" class="form-control" name="pay" id="" placeholder="pay" />
		</div>
		<button type="submit" class="btn btn-default">확인</button>
		<button type="button" class="btn btn-default">수정</button>
		<button type="button" class="btn btn-default">삭제</button>
		<button type="button" class="btn btn-default">삭제 확인</button>
	</form>
</body>
</html>