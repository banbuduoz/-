<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title></title>
		<!-- 引入 Bootstrap -->
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
		<script src="js/jquery.js"></script>
		<!-- 包括所有已编译的插件 -->
		<script src="js/bootstrap.min.js"></script>
		<link href="css/style.css" rel="stylesheet" />
	</head>

	<body>
	
	<c:import url="header.jsp"></c:import>
		<!-- 内容模块1 -->
		<div class="d2 allwidth">
			<!--用户信息-->
			<div id="userinfo" class="templatemo-container userinfo">
				<ul>
					<li><span class="glyphicon glyphicon-user">：莱奥纳多</span></li>
					<li><span class="glyphicon glyphicon-tree-conifer">：</span>
						<c:if test="${user.sex=='f'}">♂</c:if>&nbsp;
						<c:if test="${user.sex!='f'}">♀</c:if>
					</li>
					<li><span class="glyphicon glyphicon-circle-arrow-right">：</span>22</li>
					<li><span class="glyphicon glyphicon-earphone">：128304893</span></li>
					<c:if test="${current_user != null }">
					<!--	<li>
							<a href="showbloglist.action?type=1&uid=${current_user.id }">click me into my blog</a>
						</li>-->
						<li>
							<a href="#">发起投诉</a>
						</li>
					</c:if>
				</ul>
			</div>
			<!--用户博客概要列表-->
			<div class="schemalist">
				<table class="table table-hover bloglist">
					<tr class="personbloginfo_tr">
						<th style="width:10%;">物主</th>
						<th>投诉</th>
						<th>投诉时间</th>
					</tr>
					<!--要循环的博客概要-->
					<tr class="personbloginfo_tr">
						<td class="line">
							<a href="showbloglist.action?type=1&uid=${blog.uid }">莱奥纳多</a>
						</td>
						<td class="line">
							<span class="schema_title">你的下水道坏了</span>
						</td>
						<td class="line">
							<span class="schema_time">时间：<fmt:formatDate pattern="yyyy/MM/dd" value="2019-05-15"/>2019-05-15</span>
							<span class="blogedit">
	                    		<a onclick="delete_blog(${blog.id })">撤回</a>&nbsp;|&nbsp;
	                    		<a href="editblog.action?type=2&id=${blog.id }">修改</a>
		                    	</span>
						</td>
					</tr>
					<tr class="personbloginfo_tr">
						<td class="layout" colspan="3">
							<a href="showbloginfo.action?id=${blog.id }">
								羚羊最快的奔跑时速只有70公里，而猎豹的奔跑时速可以达到100公里。按常理，猎豹捕获羚羊那是十拿九稳的事，但事实并非如此，猎豹每次出击，它的成功概率不到10%。那么，羚羊又是怎样从猎豹的魔爪下而一次次成功逃脱的呢？羚羊最快的奔跑时速只有70公里，而猎豹的奔跑时速可以达到100公里。按常理，猎豹捕获羚羊那是十拿九稳的事，但事实并非如此
							</a>
						</td>
					</tr>
					
				
				</table>
			</div>
		</div>
		<!-- 脚部 -->
			<c:import url="foot.jsp"></c:import>
		<!-- 脚部结束 -->
	</body>

</html>

