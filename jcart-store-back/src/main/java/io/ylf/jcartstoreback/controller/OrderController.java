package io.ylf.jcartstoreback.controller;

import io.ylf.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.ylf.jcartstoreback.dto.out.OrderListOutDTO;
import io.ylf.jcartstoreback.dto.out.OrderShowOutDTO;
import io.ylf.jcartstoreback.dto.out.PageOutDTO;
import io.ylf.jcartstoreback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/checkout")
    public Long  checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        Long orderId = orderService.checkout(orderCheckoutInDTO, customerId);
        return orderId;

    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }
}
