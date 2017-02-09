<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>header-top</title>
<style type="text/css">
/* table {
	width: 100%;
}

td {
	border: solid 1px blue;
}


div.recent-module {
	border: solid 1px red;
	margin-top: 20px;
	width: 260px;
}

div.recent-header{
	width: 260px;
	height: 185px;
} */

/* bootstrap版 */
.row {
	margin-top: 20px;
}

.pic {
	display: block;
	width: 100%;
	height: 185px;
}

.caption {
	text-align: center;
}

</style>

<script type="text/javascript" src="<%=root%>/node_modules/modernizr-2.8.3.min.js"></script>
<script src="<%=root%>/node_modules/jquery/dist/jquery.min.js"></script>
</head>
<body>
	<!-- 自定义版 -->
	<%-- <table>
		<tr>
			<td align="center">
				<div id="recent-preach" class="recent-module">
					<div class="recent-header" style="background-image: url('<%=root%>/static/img/module/recent_preach.png');">
						<div class="recent-preach-title">近期讲道</div>
						<div class="recent-preach-intro"></div>
					</div>
					<div class="recent-content">内容文字</div>
				</div>
			</td>
			<td align="center">
				<div id="recent-activity" class="recent-module">
					<div class="recent-header" style="background-image: url('<%=root%>/static/img/module/recent_activity.png');">
						<div class="recent-activity-title">教会活动</div>
						<div class="recent-activity-intro"></div>
					</div>
					<div class="recent-content">内容文字</div>
				</div>
			</td>
		</tr>
	</table> --%>
	<!-- bootstrap版 -->
	<div class="row">
		<div class="col-sm-6 col-md-4">
			<div class="thumbnail">
				<img id="preach" class="pic" src="<%=root%>/static/img/module/recent_preach.png">
				<div class="caption">
					<h3 class="recent-preach-title">近期讲道</h3>
					<p class="recent-preach-intro">...</p>
					<div class="recent-content">内容文字</div>
				</div>
			</div>
		</div>
		<div class="col-sm-6 col-md-4">
			<div class="thumbnail">
				<img id="activity" class="pic" src="<%=root%>/static/img/module/recent_activity.png">
				<div class="caption">
					<h3 class="recent-activity-title">教会活动</h3>
					<p class="recent-activity-intro">...</p>
					<div class="recent-content">内容文字</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="<%=root%>/static/js/frame/grayscale.js"></script>
	<script type="text/javascript">
		window.onload = function(){
			// 变灰效果
			// convertToGS($("#preach")[0]);
			// convertToGS($("#activity")[0]);
		}
	</script>
</body>
</html>