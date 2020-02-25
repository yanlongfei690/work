package io.ylf.jcartadministrationback.controller;

import io.ylf.jcartadministrationback.dto.out.AddressListUotDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("getListByCustomerId")
    public List<AddressListUotDTO>getListByCustomer(@RequestParam Integer customerId){
        return  null;

    }


}
