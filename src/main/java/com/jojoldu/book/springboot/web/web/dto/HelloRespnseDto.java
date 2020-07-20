package com.jojoldu.book.springboot.web.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter//모든 필드에 Getter를 설정해줌
@RequiredArgsConstructor//선언된 모든 final필드가 포함된 생성자를 생성해 줍니다.
                        //final이 없는 필드는 생성자에 포함되지 않습니다.
public class HelloRespnseDto {

    private final String name;
    private final int amount;
}
