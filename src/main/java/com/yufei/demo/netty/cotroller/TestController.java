package com.yufei.demo.netty.cotroller;

import com.yufei.demo.netty.service.BaseService;
import com.yufei.demo.netty.service.SendService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class TestController {

    @Autowired
    SendService sendService;

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/ping")
    public String ping(){
        logger.info("访问 /ping 接口 成功");
        return "hello ping is ok!";
    }

    @GetMapping("/base")
    public String base(@RequestParam String name){
        logger.info("访问 /base 接口 成功");
        BaseService baseService = sendService.get(name);
        baseService.callback(1,"123456");
        return "hello ping is ok!";
    }


}
