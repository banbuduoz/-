<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title></title>
</head>

<body>
	<c:import url="header.jsp"></c:import>
	<!-- 内容模块1 -->
	<div class="d2 allwidth">
		<h1>热门公告</h1>
		<table class="table table-hover">
			<caption>保修</caption>
			<tr>
				<th>用户</th>
				<th>标题</th>
				<th>类型</th>
				<th>发表时间</th>
				<th>浏览量</th>
			</tr>
			<c:forEach items="${baoxiuList}" var="baoxiuList">
				<tr>
					<td>
						<a href="#">
							作者：${baoxiuList.uName}
							<a>
					</td>
					<td>
						<a href="#">标题：${baoxiuList.title}</a>
					</td>
					<td>
						<a href="#">${baoxiuList.kName}</a>
					</td>
					<td>${baoxiuList.starttime}</td>
					<td>0</td>
				</tr>
			</c:forEach>

		</table>

		<h1>公告列表</h1>
		<table class="table table-hover">
			<caption>投诉</caption>
			<tr>
				<th>作者</th>
				<th>标题</th>
				<th>类型</th>
				<th>发表时间</th>
				<th>浏览量</th>
			</tr>
			<c:forEach items="${tousuList}" var="tousuList">
				<tr>
					<td>
						<a href="#">
							作者：${tousuList.uName}
							<a>
					</td>
					<td>
						<a href="#">标题：${tousuList.title}</a>
					</td>
					<td>
						<a href="#">${tousuList.kName}</a>
					</td>
					<td>${tousuList.starttime}</td>
					<td>0</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<!-- 脚部 -->
	<c:import url="foot.jsp"></c:import>
</body>

</html>