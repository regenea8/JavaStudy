<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
.wrap {
	position: absolute; 
	width:491px; 
	height:431px; 
	left:50%; 
	margin-left:-245px; 
	top:50%; 
	margin-top: -215px;
}

.wrap > div > img {
	width: 245px;
	height: 81px;
}

.alert {
	color: red;
	display: none;
}
</style>

<script type="text/javascript">
	
	$(document).ready(function() {
		
		$(".userId").on("keyup", function(e) {
			if (e.keyCode == 13){
				$(".loginBtn").click();
		    }
		});
		
		$(".userPwd").on("keyup", function(e) {
			if (e.keyCode == 13){
				$(".loginBtn").click();
				
				var userId = $(".userId").val();
				if (userId == "") {
					$(".userId").focus();
				}
		    }
		});
		
		$(".loginBtn").on("click", function() {
			var userId = $(".userId").val();
			var userPwd = $(".userPwd").val();
			
			if (userId == "") {
				$(".alert").text("아이디를 입력해 주세요.");
				$(".alert").show();		
			} else if (userPwd == "") {
				$(".alert").text("비밀번호를 입력해 주세요.");
				$(".alert").show();		
			} else {
				$(".loginForm").submit();
			}
		});
	});
</script>

</head>
<body>

<div class="wrap">
	<div class="text-center form-group">
		<img src="/resources/image/googlelogo.png">
	</div>
	<div>
		<form class="loginForm" action="/user/login" method="post">
			<div class="form-group">
				<input type="text" class="form-control userId" name="userId" placeholder="아이디" value="${userId }">
			</div>
			<div class="form-group">
				<input type="password" class="form-control userPwd" name="userPwd" placeholder="비밀번호">
				<p class="row alert"></p>
			</div>
			<div class="form-group">
				<button type="button" class="btn btn-danger btn-block loginBtn">로그인</button>
			</div>
		</form>
	</div>
	<div class="text-center">
		<a href="#">회원가입</a>
	</div>
</div>

</body>
</html>