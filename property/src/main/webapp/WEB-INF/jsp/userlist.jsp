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
		<h1>用户列表</h1>
		<table class="table table-hover">
			<caption>基本的表格布局</caption>
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>年龄</th>
				<th>电话号码</th>
				<th>单元</th>
				<th>房屋</th>
				<th>注册时间</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${userlist }" var="userVO">
				<tr>
					<td>${userVO.id }</td>
					<td>
						<a href="#">${userVO.name }</a>
					</td>
					<td>
						<a href="#">${userVO.sex }</a>
					</td>
					<td>${userVO.age }</td>
					<td>${userVO.tel }</td>
					<c:if test="${userVO.housename=='物业楼' }">
						<td></td>
					</c:if>
					<c:if test="${userVO.housename!='物业楼' }">
						<td>${userVO.housename }</td>
					</c:if>
					<td>${userVO.roomname }</td>
					<td>${userVO.inputdate }</td>
					<td>
						<a href="user/toupdate.action?uid=${userVO.id }">编辑</a>
					</td>
				</tr>
			</c:forEach>

		</table>

	</div>
	<!-- 脚部 -->
	<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>