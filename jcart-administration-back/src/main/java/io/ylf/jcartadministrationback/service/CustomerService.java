package io.ylf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.ylf.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.ylf.jcartadministrationback.po.Customer;
import io.ylf.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.ylf.jcartadministrationback.po.Customer;

public interface CustomerService {

    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
