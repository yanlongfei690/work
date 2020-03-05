package io.ylf.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.ylf.jcartstoreback.dto.out.ProductListOutDTO;
import io.ylf.jcartstoreback.dto.out.ProductShowOutDTO;
import io.ylf.jcartstoreback.po.Product;

public interface ProductService {


    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
