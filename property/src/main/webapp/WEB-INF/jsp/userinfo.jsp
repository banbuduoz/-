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
	<c:if test="${current_user.roleid==2||current_user.roleid==0||current_user.roleid==1||current_user.roleid==7 }">
		<c:import url="header1.jsp"></c:import>
	</c:if>
	<c:if test="${current_user.roleid==3||current_user.roleid==4||current_user.roleid==6 }">
		<c:import url="header.jsp"></c:import>
	</c:if>

	<!--中间内容部分开始-->
	<div class="container allwidth">
		<h1>个人信息详情</h1>
		<table class="table table-hover">
			<tr>
				<td>编号</td>
				<td>${user.id }</td>

			</tr>
			<tr>
				<td>姓名</td>
				<td>${user.name }</td>
			</tr>
			<tr>
				<td>性别</td>
				<td>${user.sex }</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td>${user.age }</td>
			</tr>
			<tr>
				<td>电话号码</td>
				<td>${user.tel }</td>
			</tr>
			<tr>
				<td>注册时间</td>
				<td>${user.inputdate }</td>
			</tr>
			<c:if test="${current_user.roleid==2}">
				<tr>
					<td>单元id</td>
					<td>${user.houseid }</td>
				</tr>
				<tr>
					<td>房间id</td>
					<td>${user.roomid }</td>
				</tr>
			</c:if>
		</table>
	</div>
	<!--内容部分结束-->
	<c:import url="foot.jsp"></c:import>

</body>

</html>