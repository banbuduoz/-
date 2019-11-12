<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

</head>

<body>
	<!--导航栏盒子-->
	<c:if
		test="${current_user.roleid==2||current_user.roleid==0||current_user.roleid==1||current_user.roleid==7 }">
		<c:import url="header1.jsp"></c:import>
	</c:if>
	<c:if test="${current_user.roleid==3||current_user.roleid==4||current_user.roleid==6 }">
		<c:import url="header.jsp"></c:import>
	</c:if>
	<!--中间内容部分开始-->
	<div class="container fourzerofour">
		<img src="static/img/404.jpg" />
	</div>
	<!--内容部分结束-->

	<!-- 脚部 -->
	<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->

</body>

</html>