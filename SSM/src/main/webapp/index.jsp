<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="JS/jquery/jquery-3.2.1.min.js"></script>
</head>
<h2>Hello World!</h2>
<button id="testAJAX">测试</button>
</body>
<script>
	$('#testAJAX').click(function(){
		$.ajax({
			type:'post',
			url:'user/insertUser.do',
			data:{
				userName:'lanqing',
				age:'19'
			},
			success:function(data){
				console.log(data);
			},
			error:function(data){
				console.log(data);
			}
		})
	})
</script>
</html>
