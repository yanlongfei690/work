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
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO>search(ProductSearchInDTO productSearchInDTO
            , @RequestParam(required = false, defaultValue = "1") Integer pageNum){

        Page<ProductListOutDTO> page = productService.search(productSearchInDTO, pageNum);

        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){

        System.out.println("啥也没");
        Integer integer = productService.create(productCreateInDTO);

        return integer;
    }

    @PostMapping("/update")
    public void update (@RequestBody ProductUpdateInDTO productUpdateInDTO){

        productService.update(productUpdateInDTO);
    }

    @GetMapping("getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO byId = productService.getById(productId);
        return byId;
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
