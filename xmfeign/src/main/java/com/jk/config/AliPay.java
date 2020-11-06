package com.jk.config;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AliPay {

    @RequestMapping("AliPay")
    @ResponseBody
    public String AliPay(String gname,Double bzongjia,String gnumber) throws AlipayApiException {


        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        alipayRequest.setBizContent("{\"out_trade_no\":\""+ gnumber +"\","
                + "\"total_amount\":\""+ bzongjia +"\","
                + "\"subject\":\""+ gname +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        String result;
        result = alipayClient.pageExecute(alipayRequest).getBody();
        System.out.println("*********************\n返回结果为："+result);
        return result;
    }

}
