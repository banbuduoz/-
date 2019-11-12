<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title></title>
<!-- 引入 Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="js/bootstrap.min.js"></script>
<link href="css/style.css" rel="stylesheet" />
</head>

<body>
	<c:if test="${current_user.roleid==2||current_user.roleid==0||current_user.roleid==1||current_user.roleid==7 }">
		<c:import url="header1.jsp"></c:import>
	</c:if>
	<c:if test="${current_user.roleid==3||current_user.roleid==4||current_user.roleid==6 }">
		<c:import url="header.jsp"></c:import>
	</c:if>
	<!-- 内容模块1 -->
	<div class="d2 allwidth">
		<h1>社区公告</h1>
		<table class="table table-hover">
			<caption><a href="addann.action">发布公告</a></caption>
			<tr>
				<th>用户</th>
				<th>标题</th>
				<th>类型</th>
				<th>发表时间</th>
				<th>浏览量</th>
			</tr>
			<c:forEach items="${liveList }" var="liveList">
				<tr>
					<td>
						<a href="#">作者：${liveList.userName }</a>
					</td>
					<td>
						<a href="#">标题：${liveList.title}</a>
					</td>
					<td>
						<a href="#">${liveList.kindName}</a>
					</td>
					<td>${liveList.datetime}</td>
					<td>267</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div class="d2 allwidth">
		<h1>社区生活</h1>
		<table class="table table-hover">
			<caption>发布社区生活</caption>
			<tr>
				<th>用户</th>
				<th>标题</th>
				<th>类型</th>
				<th>发表时间</th>
				<th>浏览量</th>
			</tr>
			<c:forEach items="${announcementList }" var="announcementList">
				<tr>
					<td>
						<a href="#">作者：${announcementList.userName }</a>
					</td>
					<td>
						<a href="#">标题：${announcementList.title}</a>
					</td>
					<td>
						<a href="#">${announcementList.kindName}</a>
					</td>
					<td>${announcementList.datetime}</td>
					<td>267</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<!-- 脚部 -->
	<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>