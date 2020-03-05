package io.ylf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.ylf.jcartadministrationback.dto.out.OrderListOutDTO;
import io.ylf.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.ylf.jcartadministrationback.po.Order;

public interface OrderService {

    void update(Order order);

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);
}
