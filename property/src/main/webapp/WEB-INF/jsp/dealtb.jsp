<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
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
		var result = prompt("请输入处理结果信息：");
		if (result == null || result.trim() == "") {
			alert("处理结果信息不能为空！");
		} else {
			$("#id").val(id);
			$("#result").val(result);
			$("#form").submit();
		}
	}
</script>
</head>

<body>
	<c:import url="header.jsp"></c:import>
	<!-- 内容模块1 -->
	<div class="d2 allwidth">
		<form id="form" action="dealtb/dealserviceresult.action" method="post">
			<input id="id" type="hidden" name="id">
			<input id="result" type="hidden" name="result">
		</form>
		<h1>报修</h1>
		<table class="table table-hover">
			<tr>
				<th>类型</th>
				<th>标题</th>
				<th>用户姓名</th>
				<th>备注内容</th>
				<th>发布时间</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
			<a name="baoxiu"></a>
			<c:forEach items="${baoxiuList}" var="baoxiuList">
				<c:if test="${baoxiuList.sid!=3 }">
					<tr>
						<td>${baoxiuList.kName}</td>
						<td>${baoxiuList.title}</td>
						<td>${baoxiuList.uName}</td>
						<td>${baoxiuList.info}</td>
						<td>${baoxiuList.starttime}</td>
						<td>${baoxiuList.sName}</td>
						<td>
							<a class="btn btn-info">查看</a>
							<c:if test="${baoxiuList.sid==1 }">
								<a class="btn btn-success" href="dealtb/dealservice.action?id=${baoxiuList.id }"
									style="cursor: pointer;">处理</a>
							</c:if>
							<c:if test="${baoxiuList.sid==2 }">
								<a class="btn btn-info" onclick="fun(${baoxiuList.id })" style="cursor: pointer;">结束</a>
							</c:if>

						</td>
					</tr>
				</c:if>
			</c:forEach>
		</table>
		<a href="dealtb/todealtb.action#baoxiu" class="btn btn-info"
			style="position: fixed; right: 10%; bottom: 20%;">报修</a>
		<a href="dealtb/todealtb.action#tousu" class="btn btn-info"
			style="position: fixed; right: 10%; bottom: 30%;">投诉</a>

		<h1>投诉</h1>
		<table class="table table-hover">
			<tr>
				<th>类型</th>
				<th>标题</th>
				<th>用户姓名</th>
				<th>备注内容</th>
				<th>发布时间</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
			<a name="tousu"></a>
			<c:forEach items="${tousuList}" var="tousuList">
				<c:if test="${tousuList.sid!=3 }">
					<tr>
						<td>${tousuList.kName}</td>
						<td>${tousuList.title}</td>
						<td>${tousuList.uName}</td>
						<td>${tousuList.info}</td>
						<td>${tousuList.starttime}</td>
						<td>${tousuList.sName}</td>
						<td>
							<a class="btn btn-info">查看</a>
							<c:if test="${tousuList.sid==1 }">
								<a class="btn btn-success" href="dealtb/dealservice.action?id=${tousuList.id }"
									style="cursor: pointer;">处理</a>
							</c:if>
							<c:if test="${tousuList.sid==2 }">
								<a class="btn btn-info" onclick="fun(${tousuList.id })" style="cursor: pointer;">结束</a>
							</c:if>
						</td>
					</tr>
				</c:if>
			</c:forEach>
		</table>
	</div>
	<!-- 脚部 -->
	<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>