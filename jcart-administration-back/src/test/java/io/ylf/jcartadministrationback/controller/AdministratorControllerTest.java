package io.ylf.jcartadministrationback.controller;

import io.ylf.jcartadministrationback.constant.ClientExceptionConstant;
import io.ylf.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import io.ylf.jcartadministrationback.dto.out.AdministratorLoginOutDTO;
import io.ylf.jcartadministrationback.exception.ClientException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AdministratorControllerTest {

    @Autowired
    private AdministratorController administratorController;

    @Test
    void login() {

        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("123456");
        AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        assertNotNull(loginOutDTO);
    }
    @Test
    void loginWrongUsername(){
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin110");
        administratorLoginInDTO.setPassword("123456");
        try {
            AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE, errCode);
        }
    }

    @Test
    void loginWrongPassword(){
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("abcdef");
        try {
            AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_PASSWORD_INVALID_ERRCODE, errCode);
        }
    }
}