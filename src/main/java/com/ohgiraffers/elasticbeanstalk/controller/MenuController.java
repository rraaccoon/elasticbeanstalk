package com.ohgiraffers.elasticbeanstalk.controller;

import com.ohgiraffers.elasticbeanstalk.dto.MenuDTO;
import com.ohgiraffers.elasticbeanstalk.service.MenuService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MenuController {

    private final MenuService service;

    @GetMapping("/health")
    public String healthCheck() {
        return "local health check!!";
    }

    @GetMapping("/menus/{menuCode}")
    public MenuDTO findByMenuCode(@PathVariable("menuCode") int menuCode) {

        MenuDTO resultMenu = service.findByMenuCode(menuCode);

        return resultMenu;
    }

}
