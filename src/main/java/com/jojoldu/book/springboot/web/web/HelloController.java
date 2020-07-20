package com.jojoldu.book.springboot.web.web;

import com.jojoldu.book.springboot.web.web.dto.HelloRespnseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//컨트롤러를 JSON으로 반환하는 컨트롤러로 만들어쥼
public class HelloController {
    @GetMapping("/hello")//HTTP Method인 GET의 요청을 받을 수 있는 API를 만들어준다.
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloRespnseDto helloDto(@RequestParam("name")String name,@RequestParam("amount")int amount)
            //RequestParam은 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션입니다.
            //여기서는 외부에서 name(@RequestParam("name"))이란 이름으로 넘긴
    //      //파라미터를 메소드 파라미터 name(String name)에 저장하게 됩니다.
    {
        return new HelloRespnseDto(name,amount);
    }
}

