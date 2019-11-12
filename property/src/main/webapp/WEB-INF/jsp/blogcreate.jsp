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

		<link rel="stylesheet" href="kindeditor/themes/default/default.css" />
		<script charset="utf-8" src="kindeditor/kindeditor-min.js"></script>
		<script charset="utf-8" src="kindeditor/lang/zh_CN.js"></script>
		<script>
			var editor;
			KindEditor.ready(function(K) {
				editor = K.create('textarea[name="c1"]', {
					allowFileManager: true
				});
			});

			function check() {
				var title = $("#title").val();
				var schema = $("#schema").val();
				var content = editor.html();
				if(title.trim() == "") {
					alert("title must be not null");
					return;
				}
				if(schema.trim() == "") {
					alert("schema must be not null");
					return;
				}
				if(content.trim() == "") {
					alert("content must be not null");
					return;
				}
				$("#c2").val(content);
				if(confirm("save this blog, are you sure?")) {
					$("#form1").submit();
				}
			}
		</script>

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

		<!--中间内容部分开始-->
		<div class="container allwidth">
			<div class="create">
				<h1>创建公告</h1>
				<form id="form1" action="createblog.action" method="post">
					<input type="hidden" name="type" value="2" />
					<table class="templatemo-container">
						<tr>
							<td>title:<input id="title" type="text" class="form-control" name="title" />
							</td>
						</tr>
						<tr>
							<td>kind:<br />
								<select class="form-control" id="kind" name="kind">
									<c:forEach items="${blogKinds }" var="kind">
										<option value="${kind.id }">${kind.name }</option>
									</c:forEach>
								</select>
							</td>
						</tr>
						<tr>
							<td>schema:<br /> <textarea class="form-control" id="schema" name="schema" style="width: 1024px; resize: none;"></textarea>
							</td>
						</tr>
						<tr>
							<td>content:<br /> <textarea class="form-control" id="c1" name="c1" style="width: 1024px; resize: none;" rows="30"></textarea><br />
								<input name="content" id="c2" type="hidden" />
							</td>
						</tr>
						<tr>
							<td align="center"><button type="button" onclick="check()" class="btn btn-success">submit</button></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<!--内容部分结束-->

		<!-- 脚部 -->
			<c:import url="foot.jsp"></c:import>
		<!-- 脚部结束 -->
	</body>

</html>