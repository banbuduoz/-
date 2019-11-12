<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE>
 <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="bp" value="<%=basePath%>"></c:set>
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 引入 Bootstrap -->
<link href="${bp }/static/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="${bp }/static/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="${bp }/static/js/bootstrap.min.js"></script>
<link href="${bp }/static/css/style.css" rel="stylesheet" />
</head>
<body>
	<!--导航栏盒子-->
	<div class="d1">
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container-fluid allwidth">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">欢迎xx回家</a>
				</div>
				<div>
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="index.html">网站首页</a>
						</li>
						<li>
							<a href="bloglist.html">公告浏览</a>
						</li>
						<li>
							<a href="userlist.html">用户列表</a>
						</li>

						<li>
							<a href="blogcreate.html">社区服务</a>
						</li>
						<li>
							<a href="personblogschemalist.html">个人信息</a>
						</li>
						<li>
							<a href="login.html">登录</a>
						</li>
						<li>
							<a href="regist.html">注册</a>
						</li>
						<!-- <li>
							<a href="userlist.html">车辆出入管理</a>
						</li>
						<li>
							<a href="userlist.html">人员出入管理</a>
						</li> -->
						<li>
						<li>
							<a href="#">物业报修管理</a>
						</li>
						<li>
							<a href="userlist.html">物业缴费管理</a>
						</li>
						<li>
							<a href="#">投诉管理</a>
						</li>
						<li>
							<a onclick="window.history.go(-1)" style="cursor: pointer;">返回</a>
						</li>
						<li>
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
	<div class="banner1">
		<div class="container">
			<h1>XXX小区</h1>
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