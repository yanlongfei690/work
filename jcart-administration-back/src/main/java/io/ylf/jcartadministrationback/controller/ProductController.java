package io.ylf.jcartadministrationback.controller;

import io.ylf.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.ylf.jcartadministrationback.dto.out.PageOutDTO;
import io.ylf.jcartadministrationback.dto.out.ProductListOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {


    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO>search(ProductSearchInDTO productSearchInDTO
                                                    , @RequestParam Integer pageNum){

        return null;
    }
}
