<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<base href="<%=basePath%>">
<title></title>
<!-- 引入 Bootstrap -->
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="static/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="static/js/bootstrap.min.js"></script>

<script>
	function check() {
		var name = $("#name").val();
		var tel = $("#tel").val();
		var visitname = $("#visitname").val();
		var info = $("#info").val();
		if (name.trim() == "") {
			alert("来访人姓名不能为空！");
			return;
		}
		if (tel.trim() == "") {
			alert("电话不能为空！");
			return;
		}
		if (visitname.trim() == "") {
			alert("拜访人姓名不能为空");
			return;
		}
		if (info.trim() == "") {
			alert("备注信息不能为空");
			return;
		}
		if (confirm("确认保存?")) {
			$("#form").submit();
		}
	}
</script>

<link href="static/css/style.css" rel="stylesheet" />
</head>

<body>
	<!-- 头部 -->

	<!-- 头部结束 -->

	<!--中间内容部分开始-->
	<div class="container allwidth">
		<div class="create">
			<h1>外来人员信息登记表</h1>
			<form id="form" action="visit/addvisitperson.action" method="post">
				<table class="templatemo-container">
					<tr>
						<td>
							来访人姓名:
							<input id="name" name="name" ;p;type="text" class="form-control" />
						</td>
					</tr>
					<tr>
						<td>
							电话:
							<br />
							<input id="tel" name="tel" type="text" class="form-control" />
						</td>
					</tr>
					<tr>
						<td>
							拜访人姓名:
							<br />
							<input id="visitname" name="visitname" type="text" class="form-control" />
						</td>
					</tr>
					<tr>
						<td>
							备注信息:
							<input id="info" name="info" type="text" class="form-control" />
						</td>
					</tr>
					<tr>
						<td align="center">
							<button type="button" onclick="check()" class="btn btn-success">submit</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<!--内容部分结束-->

	<!-- 脚部 -->

	<!-- 脚部结束 -->
</body>

</html>