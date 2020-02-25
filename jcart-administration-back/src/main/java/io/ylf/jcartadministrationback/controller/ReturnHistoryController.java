package io.ylf.jcartadministrationback.controller;

import io.ylf.jcartadministrationback.dto.in.ReturnHistoryCreateInDTO;
import io.ylf.jcartadministrationback.dto.out.PageOutDTO;
import io.ylf.jcartadministrationback.dto.out.ReturnHistoryOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/returnhistory")
public class ReturnHistoryController {


    @GetMapping("/getListByReturnId")
    public List<ReturnHistoryOutDTO> getListByReturnId(@RequestParam Integer returnId){
        return null;

    }

    @PostMapping("/create")
    public Integer create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO){
      return  null;
    }
}
