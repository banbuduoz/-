<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title></title>
<!-- 引入 Bootstrap -->
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="static/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="static/js/bootstrap.min.js"></script>
<link href="static/css/style.css" rel="stylesheet" />
</head>

<body>
	<!--头信息-->
	<c:import url="header.jsp"></c:import>
	<!-- 头信息结束 -->
	<!-- 内容模块1 -->
	<div class="d2 allwidth">
		<h1>认证用户列表</h1>
		<table class="table table-hover">
			<tr>
				<th>用户姓名</th>
				<th>电话号码</th>
				<th>性别</th>
				<th>年龄</th>
				<th>注册时间</th>
				<th>注册IP地址</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${userVOs }" var="userVO">
				<tr>
					<th>${userVO.name }</th>
					<th>${userVO.tel }</th>
					<th>${userVO.sex}</th>
					<th>${userVO.age }</th>
					<th>${userVO.inputdate }</th>
					<th>${userVO.ip }</th>
					<th>
						<a class="btn btn-success" href="approve/approveuser.action?id=${userVO.id }">认证</a>
					</th>
				</tr>

			</c:forEach>

		</table>
	</div>
	<!-- 脚部 -->
	<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>