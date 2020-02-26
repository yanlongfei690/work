package io.ylf.jcartstoreback.controller;


import io.ylf.jcartstoreback.dto.in.*;
import io.ylf.jcartstoreback.dto.out.CustomerProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/register")
    public Integer register(@RequestBody CustomerRegisterInDTO customerRegisterInDTO){
        return null;
    }
    @GetMapping("/login")
    public String login(CustomerLoginInDTO customerLoginInDTO){

        return null;
    }

    @GetMapping("/getProfile")
    public CustomerProfileOutDTO getProfile(@RequestParam Integer customerId){

        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody CustomerUpdateProfileInDTO customerUpdateProfileInDT,
                              @RequestAttribute Integer customerId){

    }

    @PostMapping("/changePwd")
    public void changePwd(@RequestBody CustomerChangePwdInDTO customerChangePwdInDTO,
                          @RequestAttribute Integer customerId){


    }
    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return null;
    }
     @PostMapping("resetPwd")
    public void resetPwd(@RequestBody CustomerResetPwdInDTO customerResetPwdInDTO){

     }
}
