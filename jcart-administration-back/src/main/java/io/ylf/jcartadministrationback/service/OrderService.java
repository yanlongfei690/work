package io.ylf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.ylf.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.ylf.jcartadministrationback.dto.out.OrderListOutDTO;
import io.ylf.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.ylf.jcartadministrationback.po.Order;

public interface OrderService {

    void update(Order order);

    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);
}
