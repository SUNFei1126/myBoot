package com.yufei.demo.netty.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: sunyufei
 * @Date: 2020/9/10 3:19 下午
 * @Desc:
 * ArrayBlockingQueue：基于数组的先进先出队列，有界
 * LinkedBlockingQueue：基于链表的先进先出队列，有界
 * SynchronousQueue：无缓冲的等待队列，无界
 *
 * AbortPolicy：默认，队列满了丢任务抛出异常
 * DiscardPolicy：队列满了丢任务不异常
 * DiscardOldestPolicy：将最早进入队列的任务删，之后再尝试加入队列
 * CallerRunsPolicy：如果添加到线程池失败，那么主线程会自己去执行该任务
 *
 *  https://juejin.im/post/6870259718342836238?utm_source=gold_browser_extension
 */
public class ThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException {
//        poolTest();
        Byte a = 0;
        Integer b =0;
        System.out.println(a.equals(b.byteValue()));
    }


    public static void poolTest() throws InterruptedException {
        System.out.println("开始执行");
        // 阻塞队列容量声明为100个
        ThreadPoolExecutor executor = new ThreadPoolExecutor
                (10, 10, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque<>(50));
        // 设置拒绝策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // 空闲队列存活时间
        executor.setKeepAliveTime(20,TimeUnit.SECONDS);
        List<Integer> list = new ArrayList<>(2000);

        try {
            //模拟400个请求
            for (int i = 0; i <400; i++) {
                final int num = i;
                executor.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"-结果: "+ num);
                    try {
                        Thread.sleep(4*1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    list.add(num);
                });
            }
        }finally {
            executor.shutdown();
            executor.awaitTermination(10,TimeUnit.SECONDS);
        }
        System.out.println("线程执行结束");
    }

}
