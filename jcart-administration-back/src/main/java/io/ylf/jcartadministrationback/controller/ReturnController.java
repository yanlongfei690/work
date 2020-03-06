package io.ylf.jcartadministrationback.controller;

import io.ylf.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.ylf.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import io.ylf.jcartadministrationback.dto.out.PageOutDTO;
import io.ylf.jcartadministrationback.dto.out.ReturnListOutDTO;
import io.ylf.jcartadministrationback.dto.out.ReturnShowOutDTO;
import io.ylf.jcartadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
@CrossOrigin
public class ReturnController {


    @Autowired
    private ReturnService returnService;

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO>search(ReturnSearchInDTO returnSearchInDTO ,@RequestParam Integer pageNum){

        return null;
    }

   @GetMapping("getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
   }
   @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

   }

}
