package com.ohgiraffers.elasticbeanstalk.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MenuControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @DisplayName("어플리케이션 헬스체크")
    @Test
    void healthCheck() throws Exception {
        mockMvc.perform(get("/health"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @DisplayName("2번 메뉴 우럭스무디가 맞는 지 확인")
    @Test
    void findMenuByMenuCode() throws Exception {
        mockMvc.perform(get("/menus/2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.menuName").value("우럭스무디"))
                .andDo(print());
    }

}