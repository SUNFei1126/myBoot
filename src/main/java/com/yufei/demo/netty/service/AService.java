package com.yufei.demo.netty.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName AService
 * @Description TODO
 * @Author sunyufei
 * @DATE 2020/9/2 21:25
 **/
@Slf4j
@Service
public class AService extends BaseService{

    private String channelName = "InMoBi";

    @Override
    public boolean get(String name) {
        return channelName.equals(name);
    }

    @Override
    public void send() {
        log.info("Aservice-send");
    }
}
