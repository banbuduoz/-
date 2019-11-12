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
			<h1>blog info</h1>
			<div class="templatemo-container bloginfo">
				<h3 style="font-size: 32px;">${blog.title }</h3>
				<div id="content" class="content">

					<!-- content start -->
					<span>
	            	<p id="congrats">If you're seeing this page via a web browser, it means you've setup Tomcat successfully. Congratulations!</p>
	
		          <p>As you may have guessed by now, this is the default Tomcat home page. It can be found on the local filesystem at:</p>
		          <p class="code">$CATALINA_HOME/webapps/ROOT/index.html</p>
		
		          <p>where "$CATALINA_HOME" is the root of the Tomcat installation directory. If you're seeing this page, and you don't think you should be, then you're either a user who has arrived at new installation of Tomcat, or you're an administrator who hasn't got his/her setup quite right. Providing the latter is the case, please refer to the <a href="/docs">Tomcat Documentation</a> for more detailed setup and administration information than is found in the INSTALL file.</p>
		
		            <p><b>NOTE: For security reasons, using the manager webapp
		            is restricted to users with certain roles such as "manager-gui".</b>
		            Users are defined in <code>$CATALINA_HOME/conf/tomcat-users.xml</code>.</p>
		
		            <p>Included with this release are a host of sample Servlets and JSPs (with associated source code), extensive documentation, and an introductory guide to developing web applications.</p>
		
		            <p>Tomcat mailing lists are available at the Tomcat project web site:</p>
		
		           <ul>
	               <li><b><a href="http://tomcat.apache.org/lists.html#tomcat-users">tomcat-users</a></b> for general questions related to configuring and using Tomcat</li>
	               <li><b><a href="http://tomcat.apache.org/lists.html#tomcat-dev">tomcat-dev</a></b> for developers working on Tomcat</li>
	           </ul>
	
	            <p>Thanks for using Tomcat!</p>
	
	            <p id="footer"><br>
	            &nbsp;
	
	            Copyright &copy; 1999-2016 Apache Software Foundation<br>
	            All Rights Reserved
	            </p>
	            </span>
						<blockquote>
	
							<p>While we've done our best to ensure that these documents are clearly written and easy to understand, we may have missed something. Provided below are various web sites and mailing lists in case you get stuck.</p>
	
							<p>As Tomcat 6 is a new release of Tomcat, keep in mind that some of the issues and solutions vary between the major versions of Tomcat (4.x versus 5). As you search around the web, there will be some documentation that is not relevant to Tomcat 6, but 3.x, 4.x and 5.x. Doing 3.x or 4.x things to 6 will probably not work in most cases as the server.xml files are very different.
							</p>
	
							<ul>
								<li>Current document - most documents will list potential hangups. Be sure to fully read the relevant documentation as it will save you much time and effort. There's nothing like scouring the web only to find out that the answer was right in front of you all along!</li>
								<li>
									<a href="http://wiki.apache.org/tomcat/FAQ">Tomcat FAQ</a> as maintained by the developers.</li>
								<li>
									<a href="http://wiki.apache.org/tomcat/">Tomcat WIKI</a>
								</li>
								<li>Tomcat FAQ at
									<a href="http://www.jguru.com/faq/home.jsp?topic=Tomcat">jGuru</a>
								</li>
								<li>Tomcat mailing list archives - numerous sites archive the Tomcat mailing lists. Since the links change over time, clicking here will search
									<a href="http://www.google.com/search?q=tomcat+mailing+list+archives">Google</a>.
								</li>
								<li>The TOMCAT-USER mailing list, which you can subscribe to
									<a href="http://tomcat.apache.org/lists.html">here</a>. If you don't get a reply, then there's a good chance that your question was probably answered in the list archives or one of the FAQs. Although questions about web application development in general are sometimes asked and answered, please focus your questions on Tomcat-specific issues.</li>
								<li>The TOMCAT-DEV mailing list, which you can subscribe to
									<a href="http://tomcat.apache.org/lists.html">here</a>. This list is
									<strong>reserved</strong> for discussions about the development of Tomcat itself. Questions about Tomcat configuration, and the problems you run into while developing and running applications, will normally be more appropriate on the TOMCAT-USER list instead.</li>
							</ul>
	
							<p>And, if you think something should be in the docs, by all means let us know on the TOMCAT-DEV list, or send one of the doc authors email.</p>
	
						</blockquote>
						${blog.content }
					<!-- end -->
				</div>
				<!-- 评论开始 -->
				<div class="commentboth">
					<h5 class="comment_title">文章评论</h5>
					<!-- 需要循环的评论内容 -->
					<div class="comment">
						<div class="comment_author"><span>1楼</span><span>詹姆斯*高林思</span><span>2016/12/23</span></div>
						<div class="comment_text">好文章，值得收藏！</div>
					</div>
					<div class="comment">
						<div class="comment_author"><span>1楼</span><span>詹姆斯*高林思</span><span>2016/12/23</span></div>
						<div class="comment_text">好文章，值得收藏！</div>
					</div>
					<!-- 循环结束 -->
				</div>
				<!-- 评论结束 -->
				<div class="tocomment">
					<span>发表评论</span>
					<textarea></textarea>
					<button class="btn btn-success">submit</button>
				</div>
			</div>

		</div>
		<!--内容部分结束-->

		<!-- 脚部 -->
			<c:import url="foot.jsp"></c:import>
		<!-- 脚部结束 -->
	</body>

</html>