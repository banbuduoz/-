<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="bp" value="<%=basePath%>"></c:set>


<html>

<head>
<base href="<%=basePath%>">
<meta charset="utf-8" />
<title></title>


</head>

<body>
	<!--导航栏盒子-->
	<c:import url="header.jsp"></c:import>

	<!--中间内容部分开始-->
	<div class="container allwidth">
		<div class="widthtwo regist">
			<h1>注&nbsp;册&nbsp;用&nbsp;户</h1>
			<form id="form1" action="user/regist.action" method="post">
				<table class="t1">
					<tr>
						<td>用户名:<input required="required" id="loginname" onblur="nameBulr()" type="text" class="form-control" name="loginname"
							placeholder="请输入你的名字" /> <span id="name_exit" style="color: red;"></span>
						</td>
					</tr>
					<tr>
						<td>密码:<input required="required" id="pass" type="password" class="form-control" name="pass" placeholder="请输入你的密码" /></td>
					</tr>
					<tr>
						<td>重复输入:<input required="required" id="pass2" type="password" class="form-control" name="pass2" placeholder="重复输入一遍" /></td>
					</tr>
					<tr>
					<tr class="button1">
						<td align="center">
							<button type="button" onclick="check()" class="btn btn-success">提交</button>
							<button type="reset" class="btn btn-info">取消</button>
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
	<script type="text/javascript">
		function nameBulr() {
			var loginName = document.getElementById("loginname").value;
			$.ajax({
				type : "POST",
				url : "user/registcheck.action",
				data : {
					loginname : loginName
				},
				success : function(reslut) {
					console.log(reslut);
					if (reslut == "true") {
						$("#name_exit").html("");
					} else {

						$("#name_exit").html("重复了");
					}
				},
			});
		}

		function check() {
			var pass = $("#pass").val();
			var pass2 = $("#pass2").val();
			/* var loginname = $("#loginname").val();
			if (loginname == "") {
				alert("用户名不能空");
				return false;
			} */
			var loginName = document.getElementById("loginname").value;
			if (loginName == "") {
				return;
			}

			if (pass == "") {
				alert("密码不空");
				return false;
			}
			if (pass == pass2) {
				$("#form1").submit(); 
			} else {
				alert("密码不相同");
				return;
			}

		}
	</script>
</body>

</html>