package com.yufei.demo.netty.demo.dubboDemo;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

/**
 * @Author: sunyufei
 * @Date: 2020/9/10 6:11 下午
 * @Desc: 伪代码
 */
public class consumer {
    public static void main(String[] args) throws Exception {
        //服务调用者只需要设置依赖
//        AobingService service = AobingRpcFramework.refer(AobingService.class, "127.0.0.1", 2333);
//        service.hello("xiaoming");
        refer(AobingService.class, "127.0.0.1", 2333);




    }

    public static <T> T refer(Class<T> interfaceClass, String host, int port) throws Exception {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class<?>[]{interfaceClass},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] arguments) throws Throwable {
                        System.out.println("-------");
                        return null;
                    }
                });
    }
}
