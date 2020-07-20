package com.jojoldu.book.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스트링 부트의 자동설정, 스프링Bean읽기와 생성 모두 자동설정, @SpringBootApplication이 있는 위치부터 설정을 읽어감
public class Application {//앞으로 만들 프로젝트의 메인클래스
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class,args);//해당 SpringApplication.run으로 인해 내장 WAS를 사용함
    }
}
