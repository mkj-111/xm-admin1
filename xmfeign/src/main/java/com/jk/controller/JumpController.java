package com.jk.controller;

import com.jk.entity.Goods;
import com.jk.entity.SkillBean;
import com.jk.service.GoodsService;
import com.jk.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("jump")
public class JumpController {

    @Autowired
    private GoodsService goodsService;

    @Resource
    private SkillService skillService;

    @RequestMapping("tophone")
    public String tophone(int id, HttpSession session) {
        Goods goods = goodsService.findgoodbyid(id);
        session.setAttribute("goods", goods);
        return "phone/25";
    }

    //秒杀商品
    @RequestMapping("toskill")
    public String toskill(Integer id,HttpSession session){
        SkillBean skill = skillService.findskillbyid(id);
        session.setAttribute("skill",skill);

        return "skill";
    }

    //跳转搜搜页面
    @RequestMapping("search")
    public String search(){
        return "search";
    }

    //跳转登录页面
    @RequestMapping("mi")
    public String mi() {
        return "mi";
    }

    //跳转首页页面
    @RequestMapping("/xm")
    public String guan() {
        return "main_page";
    }

    //跳转树页面index
    @RequestMapping("index")
    public String index() {
        return "index";
    }

    //跳转树页面index
    @RequestMapping("index1")
    public String index1() {
        return "index1";
    }

    //跳转秒杀页面
    @RequestMapping("miaosha")
    public String miaosha() {
        return "miaosha";
    }

    @RequestMapping("search_success")
    public String search_success() {

        return "admin/search_success";
    }
    //跳转抢购页面
    @RequestMapping("qianggou")
    public String qianggou() {
        return "qqww";
    }

    //跳转订单页面
    @RequestMapping("/goodsPhone")
    public String goodsPhone(){
        return "admin/goods_phones";
    }

    @RequestMapping("main")
    public String main(){
        return "main_page";
    }
    @RequestMapping("test")
    public String test(){
        return "higCharts";
    }
    /*于英彬(个人中心)始*/
    //跳转个人中心页面center
    @RequestMapping("center")
    public String center(){
        return "yyb/center";
    }
    //跳转消息通知页面personal
    @RequestMapping("personal")
    public String personal(){
        return "yyb/personal";
    }
    //跳转购买资格页面shuttle
    @RequestMapping("shuttle")
    public String shuttle(){
        return "yyb/shuttle";
    }
    //跳转现金账户页面current
    @RequestMapping("current")
    public String current(){
        return "yyb/current";
    }
    //跳转小米礼品卡页面present
    @RequestMapping("present")
    public String present(){
        return "yyb/present";
    }
    //跳转现金券页面money
    @RequestMapping("money")
    public String money(){
        return "yyb/money";
    }
    //跳转喜欢的商品页面like
    @RequestMapping("like")
    public String like(){
        return "yyb/like";
    }
    //跳转优惠券页面discount
    @RequestMapping("discount")
    public String discount(){
        return "yyb/discount";
    }
    //跳转收货地址页面area
    @RequestMapping("area")
    public String area(){
        return "yyb/area";
    }
    //跳转红包页面red
    @RequestMapping("red")
    public String red(){
        return "yyb/red";
    }
    //跳转我的订单页面order
    @RequestMapping("order")
    public String orde(){
        return "yyb/order";
    }


    //跳转评论
    @RequestMapping("toPingLun")
    public String toPingLun(Integer id, HttpSession session, HttpServletRequest request){
        request.getSession().setAttribute("ids",id);
        return "yyb/pinglun";
    }
    //搜索传值
    @RequestMapping("sou")
    public String sou(String name,HttpSession session){
        session.setAttribute("name",name);
        return "search";
    }
    //跳转评价晒单页面
    @RequestMapping("ping")
    public String ping(){
        return "yyb/ping";
    }
    //跳转话费充值订单页面
    @RequestMapping("topUp")
    public String topUp(){
        return "yyb/topUp";
    }

    //修改用户信息页面
    @RequestMapping("toUpdateUser")
    public  String toUpdateUser(){
        return "yyb/updateUser";
    }
    //跳转订单
    @RequestMapping("order_admin")
    public String orderadmin(){
        return "admin/order_admin";
    }

    //跳转已支付订单
    @RequestMapping("order_admin1")
    public String orderadmin1(){
        return "admin/order_admin1";
    }
    //跳转待发货订单
    @RequestMapping("order_admin3")
    public String orderadmin3(){
        return "admin/order_admin3";
    }
    //跳转待收货订单
    @RequestMapping("order_admin4")
    public String orderadmin4(){
        return "admin/order_admin4";
    }
}
