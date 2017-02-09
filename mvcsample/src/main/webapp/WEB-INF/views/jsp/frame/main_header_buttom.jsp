<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>heaer-buttom</title>
</head>
<body>
	<div id="carousel-generic" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#carousel-generic" data-slide-to="0" class="active"></li>
			<li data-target="#carousel-generic" data-slide-to="1"></li>
			<li data-target="#carousel-generic" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="<%=root%>/static/img/slidebox/slide1.png" alt="First slide">
				<div class="carousel-caption">
					<h3>风景1</h3>
					<p>静静的风景1</p>
				</div>
			</div>
			<div class="item">
				<img src="<%=root%>/static/img/slidebox/slide2.png" alt="Secode slide">
				<div class="carousel-caption">
					<h3>风景2</h3>
					<p>静静的风景2</p>
				</div>
			</div>
			<div class="item">
				<img src="<%=root%>/static/img/slidebox/slide3.png" alt="Third slide">
				<div class="carousel-caption">
					<h3>风景3</h3>
					<p>静静的风景3</p>
				</div>
			</div>
		</div>
		 <a class="left carousel-control" href="#carousel-generic" role="button" data-slide="prev">
    		<span class="icon-prev" aria-hidden="true"></span>
    		<span class="sr-only">Previous</span>
  		</a>
  		<a class="right carousel-control" href="#carousel-generic" role="button" data-slide="next">
    		<span class="icon-next" aria-hidden="true"></span>
    		<span class="sr-only">Next</span>
  		</a>
	</div>
</body>
</html>