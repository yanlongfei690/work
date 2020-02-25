package io.ylf.jcartadministrationback.controller;

import io.ylf.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.ylf.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.ylf.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.ylf.jcartadministrationback.dto.out.PageOutDTO;
import io.ylf.jcartadministrationback.dto.out.ProductListOutDTO;
import io.ylf.jcartadministrationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {


    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO>search(ProductSearchInDTO productSearchInDTO
                                                    , @RequestParam Integer pageNum){

        return null;
    }

    @PostMapping("/")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){

        return null;
    }

    @PostMapping("/update")
    public String update (@RequestBody ProductUpdateInDTO productUpdateInDTO){

        return null;
    }

    @GetMapping("getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId)
}
