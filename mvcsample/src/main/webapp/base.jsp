<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
	request.setCharacterEncoding("UTF-8");
	String root = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<script src="<%=root%>/node_modules/jquery/dist/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	ajaxReady();
})

function ajaxReady(){
	$('#loadingIndicator').bind('ajaxStart',function(){
		$(this).show();
	})
	.bind('ajaxComplete',function(){
		$(this).hide();
	});
	$.ajaxSetup({
		cache:true,
		dataType:'json',
		data:{},
		error:function(xhr,status,error){
			alert('An error occurred:'+error);
		},
		timeout:50000,
		type:'POST',
		url:''
	});
}
</script>
</body>
</html>