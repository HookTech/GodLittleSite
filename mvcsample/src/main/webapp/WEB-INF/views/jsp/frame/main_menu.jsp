<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>main menu</title>
</head>
<body>
	<!-- 目录树的json串 -->
	<span id="menu_json_string" style="display:none"></span>

	<nav class="navbar navbar-inverse">
    <div class="container-fluid">
    <div class="navbar-header">
      <img src="<%=root%>/static/img/logo/cross2.png" style="width: 40px;height: 40px; margin-top: 5px" alt="#">
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse">
      <ul class="nav navbar-nav" id="menubar">
        <li class="nav-item"><a href="<%=root%>/main_frame">首页</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">神学知识</a>
          <ul class="dropdown-menu">
            <li><a href="<%=root%>/theology/primer">神学入门</a></li>
            <li><a href="<%=root%>/theology/sermons">神的圣道</a></li>
            <li><a href="<%=root%>/theology/master">神学大家</a></li>
          </ul>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">新闻</a>
          <ul class="dropdown-menu">
            <li><a href="<%=root%>/news/church">教会告知</a></li>
            <li><a href="<%=root%>/news/group">团契动态</a></li>
          </ul>
        </li>
        <li><a href="<%=root%>/books">图书推荐</a></li>
        <li><a href="<%=root%>/contact">联系教会</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<script src="<%=root%>/node_modules/jquery/dist/jquery.min.js"></script>
<script type="text/javascript" src="<%=root%>/static/js/frame/main_menu.js"></script>
<script type="text/javascript">
$(function(){
	initJsonTree("<%=root%>/main_frame/main_menu");
})
</script>
</body>
</html>