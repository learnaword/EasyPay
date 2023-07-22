package com.example.easypay.core.client.impl.alipay;

import cn.hutool.core.bean.BeanUtil;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayConfig;
import com.alipay.api.DefaultAlipayClient;
import com.example.easypay.core.client.alipay.AlipayPayClientConfig;
import com.example.easypay.core.client.impl.AbstractPayClient;
import com.example.easypay.dal.dataobject.PayConfigDO;
import lombok.SneakyThrows;

public abstract class AbstractAlipyPayClient extends AbstractPayClient {

    protected DefaultAlipayClient client;

    public AbstractAlipyPayClient(String code,Long appId, AlipayPayClientConfig payClientConfig){
        super(code,appId,payClientConfig);

        //初始化client
        init();
    }

    @SneakyThrows
    protected void init(){
        AlipayConfig alipayConfig = new AlipayConfig();
        BeanUtil.copyProperties(payClientConfig, alipayConfig, false);
        this.client = new DefaultAlipayClient(alipayConfig);
    }

}
