package io.ylf.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.ylf.jcartadministrationback.dao.CustomerMapper;
import io.ylf.jcartadministrationback.dto.in.CustomerSearchInDTO;
import io.ylf.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.ylf.jcartadministrationback.po.Customer;
import io.ylf.jcartadministrationback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<Customer> page = customerMapper
                .search(customerSearchInDTO.getUsername(),
                        customerSearchInDTO.getRealName(),
                        customerSearchInDTO.getMobile(),
                        customerSearchInDTO.getEmail(),
                        customerSearchInDTO.getStatus());
        return page;
    }

    @Override
    public Customer getById(Integer customerId) {
        Customer customer = customerMapper.selectByPrimaryKey(customerId);
        return customer;
    }

    @Override
    public void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO) {
        Customer customer = new Customer();
        customer.setCustomerId(customerSetStatusInDTO.getCustomerId());
        customer.setStatus(customerSetStatusInDTO.getStatus());
        customerMapper.updateByPrimaryKeySelective(customer);
    }
}
