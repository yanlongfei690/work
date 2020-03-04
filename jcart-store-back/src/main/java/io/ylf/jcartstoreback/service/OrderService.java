package io.ylf.jcartstoreback.service;

import io.ylf.jcartstoreback.dto.in.OrderCheckoutInDTO;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);
}
