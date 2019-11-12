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
		<h3>
			<a href="wuyepay.action">发起物业缴费</a>
		</h3>
	</div>
	<div class="d2 allwidth">
		<h1>用户列表</h1>
		<table class="table table-hover">
			<caption>基本的表格布局</caption>
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>登录名</th>
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
					<td>${userVO.name }</td>
					<td>${userVO.loginname }</td>
					<td>${userVO.sex }</td>
					<td>${userVO.age }</td>
					<td>${userVO.tel }</td>
					<td>${userVO.housename }</td>
					<td>${userVO.roomname }</td>
					<td>${userVO.inputdate }</td>
					<td>
						<a onclick="check1(${userVO.id })" class="btn btn-default">发起水费</a>
						<a onclick="check2(${userVO.id })" class="btn btn-default">发起电费</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<!-- 脚部 -->
	<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->
	<script type="text/javascript">
		function check1(id) {
			var bulk = prompt("请输入所用水量：");
			console.log(1);
			if (bulk == null || bulk.trim() == "") {
				alert("水量不能为空！");
			} else {
				console.log(2);
				window.location.href = "waterpay.action?uid=" + id + "&bulk="
						+ bulk;
			}
		}
		function check2(id) {
			var bulk = prompt("请输入所用水量：");
			if (bulk == null || bulk.trim() == "") {
				alert("电量不能为空！");
			} else {
				window.location.href = "elcpay.action?uid=" + id + "&bulk="
						+ bulk;
			}
		}
	</script>
</body>

</html>