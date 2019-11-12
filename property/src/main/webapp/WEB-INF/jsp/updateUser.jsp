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
	<c:if test="${current_user.roleid==2||current_user.roleid==0||current_user.roleid==1||current_user.roleid==7 }">
		<c:import url="header1.jsp"></c:import>
	</c:if>
	<c:if test="${current_user.roleid==3||current_user.roleid==4||current_user.roleid==6 }">
		<c:import url="header.jsp"></c:import>
	</c:if>
	<!--中间内容部分开始-->
	<div class="container allwidth">
		<div class="widthtwo regist">
			<h1>修&nbsp;改&nbsp;用&nbsp;户</h1>
			<form id="form1" action="user/update.action" method="post">
				<table class="t1">
					<input type="hidden" name="id" value="${user.id }">
					<tr>
						<td>
							name:
							<input id="name" onblur="nameBlur()" type="text" class="form-control" name="name" value="${user.name }" />
							<span id="name_exit" style="color: red;"></span>
						</td>
					</tr>
					<tr>
						<td>
							loginname:
							<input id="loginname" onblur="nameBlur()" type="text" class="form-control" name="loginname" value="${user.loginname }" />
							<span id="name_exit" style="color: red;"></span>
						</td>
					</tr>
					<tr>
						<td>
							pass:
							<input id="pass1" type="password" class="form-control" name="pass" value="${user.pass }" />
						</td>
					</tr>
					<c:if test="${current_user.roleid==6 }">
						<tr>
							<td>
								role:
								<select name="roleid">
									<option value="1">用户</option>
									<option value="1">业主</option>
									<option value="1">安保</option>
									<option value="1">员工</option>
									<option value="1">删除</option>
								</select>
							</td>
						</tr>
					</c:if>

					<tr>
						<td>
							tel:
							<input id="tel" type="tel" class="form-control" name="tel" value="${user.tel }" />
						</td>
					</tr>
					<tr>
						<td>
							age:
							<input id="pass1" type="number" class="form-control" name="age" value="${user.age }" />
						</td>
					</tr>

					<tr class="button1">
						<td align="center">
							<button id="" type="submit" onclick="check()" class="btn btn-success">提交</button>
							<button type="reset" class="btn btn-info">重置</button>
						</td>
					</tr>

				</table>
			</form>
		</div>
	</div>
	<!--内容部分结束-->

	<!-- 脚部 -->
	<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>