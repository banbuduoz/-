<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<base href="<%=basePath%>">
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

	<c:import url="header1.jsp"></c:import>

	<!--中间内容部分开始-->
	<div class="container allwidth">
		<h1>个人业务信息详情</h1>
		<table class="table table-hover">
			<tr>
				<td>服务名称</td>
				<td>${service.title }</td>

			</tr>
			<tr>
				<td>服务信息</td>
				<td>${service.info }</td>
			</tr>
			<tr>
				<td>审批状态</td>
				<td>${state.name }</td>
			</tr>
			<tr>
				<td>发起时间</td>
				<td>${service.starttime }</td>
			</tr>

			<tr>
				<td>结束时间</td>
				<td>${service.endtime }</td>
			</tr>

			<tr>
				<td>评价</td>
				<td>${service.appraise }</td>
			</tr>
			<tr>
				<td>申请服务类型</td>
				<td>${serviceKind.name }</td>
			</tr>
			<tr>
				<td>服务结果</td>
				<td>${service.result }</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;"><a
					onclick="window.history.go(-1)" style="cursor: pointer;"
					class="btn btn-success">返回</a></td>
			</tr>
		</table>
	</div>
	<!--内容部分结束-->

	<!-- 脚部 -->
	<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>