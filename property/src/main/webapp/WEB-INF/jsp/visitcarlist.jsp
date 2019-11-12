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
	var info=prompt("请输入备注信息：");
	if (info==null||info.trim()=="") {
		alert("备注信息不能为空！");
	}else{
		$("#id").val(id);
		$("#info").val(info);
		$("#form").submit();
	}
}
function addcar() {
	var carnum=$("#carnum").val();
	if (carnum==null||carnum.trim()=="") {
		alert("车牌号不能为空！");
	}else{
		$("#form1").submit();
	}
	}
/* $(function() {
	showcarlist();
});

 查询外来车辆出入记录 
function showcarlist() {
	$.ajax({
		type:"post",
		  url: "visit/showcarlist.action",
		  success: function(data) {
			var json=JSON.parse(data);
			  var html="";
			  if (json.length==0) {
				  var html=""
			} else {
				html+="<tr><th>外来车辆车牌号</th><th>进入时间</th><th>离开时间</th><th>应付金额</th><th>备注信息</th><th>信息录入人员</th><th>操作</th></tr>";
				$.each(json,function(i,carVO){
				html+="<tr><th>"+carVO.carnum+"</th><th>"+carVO.intime+"</th><th>"+carVO.outtime+"</th><th>"+carVO.pay+"</th><th>"+carVO.info+"</th><th>"+carVO.uName+"</th><th><a class='btn btn-success' onclick='fun("+carVO.id+")' style='cursor: pointer;'>编辑备注</a>";
				if (carVO.outtime==null) {
					html+="<a class='btn btn-info' href='visit/?id="+carVO.id+"'>离开</a>";
							}
				html+="</th></tr>";	
				});
			}
			 $("#table") .html(html);
			
		}
		});
}

function addcar() {
	var carnum=$("#carnum").val();
	var uid = $("#current_user_id").val();
	if (carnum==null||carnum.trim()=="") {
		alert("车牌号不能为空！");
	}else{
		$.ajax({
			type:"post",
			  url: "visit/addvisitcar.action",
			  data: {carnum:carnum,uid:uid},
			  success: function(flag) {
				 if (flag) {
					 showcarlist();
					 $("#carnum").val("");
				}
			}
			});
	}
	
} */
</script>
</head>

<body>
	<!-- 头部 -->
<c:import url="header.jsp"></c:import>
	<!-- 头部结束 -->

	<!--中间内容部分开始-->
	<div class="d2 allwidth">
		<h1>外来车辆出入登记表</h1>
		<form id="form1" action="visit/addvisitcar.action" method="post">
			<input id="carnum" name="carnum" type="text" class="form-control" placeholder="请输入车牌号">
			<!-- 需要引入当前用户id -->
			<input type="hidden" id="current_user_id" name="uid" value="1">
			<a class="btn btn-success" onclick="addcar()" style="cursor: pointer; margin: 10px 0">添加</a>
		</form>
		<form id="form" action="visit/changecarinfo.action" method="post">
			<input id="id" type="hidden" name="id">
			<input id="info" type="hidden" name="info">
		</form>
		<table id="table" class="table table-hover">
			<tr>
				<th>外来车辆车牌号</th>
				<th>进入时间</th>
				<th>离开时间</th>
				<th>应付金额</th>
				<th>备注信息</th>
				<th>信息录入人员</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${carVOs}" var="carVO">
				<tr>
					<th>${carVO.carnum}</th>
					<th>${carVO.intime}</th>
					<th>${carVO.outtime}</th>
					<th>${carVO.pay}</th>
					<th>${carVO.info}</th>
					<th>${carVO.uName}</th>
					<th>
						<a class="btn btn-success" onclick="fun(${carVO.id })" style="cursor: pointer;">编辑备注</a>
						<c:if test="${carVO.outtime==null}">
							<a class="btn btn-info" href="visit/leavecar.action?id=${carVO.id }">离开</a>
						</c:if>
					</th>
				</tr>
			</c:forEach>
		</table>
		</form>
	</div>
	<!--内容部分结束-->

	<!-- 脚部 -->
	<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>