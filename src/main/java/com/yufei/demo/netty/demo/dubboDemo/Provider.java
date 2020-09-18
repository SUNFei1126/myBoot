package com.yufei.demo.netty.demo.dubboDemo;

import java.lang.reflect.Method;

/**
 * @Author: sunyufei
 * @Date: 2020/9/10 6:08 下午
 * @Desc: 伪代码
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        //服务提供者只需要暴露出接口
        AobingService service = new AobingServiceImpl ();
//        AobingRpcFramework.export(service, 2333);

        Method method = service.getClass().getMethod("hello", String.class);  //找到方法
        Object result = method.invoke(service, "xiaomi");
        System.out.println(result);

    }
}
