package io.ylf.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.ylf.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.ylf.jcartstoreback.dto.out.OrderShowOutDTO;
import io.ylf.jcartstoreback.po.Order;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}
