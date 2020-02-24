package io.ylf.jcartadministrationback.controller;

import io.ylf.jcartadministrationback.dto.in.AdministratorlLoginInDTO;
import io.ylf.jcartadministrationback.dto.in.AdministratorlUpdateProfileInDTO;
import io.ylf.jcartadministrationback.dto.out.AdministratorlGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {


    @GetMapping("/login")
    public String login(AdministratorlLoginInDTO administratorlLoginInDTO){

        return null;
    }

    @GetMapping("getProfile")
    public AdministratorlGetProfileOutDTO getProfileOutDTO(Integer adminstratorId){

        return  null;
    }

    @PostMapping("/updateProfile")
    public String updateProfile(@RequestBody AdministratorlUpdateProfileInDTO administratorlUpdateProfileInDTO){

        return null;
    }

}
