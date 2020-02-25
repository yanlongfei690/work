package io.ylf.jcartadministrationback.controller;


import io.ylf.jcartadministrationback.dto.in.OrderHistoryCreateInDTO;
import io.ylf.jcartadministrationback.dto.out.OrderHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderhistory")
public class OrderHistoryController {


    @GetMapping("/getList")
    public List<OrderHistoryListOutDTO>getList(@RequestParam Long orderId){

        return  null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){
        return null;
    }
}
