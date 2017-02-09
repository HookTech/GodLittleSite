<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/base.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
<script src="<%=root%>/node_modules/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap core CSS -->
<link href="<%=root%>/node_modules/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="<%=root%>/static/css/theology.css">
<title>theology primer</title>
</head>
<body>
	<c:set var="primers" value="${mStrList }"></c:set>
	<h3 class="theology-primer">神学入门</h3>
	<table class="primer-table">
		<!-- <tr><td><h3>神学入门</h3></td></tr> -->
		<thead>
			<tr>
				<td class="theology-primer-title pl20"><span class="ml20">标题</span></td>
				<td class="theology-primer-intro">简介</td>
				<td class="theology-primer-url">下载</td>
				<td class="theology-primer-updateTime">更新时间</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="pStr" items="${primers }">
			<tr>
				<%-- <td width="50%">
					<div class="theology-primer-title">${pStr.title }</div>
					<div class="theology-primer-intro"><span></span>${pStr.intro }</div>
				</td>
				<td width="20%">
					<div class="theology-primer-url">
						<a href="<%=root%>/file/download?file_name=${pStr.url }"><img alt="#" src="" class="img-rounded"></a>
					</div>
				</td>
				<td width="30%">
					<div class="theology-primer-updateTime">
						<span></span>${pStr.updateTimeStr}
					</div>
				</td> --%>
				<td class="theology-primer-title">
					<c:choose>
					<c:when test="${pStr.type == 'PDF' }">
						<i class="ico-pdf ico-date"></i>
					</c:when>
					<c:when test="${pStr.type == 'PPT' }">
						<i class="ico-ppt ico-date"></i>
					</c:when>
					</c:choose>
					<span>${pStr.title }</span>
				</td>
				<td class="theology-primer-intro">
					<span>${pStr.intro }</span>
				</td>
				<td class="theology-primer-url">
					<a href="<%=root%>/file/download?file_name=${pStr.url }">下载</a>
				</td>
				<td class="theology-primer-updateTime">
					<span></span>${pStr.updateTimeStr}
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="wrap">
	<nav id="primer navigation">
			<ul class="pagination">
					<c:if test="${blockSeqNum == 1 }">
					<li class="disabled">
      					<a href="javascript:void(0)" aria-label="Previous">
        					<span aria-hidden="true">&laquo;</span>
      					</a>
    				</li>
					</c:if>
					<c:if test="${blockSeqNum > 1 && blockSeqNum <= maxBlockNum}">
					<li>
      					<a href="<%=root%>/theology/primer?pageNum=${blockStartNum - 1 }" aria-label="Previous">
        					<span aria-hidden="true">&laquo;</span>
      					</a>
    				</li>
					</c:if>
					
					<c:forEach begin="${blockStartNum }" end="${blockEndNum }" varStatus="loop">
    				<li <c:if test="${currentPage == loop.index }">class="active"</c:if>><a href="<%=root%>/theology/primer?pageNum=${loop.index }">${loop.index }</a></li>
    				</c:forEach>
    				<li class="disabled"><a href="#">共<span>${maxPageNum }</span>页</a></li>
					
					<c:if test="${blockSeqNum == maxBlockNum }">
    				<li class="disabled">
    					<a href="javascript:void(0)" aria-label="Next">
        					<span aria-hidden="true">&raquo;</span>
    					</a>
    				</li>
    				</c:if>
					<c:if test="${blockSeqNum >= 1 && blockSeqNum < maxBlockNum}">
    				<li>
    					<a href="<%=root%>/theology/primer?pageNum=${blockEndNum + 1 }" aria-label="Next">
        					<span aria-hidden="true">&raquo;</span>
    					</a>
    				</li>
    				</c:if>
			</ul>
	</nav>
	</div>
<script src="<%=root%>/node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
function requestPage(obj){
	$.ajax({
		url:obj.href,
		success:function(data,textStatus){
			$('#text').text(data);
		}
	});
}
$(function(){
})
</script>
</body>
</html>