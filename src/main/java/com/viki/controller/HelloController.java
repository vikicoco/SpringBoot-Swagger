package com.viki.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author STAR
 * @create 2022-01-18 23:49
 */
@Api(tags = "Hello接口")
@RestController
public class HelloController {

    @ApiOperation("发送Get请求")
    @GetMapping("/helloGet")
    public String backHello(){
        return "hello SpringBoot, hello Swagger2";
    }

    @ApiOperation("发送Post请求")
    @PostMapping("/helloPost")
    public String backPostHello(){
        return "hello post !";
    }

}
