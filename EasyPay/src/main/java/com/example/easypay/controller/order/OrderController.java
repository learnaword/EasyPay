package com.example.easypay.controller.order;

import com.example.easypay.common.pojo.CommonResult;
import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.order.vo.OrderPageReqVO;
import com.example.easypay.controller.order.vo.OrderPageRespVO;
import com.example.easypay.convert.order.OrderConvert;
import com.example.easypay.dal.dataobject.OrderDO;
import com.example.easypay.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;

import static com.example.easypay.common.pojo.CommonResult.success;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderServiceImpl orderService;

    @RequestMapping("/create")
    public CommonResult<Boolean> OrderCreate(){
        orderService.createOrder();
        return success(true);
    }

    @RequestMapping("/list")
    public CommonResult<PageResult<OrderPageRespVO>> getOrderPage(@Valid OrderPageReqVO orderPageReqVO){
        PageResult<OrderDO> pageResult = orderService.getOrderPage(orderPageReqVO);

        return success(OrderConvert.INSTANCE.convertPage(pageResult));
    }

    @RequestMapping("/cancel")
    public CommonResult<Boolean> cancelOrder(@Valid Long orderId){
        orderService.cancelOrder(orderId);
        return success(true);
    }
}
