////搜索栏
//$(function(){
//	$("#top2right ul li ul").hide();
//	$("#shuru").click(function(){
//		$(this).css("border-color","orangered");
//		$("#top2right ul li ul").show();
//		$("#top2right ul li button").hide();
//	});
////	$(document).click(function(e){
////		$("#top2right ul li ul").show();
////		var ss=$("#shuru");
////		is() 方法用于查看选择的元素是否匹配选择器。是
////		has() 选择器选取所有包含一个或多个元素在其内的元素，匹配指定的选择器。(包含关系<p><span></span></p>p元素中有span元素)
////		if (!ss.is(e.target)&&ss.has(e.target).length==0) {
////			$("#shuru").css("border-color","gainsboro");
////			$("#top2right ul li ul").show();
////			$("#top2right ul li button").show();
////		} 
////	})
//	
//})
function fun() {
    if ($('#ulliul').css('display') == 'none') {
        $("#top2right ul li button").hide();
        $('#ulliul').css('display', 'block');
    } else {
        $('#ulliul').css('display', 'none');
        $("#top2right ul li button").show();
    }
}
