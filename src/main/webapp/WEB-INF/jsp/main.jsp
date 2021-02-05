<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/resources/css/main.css" type="text/css"/>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<script type="text/javascript" src="/resources/jquery/jquery-3.2.1.min.js"></script>	
</head>
<body>
<div id="crud_logo"><span>C</span><span>R</span><span>U</span><span>D</span></div>
<div class="board">
	<table id="main_board">
		<thead>
			<tr>
				<td>�۹�ȣ</td>
				<td>����</td>
				<td>�ۼ���</td>
				<td>�ۼ���¥</td>
			</tr>
			
		</thead>
		<tbody>
		
		</tbody>
			
	</table>
</div>
<div id="post_detail" style="display:none;">
	<div id="post_id"></div>
	<div id="post_title"></div>
	<div id="post_content"></div>
	<div id="user_id"></div>
</div>
<a href='/logout' class="btn logout_btn">�α׾ƿ�</a>
</body>
<script type="text/javascript">
$(document).ready(function(){
	getPostList();
});

function getPostList(){
	$.ajax({
		url: "post/ajax/getPostList",
		data: {},
		type: "post",
		dataType: "json",
		success: function(data){
			console.log(data);
			var result = data;
			setPostList(result);
		}	
	})
}

function setPostList(result){
	$('#main_board tbody').children().remove();
	
	var str = "";
	for(var i=0; i<result.length; i++){
		 str += "<tr>"+
					"<td>"+result[i].post_id+"</td>"+
					"<td><a href=''>"+result[i].post_title+"<a/></td>"+
					"<td>"+result[i].user_id+"</td>"+
					"<td>"+result[i].create_time+"</td>"+
				"</tr>";
	}
	$('#main_board tbody').append(str);
	
}


</script>
</html>