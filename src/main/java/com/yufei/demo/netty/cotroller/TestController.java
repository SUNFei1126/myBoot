package com.yufei.demo.netty.cotroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/ping")
    public String ping(){
        logger.info("访问 /ping 接口 成功");
        return "hello ping is ok!";
    }
}
