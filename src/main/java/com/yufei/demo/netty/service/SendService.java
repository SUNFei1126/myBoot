package com.yufei.demo.netty.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SendService
 * @Description TODO
 * @Author sunyufei
 * @DATE 2020/9/2 21:27
 **/
@Slf4j
@Service
public class SendService {

    @Autowired
    private List<BaseService> bases;

    public BaseService get(String name){

        for (BaseService base : bases) {
            if(base.get(name)){
                return base;
            }
        }
        throw new RuntimeException("未匹配到实现类");
    }
}
