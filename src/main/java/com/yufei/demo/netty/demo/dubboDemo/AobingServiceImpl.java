package com.yufei.demo.netty.demo.dubboDemo;

/**
 * @Author: sunyufei
 * @Date: 2020/9/10 5:17 下午
 * @Desc:
 */
public class AobingServiceImpl implements AobingService{

    @Override
    public String hello(String name) {
        return "Yo man Hello，I am" + name;
    }
}
