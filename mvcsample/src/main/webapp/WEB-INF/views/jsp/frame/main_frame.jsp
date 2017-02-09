<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Bootstrap core CSS -->
<link href="<%=root%>/node_modules/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- defined css -->
<link href="<%=root%>/static/css/main_frame.css" rel="stylesheet">
<title>神学小站</title>
</head>
<body>
<div class="site-container">
	<div class="header">
	<div class="header-top">
		<!-- 这里填充镇楼图片和描述文字 -->
		<jsp:include page="main_header_top.jsp" flush="false" />
	</div>
	<nav id="header-menu">
	<div class="header-menu-inner">
		<!-- 这里填充导航主菜单 -->
		<jsp:include page="main_menu.jsp" flush="false" />
	</div>
	</nav>
	<div class="header-buttom">
		<!-- 这里填充有趣内容的轮播图 -->
		<jsp:include page="main_header_buttom.jsp" flush="false"/>
	</div>
	</div>
	<!-- 首页主体内容 -->
	<div class="content">
		<!-- 主体 -->
		<jsp:include page="main_content.jsp" flush="false"></jsp:include>
	</div>
	<!-- 地址和联系方式等信息 -->
	<div class="footer">
	<ul>
		<li><span id="address">地址:</span>${web_address }</li>
		<li><span id="tel">联系电话:</span>${web_tel }</li>
		<li><span id="mail">联系邮箱:</span>${web_mail }</li>
	</ul>
	</div>
</div>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="<%=root%>/node_modules/jquery/dist/jquery.min.js"></script>
<%-- <script>window.jQuery || document.write('<script src="<%=root%>/node_modules/jquery/dist/jquery.min.js"><\/script>')</script> --%>
<script src="<%=root%>/node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
</body>
</html>