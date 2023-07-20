package com.example.easypay.controller.order;

import com.example.easypay.common.pojo.CommonResult;
import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.order.vo.PayOrderPageReqVO;
import com.example.easypay.controller.order.vo.PayOrderPageRespVO;
import com.example.easypay.convert.order.OrderConvert;
import com.example.easypay.dal.dataobject.PayOrderDO;
import com.example.easypay.service.impl.PayOrderServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

import static com.example.easypay.common.pojo.CommonResult.success;

@RestController
@RequestMapping("/order")
public class PayOrderController {

    @Resource
    private PayOrderServiceImpl payOrderService;

    @RequestMapping("/create")
    public CommonResult<Boolean> OrderCreate(){
        payOrderService.createOrder();
        return success(true);
    }

    @RequestMapping("/list")
    public CommonResult<PageResult<PayOrderPageRespVO>> getOrderPage(@Valid PayOrderPageReqVO orderPageReqVO){
        PageResult<PayOrderDO> pageResult = payOrderService.getOrderPage(orderPageReqVO);

        return success(OrderConvert.INSTANCE.convertPage(pageResult));
    }

    @RequestMapping("/get")
    public CommonResult<PayOrderDO> getOrder(@Valid Long orderId){
        PayOrderDO payOrder = payOrderService.getOrderById(orderId);

        return success(payOrder);
    }

    @RequestMapping("/cancel")
    public CommonResult<Boolean> cancelOrder(@Valid Long orderId){
        payOrderService.cancelOrder(orderId);
        return success(true);
    }
}
