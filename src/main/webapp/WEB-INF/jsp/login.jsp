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
<button id="login" onclick="login($('#id').val(),$('#pw').val())">�α���</button> -->

		<!-- //header -->
		<form id="frm" name="frm" action="<c:url value='/login/process'/>" method="post">
			<div id="container" class="main">
				<div class="login_wrap">
					<ul class="login_form">
						<li class="id">
							<p><label for="login_id" class="ico">���̵�</label> <input type="text" id="login_id" name="username" placeholder="���̵� �Է��ϼ���" autofocus="autofocus" maxlength=50  /></p>
						</li>
						<li class="pw">
							<p><label for="login_pw" class="ico">��й�ȣ</label><input type="password" id="login_pw" name="password" placeholder="��й�ȣ�� �Է��ϼ���" autocomplete="off" value="admin" maxlength=50 /></p>
						</li>
						<li class="btn"><button title="�α���">�α���</button></li>
					</ul>
				</div>
			</div>
		</form>
</body>

<script type="text/javascript">

</script>
</html>