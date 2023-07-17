package com.example.easypay.controller.order;

import com.example.easypay.common.pojo.CommonResult;
import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.order.vo.PayOrderPageReqVO;
import com.example.easypay.controller.order.vo.PayOrderPageRespVO;
import com.example.easypay.convert.order.OrderConvert;
import com.example.easypay.dal.dataobject.PayOrderDO;
import com.example.easypay.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

import static com.example.easypay.common.pojo.CommonResult.success;

@RestController
@RequestMapping("/order")
public class PayOrderController {

    @Resource
    private OrderServiceImpl orderService;

    @RequestMapping("/create")
    public CommonResult<Boolean> OrderCreate(){
        orderService.createOrder();
        return success(true);
    }

    @RequestMapping("/list")
    public CommonResult<PageResult<PayOrderPageRespVO>> getOrderPage(@Valid PayOrderPageReqVO orderPageReqVO){
        PageResult<PayOrderDO> pageResult = orderService.getOrderPage(orderPageReqVO);

        return success(OrderConvert.INSTANCE.convertPage(pageResult));
    }

    @RequestMapping("/cancel")
    public CommonResult<Boolean> cancelOrder(@Valid Long orderId){
        orderService.cancelOrder(orderId);
        return success(true);
    }
}
