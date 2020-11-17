package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.jk.entity.OrderGoods;
import com.jk.pojo.RedisConstant;
import com.jk.utils.RedisUtil;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
public class PayController {


    private final String APP_ID = "2016103100782028";
    private final String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCytYZI0u9kyweRaLJktnlzxRUWwIVBKx98OFvrZp0W/TiktO1Vl/jpOYKLSGy8+eZzeRN3Sy4XgemSZlN5PcYsOO4xnqSo3bPkiujbNG5fEhVCr2yr+LcJ1bn/8iwbgC+1gX3KZCecaBZO3EeosDpyE0gDmCmDXg2PVfuR+dJHDWn7LhnNTDioPf5+rtdmHTuVPP+znd3FXRvmATGYDdasRADhsKLWG8XKiGJL5QVZSqgOEa7JOpG6hYM8nqrrfJ0wYL5xFx8HnH+i93x+HZn2jwf6zUmKvSo+LxuXRgD3T0gpr/nHCCN9BysRNjcmqKvhaUoNVcy2hSHom6j5Cv1jAgMBAAECggEAMsKaxN6dPtzoZmX9nduyva5yIgdHEk6kX81GVqPL5PbB+w6lBxXmjqBWMye8MyUsTwpJ/C1vhx/Qb1P/S8W/H1qAVbnA/XITocvO/kxzOS/SuCFJ1cMMgo+hiFCKNLmBU6XXTACMu8FY7Mdm10RPJY3Se6rhx72UTm1WyozSLHnqVd+mvHkYufkBsBJvKb/9TlTubtTCs8M8pWS+jmk6wZOP6FyQuaioTJ97IDacLJK+uZDEZyudnbuGjwL0i0e2b/kgoK+ljTc+IN91OkBLSPk7DMZ7kLwm0df0ozKmMCvztHkrYhCBjv8hLxURDHwrgN0JXEye0fhltPOZm43FmQKBgQDdl4HJwvoMzo00ZLsqQ39I8IiFQIUQAfzpsH3XxcqnQFzmCPJdPzA6HwHbF4l2SzBHpXa2cpbk/WLPZ0H1Ja90J7KN6+i2O9R2mTe7+NEFUAbHXEK3eR34g/ATh1EnLSIxCNVtWPPHPMiDJdpjDHUhQUY7o0TZukaFfsyBeNwyjQKBgQDOdWLk6+q1qWVgUTUGNOfPmRS7+BRXNfKLA1bSSi+V+bZtu62TRgJ/s51qXrt2XfpQ1jDpkbuiYOWHLBPQoLUxnqRcsgKa17wpjAtjee66LU/ajJ1aAuIbBb/s99S0yN4jydSfjmmvZAhb8s8c2D33SEsSk6BGRnMDCtTMf9HrrwKBgDxugj3VB76QYiAEzKplCASLXKACjYdlE2Vj9Z3v2imsuukdTYOypONk62ulyp5RORSBApQVQiOnGth3T5ycr3HdFavwx2FThcjmVjXUUKTDQ2YBOkyxIkRRLxsUT0SA4Y8/2nzcwnb2k7R4kUtr7VGpbI79ItzCGVN01i8FGABNAoGBAJ4OB9OxOFIyiMWf5bQGtKCdVN5CIXBSgIgj2kfLO3rZXOvNDij9I9SXsR9JvsHzWDqif3eQddDt1UoSWGkTXyPJi5LbRFs+ZXJ5IA7bvgMRxVxO4feS1X5SfIfxgwmT7VwAm6I66HW5YxzhWeV/NpEk6zQhiEXEkS/3Dsov4IlJAoGAPP61x/eLO+zdZDsq4Y3YVYJOI5NSB0oEglGhz29sf2asG/camVpVDb5QvipsLPTm/ZhlO+zXpI9xbiKcz8DQrhDK0jkXVjDkp27xs2i9cEi4BetlmCyhq8N8IdMR6HcQkskOOQk4cr8phcCZH9HQKmDqT2AbBWGCe/4mGy7Ccwc=";
    private final String CHARSET = "UTF-8";
    private final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsrWGSNLvZMsHkWiyZLZ5c8UVFsCFQSsffDhb62adFv04pLTtVZf46TmCi0hsvPnmc3kTd0suF4HpkmZTeT3GLDjuMZ6kqN2z5Iro2zRuXxIVQq9sq/i3CdW5//IsG4AvtYF9ymQnnGgWTtxHqLA6chNIA5gpg14Nj1X7kfnSRw1p+y4ZzUw4qD3+fq7XZh07lTz/s53dxV0b5gExmA3WrEQA4bCi1hvFyohiS+UFWUqoDhGuyTqRuoWDPJ6q63ydMGC+cRcfB5x/ovd8fh2Z9o8H+s1Jir0qPi8bl0YA909IKa/5xwgjfQcrETY3Jqir4WlKDVXMtoUh6Juo+Qr9YwIDAQAB";
    //这是沙箱接口路径,正式路径为https://openapi.alipay.com/gateway.do
    private final String GATEWAY_URL ="https://openapi.alipaydev.com/gateway.do";
    private final String FORMAT = "JSON";
    //签名方式
    private final String SIGN_TYPE = "RSA2";
    //支付宝异步通知路径,付款完毕后会异步调用本项目的方法,必须为公网地址
    private final String NOTIFY_URL = "http://127.0.0.1/notifyUrl";
    //支付宝同步通知路径,也就是当付款完毕后跳转本项目的页面,可以不是公网地址
    private final String RETURN_URL = "http://127.0.0.1/returnUrl";



    private  String aa;
    @Resource
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("alipay")
    public void alipay(HttpServletResponse httpResponse,String ordergoodsName, String orderSumPrice, String orderNum) throws IOException {

        aa=orderNum;
        System.out.println(aa);
        OrderGoods orderGoods = (OrderGoods) redisUtil.get(RedisConstant.Goods_Order__Key + "__" + aa);
        String logJson = JSONObject.toJSONString(orderGoods);
        rabbitTemplate.convertAndSend("xm-queue", logJson);
        redisUtil.del(RedisConstant.Goods_Order__Key + "__" + aa);

        Random r=new Random();
        //实例化客户端,填入所需参数
        AlipayClient alipayClient = new DefaultAlipayClient(GATEWAY_URL, APP_ID, APP_PRIVATE_KEY, FORMAT, CHARSET, ALIPAY_PUBLIC_KEY, SIGN_TYPE);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        //在公共参数中设置回跳和通知地址
        request.setReturnUrl(RETURN_URL);
        request.setNotifyUrl(NOTIFY_URL);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        //生成随机Id
        String out_trade_no = UUID.randomUUID().toString();
        //付款金额，必填
        String total_amount =orderSumPrice;
        //订单名称，必填
        String subject =ordergoodsName;
        //商品描述，可空
        String body = null;
        request.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        String form = "";
        try {
            form = alipayClient.pageExecute(request).getBody(); // 调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType("text/html;charset=" + CHARSET);
        httpResponse.getWriter().write(form);// 直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
    }

    @RequestMapping(value = "/returnUrl", method = RequestMethod.GET)
    public String returnUrl(HttpServletRequest request, HttpServletResponse response)
            throws IOException, AlipayApiException {
        //        System.out.println("=================================同步回调=====================================");
        //
        //        // 获取支付宝GET过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            // 乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("utf-8"), "utf-8");
            params.put(name, valueStr);
        }

        System.out.println(params);//查看参数都有哪些
        boolean signVerified = AlipaySignature.rsaCheckV1(params, ALIPAY_PUBLIC_KEY, CHARSET, SIGN_TYPE); // 调用SDK验证签名
        //验证签名通过
        if(signVerified){
            // 商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

            // 支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

            // 付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");

            System.out.println("商户订单号="+out_trade_no);
            System.out.println("支付宝交易号="+trade_no);
            System.out.println("付款金额="+total_amount);

            //支付成功，修复支付状态

            return "ok";//跳转付款成功页面
        }else{
            return "no";//跳转付款失败页面
        }

    }
}

