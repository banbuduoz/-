<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="bp" value="<%=basePath%>"></c:set>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title></title>
<!-- 引入 Bootstrap -->
<link href="${bp}/static/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="${bp}/static/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="${bp}/static/js/bootstrap.min.js"></script>
<link href="${bp}/static/css/style.css" rel="stylesheet" />
</head>

<body>
	
	<!--中间内容部分开始-->
	<div class="container widthone">
		<h1>登&nbsp;&nbsp;录</h1>
		<form class="form-horizontal" role="form" action="login.action" method="post">
			<div class="form-group">
				<label for="firstname" class="col-sm-2 control-label">名字</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="firstname" placeholder="请输入名字" name="loginname">
				</div>
			</div>
			<div class="form-group">
				<label for="lastname" class="col-sm-2 control-label">密码</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="password" placeholder="请输入密码" name="pass">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<div class="checkbox">
						<label>
							<input type="checkbox">
							请记住我
						</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-success">登录</button>
					<a href="user/toregist.action"><button type="button" class="btn btn-default">注册</button></a>
				</div>
			</div>
		</form>
	</div>
	<!--内容部分结束-->

	<!-- 脚部 -->
		<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>