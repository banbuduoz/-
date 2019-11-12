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
		var appraise = $("#appraise").val();
		if (appraise.trim() == "") {
			alert("评价不能为空");
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
			<h1>评价</h1>
			<form id="form1" action="complaint/complaintupdate.action"
				method="post">
				<table class="table table-hover">
					<input hidden="hidden" name="id" value="${service.id }" />
					<tr>
						<td>服务名称</td>
						<td>${service.title }</td>

					</tr>
					<tr>
						<td>服务信息</td>
						<td>${service.info }</td>
					</tr>
					<tr>
						<td>审批状态</td>
						<td>${state.name }</td>
					</tr>
					<tr>
						<td>发起时间</td>
						<td>${service.starttime }</td>
					</tr>

					<tr>
						<td>结束时间</td>
						<td>${service.endtime }</td>
					</tr>
					<tr>
						<td>申请服务类型</td>
						<td>${serviceKind.name }</td>
					</tr>
					<tr>
						<td>服务结果</td>
						<td>${service.result }</td>
					</tr>
					<tr>
						<td>评价</td>
						<c:if test="${service.sid==3}">
							<c:if test="${service.appraise==null }">
								<td><textarea required="required" class="form-control"
										id="appraise" name="appraise">${service.appraise }</textarea>
								</td>
							</c:if>
							<c:if test="${service.appraise!=null }">
								<td>${service.appraise }</td>
							</c:if>
						</c:if>
						<c:if test="${service.sid!=3 }">
							<td>处理完成之后可评价</td>
						</c:if>
					</tr>

					<c:if test="${service.sid==3 }">
						<c:if test="${service.appraise==null }">
							<tr>
								<td align="center" colspan="2"><button type="submit"
										class="btn btn-success">submit</button></td>
							</tr>
						</c:if>
						<c:if test="${service.appraise!=null }">
							<tr>
								<td colspan="2" style="text-align: center;"><a
									onclick="window.history.go(-1)" style="cursor: pointer;"
									class="btn btn-success">返回</a></td>
							</tr>
						</c:if>
					</c:if>
					<c:if test="${service.sid!=3 }">
						<tr>
							<td colspan="2" style="text-align: center;"><a
								onclick="window.history.go(-1)" style="cursor: pointer;"
								class="btn btn-success">返回</a></td>
						</tr>
					</c:if>
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