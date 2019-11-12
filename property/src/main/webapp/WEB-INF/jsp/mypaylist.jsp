<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title></title>
</head>
<body>
	<c:import url="header1.jsp"></c:import>
	<!-- 内容模块1 -->
	<div class="d2 allwidth">
		<h1>用户列表</h1>
		<table class="table table-hover">
			<caption>基本的表格布局</caption>
			<tr>
				<th>缴费名称</th>
				<th>缴费月份</th>
				<th>缴费状态</th>
				<th>应缴</th>
				<th>实缴</th>
				<th>欠费</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${paylist }" var="payVO">
				<tr>
					<td>${payVO.chargename }</td>
					<td>${payVO.paymonth }</td>
					<td>
						<c:if test="${payVO.paystate==0 }">未缴清</c:if>
						<c:if test="${payVO.paystate==1 }">已缴清</c:if>
					</td>
					<td>${payVO.chargestandard }</td>
					<td>${payVO.payreal }</td>
					<td>${payVO.paybalance }</td>
					<td>
						<button type="button" onclick="check(${payVO.id},${payVO.chargestandard },${payVO.payreal })">缴费</button>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<!-- 脚部 -->
	<c:import url="foot.jsp"></c:import>
	<!-- 脚部结束 -->
	<script type="text/javascript">
	function check(id,chargestandard,payreala){
		var payreal = prompt("请输入所缴费用：");
		
		var a=parseFloat(payreal);//所缴费用
		var b=parseFloat(chargestandard);//应缴费用
		var c=parseFloat(payreala);//已缴费用
		var d=a+c;//所缴费+现缴费
		if (payreal == null || payreal.trim() == "") {
			alert("费用不能为空！");
		} else {
		     if(b-d>=0){
				window.location.href = "pay.action?payreal="+d+"&id="+id;
				}else{
				alert("所缴费用不能大于应缴费用！");
			}
		 }
		}
	
	
	</script>
</body>

</html>