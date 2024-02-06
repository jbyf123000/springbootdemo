package top.jbyf.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bb")
public class TestController {
    @GetMapping("get")
    public String hello(){
        return "Hello World";
    }
}
