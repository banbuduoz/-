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
<!-- 引入 Bootstrap -->
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="static/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="static/js/bootstrap.min.js"></script>
<link href="static/css/style.css" rel="stylesheet" />
<script type="text/javascript">
function fun(id) {
	var info=prompt("请输入备注信息：");
	if (info==null||info.trim()=="") {
		alert("备注信息不能为空！");
	}else{
		$("#id").val(id);
		$("#info").val(info);
		$("#form").submit();
	}
}

</script>
</head>

<body>
	<!-- 头部 -->

	<!-- 头部结束 -->

	<!--中间内容部分开始-->
	<div class="d2 allwidth">
		<h1>外来人员出入登记表</h1>
		<form id="form" action="visit/changepersoninfo.action" method="post">
			<input id="id" type="hidden" name="id">
			<input id="info" type="hidden" name="info">
		</form>
		<table class="table table-hover">
			<tr>
				<th>外来人员姓名</th>
				<th>电话</th>
				<th>拜访人姓名</th>
				<th>进入时间</th>
				<th>离开时间</th>
				<th>备注信息</th>
				<th>信息录入人员</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${personVOs}" var="personVO" varStatus="i">
				<tr>
					<th>${personVO.name}</th>
					<th>${personVO.tel}</th>
					<th>${personVO.visitname}</th>
					<th>${personVO.intime}</th>
					<th>${personVO.outtime}</th>
					<th>${personVO.info}</th>
					<th>${personVO.uname}</th>
					<th>
						<a onclick="fun(${personVO.id })" style="cursor: pointer;">编辑备注</a>
						<c:if test="${personVO.outtime==null}">
							<a href="../visit/leavepserson.action?id=${personVO.id }">离开</a>
						</c:if>
					</th>
				</tr>
			</c:forEach>
		</table>
		</form>
	</div>
	<!--内容部分结束-->

	<!-- 脚部 -->

	<!-- 脚部结束 -->
</body>

</html>