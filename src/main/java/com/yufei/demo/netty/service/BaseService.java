package com.yufei.demo.netty.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName BaseService
 * @Description TODO
 * @Author sunyufei
 * @DATE 2020/9/2 21:02
 **/
@Slf4j
public abstract class BaseService {


    public abstract boolean get(String name);

    public boolean callback(int type, String no){
        switch (type){
            case 1:
                log.info("base-type-1");
                registerData();
                break;
            case 2:
                log.info("base-type-2");
                auditData();
                break;
            default:
                break;
        }
        return true;
    }

    private void registerData(){
        log.info("base-register");
        send();
    }
    private void auditData(){
        log.info("base-audit");
        send();
    }

    public abstract void send();
}
