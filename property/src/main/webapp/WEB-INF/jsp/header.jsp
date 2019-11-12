<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 引入 Bootstrap -->
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="static/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="static/js/bootstrap.min.js"></script>
<link href="static/css/style.css" rel="stylesheet" />
</head>
<body>
	<!--导航栏盒子-->
	<div class="d1">
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container-fluid allwidth">
				<div>
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="index.action">网站首页</a>
						</li>


						<li>
							<a href="user/showinfo.action">个人信息</a>
						</li>
						<li>
							<a href="user/toupdate.action">信息修改</a>
						</li>
						<c:if test="${current_user==null }">
							<li>
								<a href="login.action">登录</a>
							</li>
							<li>
								<a href="user/regist.action">注册</a>
							</li>
						</c:if>
						<li>
							<a href="visit/tovisitcarlist.action">车辆出入管理</a>
						</li>
						<li>
							<a href="visit/showpersonlist.action">人员出入管理</a>
						</li>
						<li>
							<a href="dealtb/todealtb.action">报修/投诉</a>
						</li>
						<li>
							<a href="topay.action">物业缴费</a>
						</li>

						<li>
							<a onclick="window.history.go(-1)" style="cursor: pointer;">返回</a>
						</li>
						<li>
							<c:if test="${current_user!=null}">
								<li>
									<a href="loginout.action">退出</a>
								</li>
							</c:if>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								安全管理
								<b class="caret"></b>
							</a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">设备巡检</a>
								</li>
								<li class="divider"></li>
								<li>
									<a href="#">隐患排查</a>
								</li>
								<li class="divider"></li>
								<li>
									<a href="#">日常巡逻</a>
								</li>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								人员管理
								<b class="caret"></b>
							</a>
							<ul class="dropdown-menu">
								<li>
									<a href="user/userlist.action?rid=1">业主及用户</a>
								</li>
								<li class="divider"></li>
								<li>
									<a href="user/userlist.action?rid=2">物业人员</a>
								</li>
								<li class="divider"></li>
								<li>
									<a href="approve/showuserlist.action">业主认证</a>
								</li>
								<c:if test="${current_user.roleid==6 }">
									<li class="divider"></li>
									<li>
										<a href="user/userlist.action">全部用户</a>
									</li>
								</c:if>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								业主论坛
								<b class="caret"></b>
							</a>
							<ul class="dropdown-menu">
								<li>
									<a href="announcement.action?kid=2">寻物启事</a>
								</li>
								<li class="divider"></li>
								<li>
									<a href="announcement.action?kid=1">失物招领</a>
								</li>
								<li class="divider"></li>
								<li>
									<a href="announcement.action?kid=3">跳蚤市场</a>
								</li>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								更多
								<b class="caret"></b>
							</a>
							<ul class="dropdown-menu">
								<li>
									<a href="announcement.action">社区服务</a>
								</li>
								<li class="divider"></li>
								<li>
									<a href="#">物业资产管理</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
	<div class="banner1">
		<div class="container">
			<h1>柏翠园二期</h1>
			<h2>欢迎您的到来！！！</h2>
			<!-- <p class="masthead-button-links">
				<a class="btn btn-lg btn-primary btn-shadow" href="https://v3.bootcss.com/css/" target="_blank" role="button"
					onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-Bootstrap3中文文档'])">Bootstrap3中文文档(v3.3.7)</a>
			</p>
			<ul class="masthead-links">
				<li>
					<a href="https://v3.bootcss.com/css/" target="_blank" role="button"
						onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-Bootstrap2中文文档'])">Bootstrap2中文文档(v2.3.2)</a>
				</li>
			</ul> -->
		</div>
	</div>
	<!--热门社区-->
	<!-- <div class="bc-social">
		<div class="container">
			<ul class="bc-social-buttons">
				<li class="social-forum">
					<a class="" href="http://wenda.bootcss.com" title="Bootstrap问答社区" target="_blank"
						onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-Bootstrap问答社区'])">
						<i class="fa fa-comments"></i>
						Bootstrap问答社区
					</a>
				</li>
				<li class="social-weibo">
					<a href="http://weibo.com/bootcss" title="Bootstrap中文网官方微博" target="_blank"
						onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-新浪微博'])">
						<i class="fa fa-weibo"></i>
						新浪微博：@Bootstrap中文网
					</a>
				</li>
			</ul>
		</div>
	</div> -->

</body>
</html>