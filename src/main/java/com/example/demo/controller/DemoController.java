package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "Demoコントローラー")
@RestController
@RequestMapping("/demo")
public class DemoController {

    // http://localhost:8080/swagger-ui.html

    @ApiOperation("挨拶をする。")
    @GetMapping("/hello/{name}")
    public String hello(@ApiParam("名前") @PathVariable String name) {
        return "hello " + name + "!";
    }

}
