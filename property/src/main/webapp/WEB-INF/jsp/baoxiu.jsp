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
		<!--导航栏盒子-->
		<div class="d1">
			<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
				<div class="container-fluid allwidth">
					<div class="navbar-header">
						<a class="navbar-brand" href="#">欢迎来到博客园</a>
					</div>
					<div>
						<ul class="nav navbar-nav">
							<li class="active">
								<a href="index.html">网站首页</a>
							</li>
							<li>
								<a href="bloglist.html">博客浏览</a>
							</li>
							<li>
								<a href="userlist.html">用户列表</a>
							</li>							
							<li>
								<a href="login.html">登录</a>
							</li>
							<li>
								<a href="regist.html">注册</a>
							</li>
							<li>
								<a href="blogcreate.html">博客创建</a>
							</li>
							<li>
								<a href="personblogschemalist.html">我的博客</a>
							</li>
							<li>
								<a href="index.html">退出</a>
							</li>
							<li>
								<a onclick="window.history.go(-1)" style="cursor: pointer;">返回</a>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">
									博客类型
									<b class="caret"></b>
								</a>
								<ul class="dropdown-menu">
									<li>
										<a href="#">原创</a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="#">转载</a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="#">经典</a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="#">另一个分离的链接</a>
									</li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
		<!--第一个banner的内容-->
		<div class="banner1">
			<div class="container">
				<h1>博客园</h1>
				<h2>博客园软件工程师的宝典，让web开发更迅速、简单。</h2>
				<p class="masthead-button-links">
					<a class="btn btn-lg btn-primary btn-shadow" href="https://v3.bootcss.com/css/" target="_blank" role="button" onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-Bootstrap3中文文档'])">Bootstrap3中文文档(v3.3.7)</a>
				</p>
				<ul class="masthead-links">
					<li>
						<a href="https://v3.bootcss.com/css/" target="_blank" role="button" onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-Bootstrap2中文文档'])">Bootstrap2中文文档(v2.3.2)</a>
					</li>
				</ul>
			</div>
		</div>
		<!--热门社区-->
		<div class="bc-social">
			<div class="container">
				<ul class="bc-social-buttons">
					<li class="social-forum">
						<a class="" href="http://wenda.bootcss.com" title="Bootstrap问答社区" target="_blank" onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-Bootstrap问答社区'])">
							<i class="fa fa-comments"></i> Bootstrap问答社区
						</a>
					</li>
					<li class="social-weibo">
						<a href="http://weibo.com/bootcss" title="Bootstrap中文网官方微博" target="_blank" onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-新浪微博'])"><i class="fa fa-weibo"></i> 新浪微博：@Bootstrap中文网</a>
					</li>
				</ul>
			</div>
		</div>
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
							<a href="#">发起报修</a>
						</li>
					</c:if>
				</ul>
			</div>
			<!--用户博客概要列表-->
			<div class="schemalist">
				<table class="table table-hover bloglist">
					<tr class="personbloginfo_tr">
						<th style="width:10%;">业主</th>
						<th>报修</th>
						<th>报修时间</th>
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
	                    		<a onclick="delete_blog(${blog.id })">删除</a>&nbsp;|&nbsp;
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
