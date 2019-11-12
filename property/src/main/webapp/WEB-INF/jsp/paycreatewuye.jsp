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
		<form action="">
			<table class="table table-hover">
				<caption>基本的表格布局</caption>
				<tr>
					<td>
						
					</td>
					<td>
						<a href="#">作者：富兰克林</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<!-- 脚部 -->
		<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>