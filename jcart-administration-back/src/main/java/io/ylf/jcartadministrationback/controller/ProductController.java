package io.ylf.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import io.ylf.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.ylf.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.ylf.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.ylf.jcartadministrationback.dto.out.PageOutDTO;
import io.ylf.jcartadministrationback.dto.out.ProductListOutDTO;
import io.ylf.jcartadministrationback.dto.out.ProductShowOutDTO;
import io.ylf.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO>search(ProductSearchInDTO productSearchInDTO
                                                    , @RequestParam Integer pageNum){


        Page<ProductListOutDTO> page = productService.search(pageNum);

        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        //pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){

        Integer integer = productService.create(productCreateInDTO);

        return integer;
    }

    @PostMapping("/update")
    public void update (@RequestBody ProductUpdateInDTO productUpdateInDTO){

        productService.update(productUpdateInDTO);
    }

    @GetMapping("getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }
    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){
        productService.delete(productId);
    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){
       productService.batchDelete(productIds);
    }
}
