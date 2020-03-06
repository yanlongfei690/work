package io.ylf.jcartstoreback.service.impl;

import io.ylf.jcartstoreback.dao.OrderHistoryMapper;
import io.ylf.jcartstoreback.po.OrderHistory;
import io.ylf.jcartstoreback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {


    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        return null;
    }
}
