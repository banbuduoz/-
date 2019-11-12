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
<html class="no-js">
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>小区物业系统</title>
<meta name="description" content="这是一个 table 页面">
<meta name="keywords" content="table">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="assets/css/amazeui.min.css" />
<link rel="stylesheet" href="assets/css/admin.css">
<script type="text/javascript">
	function check() {
		var flas = false;
		var checkval = [];
		var checkbox = $("input[name=ids]");
		for (var i = 0; i < checkbox.length; i++) {
			console.log(checkbox[i].checked)
			if (checkbox[i].checked) {
				flas = true;
				checkval.push(checkbox[i].value);
			}
		}
		if (flas) {
			if (confirm("确定删除么")) {
				$("form").submit();
			}
		} else {
			alert("请选择删除的业务");
		}
	}
	$(function() {
		$("#all").change(
				function() {
					if ($(this).is(":checked")) {
						var box = $("input[name=ids]");
						if (box.length == box.not(":checked").length) {
							$("input[name=ids]").prop('checked', true);
						} else {
							$("input[name=ids]").each(
									function() {
										$(this).prop(
												"checked",
												$(this).is(":checked") ? false
														: true);
									});
						}
					} else {
						$("input[name=ids]").prop("checked", false);
					}
				});
	});
</script>
</head>
<body>
	<c:import url="header1.jsp"></c:import>
	<div class="container allwidth">
		<div class="admin-content">

			<div class="am-cf am-padding">
				<div class="am-fl am-cf">
					<strong class="am-text-primary am-text-lg">业务查询</strong>
				</div>
			</div>

			<div class="am-g">
				<div class="am-u-md-6 am-cf">
					<div class="am-fl am-cf">
						<div class="am-btn-toolbar am-fl">
							<div class="am-btn-group am-btn-group-xs">
								<button type="button" class="am-btn am-btn-default">
									<span class="am-icon-plus"></span> <a
										href="complaint/toadd.action">新增</a>
								</button>
								<button onclick="check()" type="button"
									class="am-btn am-btn-default">
									<span class="am-icon-trash-o"></span> 删除
								</button>
							</div>
							
							<%-- <div class="am-form-group am-margin-left am-fl">
								<select class="form-control" id="kindid" name="kindid">
									<c:forEach items="${serviceKind }" var="kindid">
										<option value="${kindid.id }">${kindid.name }</option>
									</c:forEach>
								</select>
							</div> --%>
						</div>
					</div>
				</div>
			</div>

			<div class="am-g">
				<div class="am-u-sm-12">
					<form id="form" action="complaint/complaintdelete.action"
						class="am-form" method="post">
						<table class="am-table am-table-striped am-table-hover table-main">
							<thead>
								<tr>
									<th class="table-check"><input id="all" type="checkbox" /></th>
									<th class="table-id">序号</th>
									<th class="table-title">服务名称</th>
									<th class="table-type">申请服务类型</th>
									<th class="table-date">发起时间</th>
									<th class="table-author">申请状态</th>
									<th class="table-set">操作</th>
								</tr>
							</thead>
							<tbody>

								<c:forEach items="${serviceList }" var="serviceList"
									varStatus="count">
									<tr>
										<td><input name="ids" type="checkbox"
											value="${serviceList.id }" /></td>
										<td>${count.count }</td>
										<td>${serviceList.title}</td>
										<td>${serviceList.kName }</td>
										<td>${serviceList.starttime }</td>
										<td>${serviceList.sName }</td>
										<td>
											<div class="am-btn-toolbar">
												<div class="am-btn-group am-btn-group-xs">

													<a
														class="am-btn am-btn-default am-btn-xs am-text-secondary"
														href="complaint/toupdate.action?service_id=${serviceList.id }">
														<span class="am-icon-pencil-square-o"></span> </span>评价
													</a> 
													
													<a
														class="am-btn am-btn-default am-btn-xs am-text-secondary"
														href="complaint/complaintselectone.action?setviceid=${serviceList.id }"><span
														class="am-icon-copy"></span>查看
													</a> 
													
													<a
														class="am-btn am-btn-default am-btn-xs am-text-secondary"
														href="complaint/complaintdelete.action?ids=${serviceList.id }">
														<span class="am-icon-trash-o"></span> 删除
													</a>
												</div>
											</div>
										</td>
									</tr>

								</c:forEach>




							</tbody>
						</table>
					</form>
				</div>

			</div>
		</div>
		<!-- content end -->
	</div>
	</div>

	<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->

	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/amazeui.min.js"></script>
	<!--<![endif]-->
	<script src="assets/js/app.js"></script>
	<c:import url="foot.jsp"></c:import>
</body>
</html>
