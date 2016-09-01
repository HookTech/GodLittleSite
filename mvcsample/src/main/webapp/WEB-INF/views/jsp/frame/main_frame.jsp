<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>神学小站</title>
</head>
<body>
	<header id="header">
	<div id="header-top">
		<!-- 这里填充镇楼图片和描述文字 -->
		<jsp:include page="main_header_top.jsp" flush="falsh" />
	</div>
	<nav id="header-menu">
	<div id="header-menu-inner">
		<!-- 这里填充导航主菜单 -->
		<jsp:include page="main_menu.jsp" flush="false" />
	</div>
	</nav>
	<div id="header-buttom">
		<!-- 这里填充有趣内容的轮播图 -->
		<jsp:include page="main_header_buttom.jsp" flush="false"/>
	</div>
	</header>
	
	<section id="content"></section>
	
	<footer id="footer">
	<ul>
		<li>${web_address }</li>
		<li>${web_tel }</li>
		<li>${web_mail }</li>
	</ul>
	</footer>
</body>
</html>