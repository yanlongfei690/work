package io.ylf.jcartadministrationback.controller;

import io.ylf.jcartadministrationback.dto.in.*;
import io.ylf.jcartadministrationback.dto.out.AdministratorListOutDTO;
import io.ylf.jcartadministrationback.dto.out.AdministratorShowOutDTO;
import io.ylf.jcartadministrationback.dto.out.AdministratorlGetProfileOutDTO;
import io.ylf.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {


    @GetMapping("/login")
    public String login(AdministratorlLoginInDTO administratorlLoginInDTO){

        return null;
    }

    @GetMapping("getProfile")
    public AdministratorlGetProfileOutDTO getProfileOutDTO(@RequestParam(required = false) Integer adminstratorId){

        return  null;
    }

    @PostMapping("/updateProfile")
    public String updateProfile(@RequestBody AdministratorlUpdateProfileInDTO administratorlUpdateProfileInDTO){

        return null;
    }
    @GetMapping("/getPwdResetCode")
    public String getPwdRestCode(@RequestParam String email){
        return null;
    }

    @PostMapping("restPwd")
    public void resePwd(@RequestBody AdministratorRestPwdInDTO administratorRestPwdInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO>getList(Integer pageNum){

         return null;
    }

    @GetMapping("/getById")
    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId){

        return  null;
    }

    @PostMapping("/create")
    public String create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){

        return  null;
    }
    @PostMapping("/update")
    public String update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){
        return  null;
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer administratorId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> administratorId){

    }

}
