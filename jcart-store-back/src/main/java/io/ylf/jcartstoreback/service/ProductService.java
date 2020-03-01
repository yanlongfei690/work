package io.ylf.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.ylf.jcartstoreback.dto.out.ProductListOutDTO;
import io.ylf.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {


    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
