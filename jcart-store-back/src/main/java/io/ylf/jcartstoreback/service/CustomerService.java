package io.ylf.jcartstoreback.service;


import io.ylf.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.ylf.jcartstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

}
