<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script type="text/javascript" src="/resources/jquery/jquery-3.2.1.min.js"></script>	

</head>
<body>
<!-- <input type="text" id="id">
<input type="text" id="pw">
<button id="login" onclick="login($('#id').val(),$('#pw').val())">로그인</button> -->

		<!-- //header -->
		<form id="frm" name="frm" action="<c:url value='/login/process'/>" method="post">
			<div id="container" class="main">
				<div class="login_wrap">
					<ul class="login_form">
						<li class="id">
							<p><label for="login_id" class="ico">아이디</label> <input type="text" id="login_id" name="username" placeholder="아이디를 입력하세요" autofocus="autofocus" maxlength=50  /></p>
						</li>
						<li class="pw">
							<p><label for="login_pw" class="ico">비밀번호</label><input type="password" id="login_pw" name="password" placeholder="비밀번호를 입력하세요" autocomplete="off" value="admin" maxlength=50 /></p>
						</li>
						<li class="btn"><button title="로그인">로그인</button></li>
					</ul>
				</div>
			</div>
		</form>
</body>

<script type="text/javascript">

</script>
</html>