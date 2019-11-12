<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
	<c:import url="header1.jsp"></c:import>
	<!-- 内容模块1 -->
	<div class="d2 allwidth">
		<h1>失物招领</h1>
		<table class="table table-hover">
			<caption>失物招领</caption>
			<tr>
				<th>用户</th>
				<th>标题</th>
				<th>类型</th>
				<th>发表时间</th>
				<th>浏览量</th>
			</tr>
			<c:forEach items="${shiwuList}" var="shiwuList">
				<tr>
					<td>${shiwuList.userName }</td>
					<td>
						<a href="#">标题：${shiwuList.title }</a>
					</td>
					<td>${shiwuList.kindName }</td>
					<td>${shiwuList.datetime }</td>
					<td>0</td>
				</tr>
			</c:forEach>

		</table>

		<h1>寻物启事</h1>
		<table class="table table-hover">
			<caption>寻物启事</caption>
			<tr>
				<th>作者</th>
				<th>标题</th>
				<th>类型</th>
				<th>发表时间</th>
				<th>浏览量</th>
			</tr>
			<c:forEach items="${xunwuList}" var="xunwuList">
				<tr>
					<td>${xunwuList.userName }</td>
					<td>
						<a href="#">标题：${xunwuList.title }</a>
					</td>
					<td>${xunwuList.kindName }</td>
					<td>${xunwuList.datetime }</td>
					<td>0</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<!-- 脚部 -->
	<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>