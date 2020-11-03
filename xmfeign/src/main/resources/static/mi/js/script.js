//菜单栏的显示
$("#banner_menu_wrap").children().hover(function(){
    $(this).css("background","#ff6700");
    $(this).children(".banner_menu_content").css("border","1px solid #F0F0F0").show();
},function(){
    $(this).css("background","none");
    $(this).children(".banner_menu_content").css("border","0px solid #F0F0F0").hide();
});

<!--这个index是图片和小圆点进行同步的关键-->
    var index = 0;
    //获取小圆点的父元素ul
    var zeroPoint = document.querySelector(".zeroPoint");
    //获取所有图片
    var imgLis = document.querySelectorAll("#big_banner_pic_wrap ul li");
    //获取所有的小圆点
    let lis = zeroPoint.querySelectorAll(".contwoboxbottom ul li");
	//小圆点点击事件监听
    zeroPoint.addEventListener("click", function (event) {
        let target = event.target;
        for (let [n, li] of lis.entries()) {
            if (li === target) {//更改被点击的小圆点的样式，背景色为白色，这里通过添加hover类的方式实现
                index = n;
                target.className = "hover";
            } else {//否则恢复为小圆点的默认样式，这里通过去除hover类的方式来实现
                li.className = li.className.replace("hover", "");
            }
        }
        setPicture();//设置图片
    });
    function setZero() {
        for (let [n, li] of lis.entries()) {
            if (n === index) {//如果是第index个小圆点，则修改这个小圆点的背景颜色为白色
                li.className = "hover";
            } else {//其他小圆点恢复默认样式
                li.className = li.className.replace("hover", "");
            }
        }
    }

    setInterval(function () {//定时器，达到自动轮播的效果
        index++;//循环++
        if (index > 4) {//当循环到最后一个就再从第一个开始
            index = 0;
        }
        setZero();//设置小圆点
        setPicture();//设置图片
    }, 3000);
//轮播
$(function(){
    var i=0;
    var big_banner_pic = $("#big_banner_pic");
    var allimg=$("#big_banner_pic li").length;
    function img_change(){
        var img_i=i*-1226+"px";
        big_banner_pic.animate({opacity:".2"},100,function(){
            big_banner_pic.css("left",img_i );
            big_banner_pic.animate({
                opacity: "1"
            }, 100);
        })
    }
    function automatic(){
        i+=1;
        if(i>=allimg){
            i=0;
        }
        img_change();
    }
    change_self_time = setInterval(automatic, 3000);
    //轮播上一张下一张图标控制
    $("#big_banner_change_wrap").hover(function(){
        clearInterval(change_self_time);
        $("#big_banner_change_wrap").children().show();
    },function(){
        change_self_time = setInterval(automatic, 3000);
        $("#big_banner_change_wrap").children().hide();
    })
    $("#big_banner_change_prev").click(function(){
        i += 1;
        if (i >= allimg) {
            i = 0;
        }
        img_change();
    })
    $("#big_banner_change_next").click(function(){
        i -= 1;
        if (i <= 0) {
            i = allimg - 1;
        }
        img_change();
    })
    function show(){ 
	 	//排序 ，显示当前图片和小方块 
	 	//动画animate()
		$('#big_banner_pic_wrap ul li').eq(num).animate({
			'opacity':1,"z-index":10
		}).siblings('li').animate({//siblings返回被选元素的所有同级元素。
			'opacity':0,'z-index':10-num
		});
		//当前加类名 ，其余的删除 (过滤器 eq)
		$("#contwoboxbottom ol li").eq(num).addClass('concurrent').siblings('li').removeClass('concurrent'); 
	} 
    //鼠标移上去 ，清除定时器 
	$('#contwoboxbottom').mouseover(function(){ 
		clearInterval(timer); 
	}) 
	//鼠标移出，重新设置定时器
	$('#contwoboxbottom').mouseout(function(){ 
		timer = setInterval(autoplay,3000); 
	})
})