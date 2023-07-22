package com.example.easypay.core.client.alipay;

import com.example.easypay.core.client.PayClientConfig;
import lombok.Data;

@Data
public class AlipayPayClientConfig implements PayClientConfig {

    /**
     * 公钥类型 - 公钥模式
     */
    public static final Integer MODE_PUBLIC_KEY = 1;

    /**
     * 公钥类型 - 证书模式
     */
    public static final Integer MODE_CERTIFICATE = 2;

    /**
     * 签名算法类型 - RSA
     */
    public static final String SIGN_TYPE_DEFAULT = "RSA2";

    /**
     * 网关地址
     *
     * 1. <a href="https://openapi.alipay.com/gateway.do">生产环境</a>
     * 2. <a href="https://openapi-sandbox.dl.alipaydev.com/gateway.do">沙箱环境</a>
     */
    private String serverUrl;

    /**
     * 开放平台上创建的应用的 ID
     */
    private String appId;

    /**
     * 签名算法类型，推荐：RSA2
     * <p>
     * {@link #SIGN_TYPE_DEFAULT}
     */
    private String signType;

    /**
     * 公钥类型
     * 1. {@link #MODE_PUBLIC_KEY} 情况，privateKey + alipayPublicKey
     * 2. {@link #MODE_CERTIFICATE} 情况，appCertContent + alipayPublicCertContent + rootCertContent
     */
    private Integer mode;

    // ========== 公钥模式 ==========
    /**
     * 商户私钥
     */
    private String privateKey;

    /**
     * 支付宝公钥字符串
     */
    private String alipayPublicKey;

    // ========== 证书模式 ==========
    /**
     * 指定商户公钥应用证书内容字符串
     */
    private String appCertContent;
    /**
     * 指定支付宝公钥证书内容字符串
     */
    private String alipayPublicCertContent;
    /**
     * 指定根证书内容字符串
     */

    private String rootCertContent;

}
