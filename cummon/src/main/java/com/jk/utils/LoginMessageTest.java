package com.jk.utils;

import com.alibaba.fastjson.JSON;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class LoginMessageTest {

	//发送验证码的请求路径URL
    private static final String
    SERVER_URL="https://api.netease.im/sms/sendcode.action";
    //网易云信分配的账号，请替换你在管理后台应用下申请的Appkey
    private static final String
    APP_KEY="126728b185f1ba75ffc55dcd5b281782";
    //网易云信分配的密钥，请替换你在管理后台应用下申请的appSecret
    private static final String APP_SECRET="17e0f6cb239b";
    //随机数 结合APP_SECRET生成加密内容
    private static final String NONCE="123456";
    //短信模板ID
    private static final String TEMPLATEID="14871235";
    //手机号
    private static final String MOBILE="17563734957";
    //验证码长度，范围4～10，默认为4
    private static final String CODELEN="6";
    
    public static void loginMessage(String phoneNumber, Map<String, Object> paramMap){
    	CloseableHttpClient httpClient = HttpClientBuilder.create().build();
    	//创建httpPost请求
    	HttpPost httpPost = new HttpPost(SERVER_URL);
    	//获得当前系统时间，规定生成加密时间，默认是5秒
    	String curTime = String.valueOf((new Date()).getTime()/1000L);
    	//根据APP_SECRET+随机数+当前时间生成加密认证规则
    	 String checkSum = CheckSumBuilder.getCheckSum(APP_SECRET, NONCE, curTime);
    	 // 设置请求的header
         httpPost.addHeader("AppKey", APP_KEY);
         //密钥的随机数生成加密的随机数
         httpPost.addHeader("Nonce", NONCE);
         httpPost.addHeader("CurTime", curTime);
         httpPost.addHeader("CheckSum", checkSum);
         //请求报文格式x-www-form-urlencoded，以from表单提交数据
         httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
         //创建一个页面表单集合NameValuePair，name代表name，value代表value.
         List<NameValuePair> nvps = new ArrayList<NameValuePair>();
         //BasicNameValuePair 基本的表单元素，key为input里面的name，value为input中的value值
         nvps.add(new BasicNameValuePair("templateid", TEMPLATEID));
         nvps.add(new BasicNameValuePair("mobile", MOBILE));
         nvps.add(new BasicNameValuePair("codeLen", CODELEN));
         //设置request body信息
         try {
			httpPost.setEntity(new UrlEncodedFormEntity(nvps));
			CloseableHttpResponse response=httpClient.execute(httpPost);
			String message = EntityUtils.toString(response.getEntity());
			System.out.println(message);
			Map<String, ?> responseMap = JSON.parseObject(message,Map.class);
			paramMap.putAll(responseMap);
         } catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /*@Test
    public void textCheckSum(){
    	String curTime = String.valueOf((new Date()).getTime()/1000L);
    	String checkSum = CheckSumBuilder.getCheckSum(APP_SECRET, "256478","562369856568");
    	String checkSum2 = CheckSumBuilder.getCheckSum(APP_SECRET, NONCE,curTime);
    	System.out.println(checkSum+"----"+checkSum2);
    }*/
}
