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


<script>
	function check() {
		var title = $("#title").val();
		var info = $("#info").val();
		var kindid = $("#kindid").val();
		if (kindid.trim() == "") {
			alert("申请服务类型不能为空");
			return;
		}
		if (title.trim() == "") {
			alert("名称不能为空");
			return;
		}
		if (info.trim() == "") {
			alert("信息不能为空");
			return;
		}
		if (confirm("确认保存吗?")) {
			$("#form1").submit();
		}
	}
</script>

<link href="static/css/style.css" rel="stylesheet" />
</head>

<body>
	<c:import url="header1.jsp"></c:import>

	<!--中间内容部分开始-->
	<div class="container allwidth">
		<div class="create">
			<h1>创建投诉/维修</h1>
			<form id="form1" action="complaint/complaintadd.action" method="post">
				<table class="templatemo-container">

					<tr>
						<td>申请服务类型kindid：<br /> <select class="form-control"
							id="kindid" name="kindid">
								<c:forEach items="${serviceKind }" var="kindid">
									<option value="${kindid.id }">${kindid.name }</option>
								</c:forEach>
						</select>
						</td>
					</tr>


					<tr>
						<td>服务名称title:<input required="required" id="title"
							type="text" class="form-control" name="title" />
						</td>
					</tr>

					<tr>
						<td>服务信息info:<br /> <textarea required="required"
								class="form-control" id="info" name="info"
								style="width: 1024px; resize: none;"></textarea>
						</td>
					</tr>
					<tr>
						<td align="center"><button type="button" onclick="check()"
								class="btn btn-success">submit</button></td>
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