//
function fun1() {
    document.getElementById("imgs").src = "img/tubiaoimg/right2.png";
}

function fun1_1() {
    document.getElementById("imgs").src = "img/tubiaoimg/right1.png";
}

function fun2() {
    document.getElementById("imgs2").src = "img/tubiaoimg/left2.png";
}

function fun2_1() {
    document.getElementById("imgs2").src = "img/tubiaoimg/left1.png";
}


//左右轮播
//
var timer;
$(function () {
    timer = setInterval(function () {
        var number1 = -960 * index;
        index++;
        if (index > 4) {
            index = 0;
            $(".search").css("transform", "translateX(0px)")
        } else {
            $(".search").css("transform", "translateX(" + number1 + "px)")
            $(".search").css("transition", "2s")
        }

    }, 3000)
})
//
var index = 0;

function zuo() {
    clearInterval(timer);
    $("#content3_1_top_right2").attr("disabled", false);
    index--;
    var number1 = -960 * index;
    if (index == 0) {
        $("#content3_1_top_right1").attr("disabled", "disabled");
    }
    $(".search").css("transform", "translateX(" + number1 + "px)")
    $(".search").css("transition", "2s")
}

function you() {
    clearInterval(timer);
    $("#content3_1_top_right1").attr("disabled", false);
    index++;
    var number1 = -960 * index;
    if (index == 3) {
        $("##content3_1_top_right2").attr("disabled", "disabled");
    }
    $(".search").css("transform", "translateX(" + number1 + "px)")
    $(".search").css("transition", "2s")
}

//倒计时(1.获得当前的时间； 2.计算场数时间；3.计算剩余时间 ；4.显示 )
window.onload = function () {
    //获得当前的日期
    var time = new Date();
    //获得当前年份
    var year = time.getFullYear();
    //获得当前月份
    var month = time.getMonth() + 1;
    //获得当前天数
    var tian = time.getDate();
    //获得星期
    var date = time.getDay();//星期天为0
    //获取小时
    var hour = time.getHours();
    //获得分钟
    var min = time.getMinutes();
    //获得秒
    var second = time.getSeconds();
    //存储场数时间
    var endHour = 0;
//				console.log(time);
//				console.log(year);
//				console.log(month);
//				console.log(tian);
//				console.log(date);
//				console.log(hour);
//				console.log(min);
//				console.log(second);
    //计算时间场数
    if (hour % 2 == 0) {//判断是否为奇偶数(2个小时一场) 当hour为4点 hour就等于4，当hour为5点 hour是（5-1）=4
        //偶数
        if (hour < 10) {
            document.getElementById("con3_1sp1").innerHTML = "0" + hour + ":" + "00";
        } else {

            document.getElementById("con3_1sp1").innerHTML = hour + ":" + "00";
        }
        endHour = hour;
    } else {
        //奇数
        if (hour < 10) {
            document.getElementById("con3_1sp1").innerHTML = "0" + (hour - 1) + ":" + "00";
        } else {

            document.getElementById("con3_1sp1").innerHTML = (hour - 1) + ":" + "00";
        }
        endHour = hour - 1;
    }
    //定时器 每一秒执行一次
    setInterval(function () {
        //起始时间（系统当前时间）
        var starttime = new Date().getTime();//将系统当前时间转换成毫秒
//					console.log(starttime);//控制台输出
        //结束时间  （场数时间+2小时）
        var str = year + "-" + month + "-" + tian + " " + (endHour + 2) + ":00:00";//2小时后的时间 yyyy-mm-hh
        var endtime = new Date(str).getTime();//以毫秒为单位
//					console.log(str);
// 					console.log(endtime);
        //结束时间减去起始时间得到剩余的时间 （以豪秒来计算的）
        //除以1000是得到剩余的秒数（1秒=1000毫秒）
        var sec = (endtime - starttime) / 1000;
//					console.log(parseInt(sec%60));//余数
        //剩余分钟(1分钟=60秒)
        var min = sec / 60;
//					console.log(parseInt(min%60));
        //剩余小时(1小时=60分钟)
        var hour2 = parseInt(min / 60);//parseInt舍去小数的后面的数
//					console.log(hour2);
        //小时显示
        document.getElementById("jishi1").innerText = "0" + hour2;
        //分钟显示
        if (parseInt(min % 60) < 10) {
            document.getElementById("jishi2").innerText = "0" + (parseInt(min % 60));
        } else {
            document.getElementById("jishi2").innerText = (parseInt(min % 60));
        }
        //秒显示   余数 求出剩余的秒数
        if (parseInt(sec % 60) < 10) {
            document.getElementById("jishi3").innerText = "0" + (parseInt(sec % 60));
        } else {
            document.getElementById("jishi3").innerText = (parseInt(sec % 60));
        }
    }, 1000)
}