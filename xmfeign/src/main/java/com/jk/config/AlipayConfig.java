package com.jk.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016102900777398";

	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCynX1PAPFDuoYEI/g2TY+u92Cu1l5lnisRFXTx9fbcpgvwUVg0Jdy471uNEPATKGMwyqQIpytycgytauiF4BEUpJ6Pp8stoAVoPUWE71huwW/TCb2m411d95c8aoXVf0ME2UPG9wLyVAbRUtMHTvEQ+gD4z1eq1qcltgsWppMdBxtmJF2DAQadVMPUsVNLhZ9AIkN8vaCMO6ieqBD8i6cRYiGP1jduxBqLbxFspuzvrCh0E8+ND4/MpJpNV4RrS7OdssWoc2nG3yAmgpokxcaInMwGiaf1/Tg9B1Bp5GaEuU4OT5KQhLMdzeEpBuA7NMWjsuSboWH9sieLwELpf0+BAgMBAAECggEALW4LOjX2J5Dgl1sCveUaX5lB+RZDKjuBnrXDaetyn4qITNaTxae/rTYMJiQhu+2w1O8lq6HBVjmV6eHgRHTKQ2LfhZBbCD7EQVAcR4SNDJact6OpnjIERGs+Bzrc0YGt7STJrWiUUkh293TGgfxdKkE8UAyEsson91qHFXrGvkHrsLAR6jhd3JiND0Huo8KNwaV0J7VTgUJJeydmjHQL7Rpp70nc7K97LHpkojYrtG/UkUr2PFcmSFxElXnNIJdrN1GtL1isKDvKLaa92+/run2BqIiIzc6RjuqSlQXIyZVXM2nRygyfVkiagvv2tdeDaIMZBYApiVSNWu+3WVqUdQKBgQD1d3HSFaM2MUblNoDSl+KQVPb1UL3CtjYxGyGzX1yVuP6l+hwuOTeAXmk/iM+E/5dCucIMamnIKEQNrH5rOaw9shSz+4CaOt7VkMeqPfXjoMy51C39aBy1Awi+5mpK6ylUYKOmD+/j3DTsc0gopiIoueROr9zNkB1Za4S1wGE1rwKBgQC6R6dexwlgHFcxefnMtmIOUQzG6a1Iu6e2Dzyu67MMGx70mAyBHWaEVm8kbd2M6QJAvI2yISrUqGCI6mf+cyV91W1Qw+kgpzNhbjsm5ysttREb+qMHavpuWQfWPwV7tCEoCDyLrEx7yatAD9eZ/aAhtlXFyD4LYeSAfAaAQkpJzwKBgBH5eCU5HmV2gEmCjzZcluOYxSi7i9m5PAimgvY+kmoITOVchjnASNcmkrBrVT7Y9HuXXKVKGYrln+4cZnl1lK5D3w466XThwLWEz4og1WOgv70P03pN6GQ836QS/U+VHsal+PXNDvTxiBKUcoE/gRrYWeaFLDcFSZDltacVekjTAoGAYuTxlV6jupOxMsIn/SeCjUk4OE4MwgVmN0CFnfPh/XZUi9RBJzbdmzpsDPIK4ek+WfIAY+Y53+Z4QZf4l9y3tcNeIrevh7dcjsg/vRqTENQE/k6kyKZhx72abILOvWrXA3LD+f8CJ+Hb+cmvU8CTh/JOPQ9e6RoSfqfZp7QJzn8CgYEAgWjUOjHjyd40SiArxdEWzSPtig5oldnBVP6b9lo5ZA8qq40g00q31S80G4yOaIvzEM71/uhaKQSuySGBuyXuYnFdbMR/IguxJz1BBt+zFrHkRPw/Y0IKnWY/ItqHY397JpKATNXEUikBX3juMFIGsAsdDhBl8V/AH5GpBaf8z6I=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnI6Z3BgmXa5QYzgEapPjwhdpPbZ+CcGKEbNR7Vq8GTardBlpbidMJVLxgL9tvlQo2gFymhSbB1PD+RFjMYEtFt+ckOcXcbg4tWttTCingB1h0/SYVmSXXlr9qdC4PFoK2CkL1Qqbstha58JcQfRO1GAAbXNx5lSh19nbjxZv8nw+jNf2P9q40twqVRb0MHaE9nX2+YW1wFhRX7rQgLOEmX3d/p4hSAzq8IkYudw3EF4ydI4VJeGeGsIyk0ztLTt1bC+wFfWYes/BSy66GEFu0nbH1HY/QzJZJ1Cw+nI+bDVQTm3S2ETrvCQ/xOSi6bvymtGWawsXueMU1nbSpIYKpwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

