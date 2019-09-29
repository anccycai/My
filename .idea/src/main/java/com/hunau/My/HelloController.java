package com.hunau.My;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created  on 2019/9/29
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {

        return "湖南省常德市";
    }
}