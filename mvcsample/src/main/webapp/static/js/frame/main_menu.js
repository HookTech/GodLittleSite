//从后台获取json
function initJsonTree(reqUrl){
	$.ajax({
		url: reqUrl,
		type: 'POST',
		dataType: 'json',
		data: {},
	})
	.done(function(result) {
		console.log("目录树:\n")
		//console.log(result);
		$("#menu_json_string").text(result);//从后台获取
		parseJsonStrToUl(result);
	})
	.fail(function() {
		console.log("error");
	})
	.always(function() {
		console.log("complete");
	});
}

function parseJsonStrToUl(jsonStr){
	if(jsonStr == null)
		alert("json is null!");
	else{
		var jsonObj = eval('(' + jsonStr+ ')');
	}
}