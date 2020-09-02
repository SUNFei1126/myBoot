package com.yufei.demo.netty.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName BService
 * @Description TODO
 * @Author sunyufei
 * @DATE 2020/9/2 21:26
 **/
@Slf4j
@Service
public class BService extends BaseService{
    private String channelName = "BaiDu";
    @Override
    public boolean get(String name) {
        return channelName.equals(name);
    }

    @Override
    public void send() {
        log.info("Bservice-send");
    }
}
