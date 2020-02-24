package io.ylf.jcartstoreback.controller;

import io.ylf.jcartstoreback.dto.in.StoreLoginInDTO;
import io.ylf.jcartstoreback.dto.in.StoreRegisterInDTO;
import io.ylf.jcartstoreback.dto.in.StoreUpdateInDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class StoreController {


    @PostMapping("/register")
    public String register(@RequestBody StoreRegisterInDTO storeLoginInDTO){

        return  null;
    }
    @GetMapping("/login")
    public String login(StoreLoginInDTO storeLoginInDTO){

        return null;
    }
    @PostMapping("/changepassword")
    public String changepassword(@RequestBody StoreUpdateInDTO storeUpdateInDTO){
        return  null;
    }

}
