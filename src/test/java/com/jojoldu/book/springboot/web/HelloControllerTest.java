package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;


@RunWith(SpringRunner.class)//스프링부트 테스트와 Junit의 연결자 역할
@WebMvcTest
public class HelloControllerTest {

    @Autowired//스프링이 관리하는 빈(Bean)을 주입 받습니다.
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello="hello";
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void helloDto가_리턴된다()throws Exception{
        String name="hello";
        int amount =1000;

        mvc.perform(
                get("/hello/dto")
                        .param("name",name)
                        .param("amount",String.
                                valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name",is(name)))
                .andExpect(jsonPath("$.amount",is(amount)));


    }
}
