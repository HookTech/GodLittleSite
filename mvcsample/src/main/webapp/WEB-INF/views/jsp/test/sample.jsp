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

<title>sample page</title>
</head>
<body>

<audio controls="controls">
<source src="<%=root%>/file/stream?file_name=japan.mp3" type="audio/mp3"></source>
你的浏览器不支持在线播放!
</audio>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="<%=root%>/node_modules/jquery/dist/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="<%=root%>/node_modules/jquery/dist/jquery.min.js"><\/script>')</script>
<script src="<%=root%>/node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
</body>
</html>