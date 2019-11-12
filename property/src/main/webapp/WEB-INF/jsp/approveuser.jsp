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
	/**
	 * 页面加载显示所有单元
	 */
	$(function() {
		$.ajax({
			type : "post",
			url : "approve/showhm.action",
			data : {
				type : "1"
			},
			/* contentType : "application/json;charset=utf-8", */
			success : function(data) {
				var html = "<option value='0'>----</option>";
				var json = JSON.parse(data);
				$.each(json, function(i, list) {
					html += "<option value='" + list.id + "'>" + list.name
							+ "</option>";
				})
				$("#house").html(html);
			}
		});
	});
	/**
	 * 根据单元id查询房间
	 * 
	 */
	function shouroom(hid) {
		$.ajax({
			type : "post",
			url : "approve/showhm.action",
			data : {
				type : "2",
				hid : hid
			},
			/* contentType : "application/json;charset=utf-8", */
			success : function(data) {
				var html = "<option value='0'>----</option>";
				var json = JSON.parse(data);
				$.each(json, function(i, list) {
					html += "<option value='" + list.id + "'>" + list.name
							+ "</option>";
				})
				$("#room").html(html);
			}
		});
	}

	function check(rid) {
		$.ajax({
			type : "post",
			url : "approve/checkroom.action",
			data : {
				rid : rid
			},
			/* contentType : "application/json;charset=utf-8", */
			success : function(data) {
				if (data == "true") {
					$("#checkr").html("");
				} else {
					$("#checkr").html("NO");
				}
			}
		});
	}
	function approve() {
		var house = $("#house").val();
		var room = $("#room").val();
		var checkr = $("#checkr").html();
		if (house == '0') {
			alert("楼号未选");
			return;
		}
		if (room == '0') {
			alert("房号未选");
			return;
		}
		if (checkr != "") {
			alert("房号已被认证");
			return;
		} else {
			$("#form").submit();
		}

	}
</script>

</head>

<body>

	<c:if test="${current_user.roleid==2 }">
		<c:import url="header1.jsp"></c:import>
	</c:if>
	<c:if test="${current_user.roleid==3 }">
		<c:import url="header.jsp"></c:import>
	</c:if>

	<!--中间内容部分开始-->
	<div class="container allwidth">
		<h1>用户认证信息</h1>
		<table class="table table-hover">
			<tr>
				<td>编号</td>
				<td>${user.id }</td>
				<td rowspan="8" style="text-align: center;">
					<img alt="房产证" src="img/fangchanzheng.jpg">
				</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td>${user.name }</td>
			</tr>
			<tr>
				<td>性别</td>
				<td>${user.sex }</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td>${user.age }</td>
			</tr>
			<tr>
				<td>电话号码</td>
				<td>${user.tel }</td>
			</tr>
			<tr>
				<td>注册时间</td>
				<td>${user.inputdate }</td>
			</tr>
			<tr>
				<td>注册IP地址</td>
				<td>${user.ip }</td>
			</tr>
			<form id="form" method="post" action="approve/approveing.action">
				<input type="hidden" name="id" value="${user.id }">
			<tr>
				<td>
					单元
					<select name="houseid" id="house" class="form-control address" onchange="shouroom(this.value)">
						<option value='0'>----</option>
					</select>
				</td>
				<td>
					房号
					<select name="roomid" id="room" class="form-control address" onchange="check(this.value)">
						<option value='0'>----</option>
					</select>
					<span id="checkr" style="color: red;"></span>
				</td>
			</tr>
			</form>
			<tr>
				<td colspan="3" style="text-align: center;">
					<a class="btn btn-success" onclick="approve()" style="cursor: pointer;">认证</a>
					&nbsp;&nbsp;&nbsp;
					<a class="btn btn-info" onclick="window.history.go(-1)" style="cursor: pointer;">返回</a>
				</td>
			</tr>
		</table>
	</div>
	<!--内容部分结束-->


</body>

</html>