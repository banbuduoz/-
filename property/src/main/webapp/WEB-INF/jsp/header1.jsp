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
<meta charset="utf-8" />
<title></title>
<!-- 引入 Bootstrap -->
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="static/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="static/js/bootstrap.min.js"></script>
<link href="static/css/style.css" rel="stylesheet" />
</head>

<body>
	<!--业主导航栏盒子-->
	<div class="d1">
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container-fluid allwidth">
				<div>
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="index.action">网站首页</a>
						</li>

						<li>
							<a href="announcement.action">公告浏览</a>
						</li>

						<li>
							<a href="user/showinfo.action">个人信息</a>
						</li>
						<li>
							<a href="user/toupdate.action">信息修改</a>
						</li>

						<c:if test="${current_user==null}">
							<li>
								<a href="login.html">登录</a>
							</li>
							<li>
								<a href="regist.html">注册</a>
							</li>
						</c:if>
						<c:if test="${current_user.roleid==2}">
							<li>
								<a href="mypay.action">物业缴费</a>
							</li>

							<li>
								<a href="complaint/complaintselect.action">业务投诉</a>
							</li>



							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">
									业主互动
									<b class="caret"></b>
								</a>
								<ul class="dropdown-menu">
									<li>
										<a href="toaddann.action">寻物启事</a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="toaddann.action">失物招领</a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="toaddann.action">社区生活</a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="toaddann.action">跳蚤市场</a>
									</li>
									<li class="divider"></li>
								</ul>
							</li>
						</c:if>
						<li>
							<a onclick="window.history.go(-1)" style="cursor: pointer;">返回</a>
						</li>
						<c:if test="${current_user!=null}">
							<li>
								<a href="loginout.action">退出</a>
							</li>
						</c:if>
					</ul>
				</div>
			</div>
		</nav>
	</div>


	<!--第一个banner的内容-->
	<div class="banner1">
		<div class="container">
			<h1>欢迎回家</h1>
			<h2>柏翠园二期物业管理</h2>
			<p class="masthead-button-links"></p>
			<ul class="masthead-links">
				<li></li>
			</ul>
		</div>
	</div>
	<!--热门社区-->
	<div class="bc-social">
		<div class="container">
			<ul class="bc-social-buttons">
				<li class="social-forum">
					<a class="" href="http://wenda.bootcss.com" title="Bootstrap问答社区" target="_blank"
						onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-Bootstrap问答社区'])">
						<i class="fa fa-comments"></i>
					</a>
				</li>
				<li class="social-weibo">
					<a href="http://weibo.com/bootcss" title="Bootstrap中文网官方微博" target="_blank"
						onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-新浪微博'])">
						<i class="fa fa-weibo"></i>
						您的生活帮手
					</a>
				</li>
			</ul>
		</div>
	</div>
</body>

</html>