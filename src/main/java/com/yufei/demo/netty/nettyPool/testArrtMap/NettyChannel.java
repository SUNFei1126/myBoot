package com.yufei.demo.netty.nettyPool.testArrtMap;

import lombok.Data;
import java.util.Date;



@Data
public class NettyChannel {


    private String name;


    private Date createDate;


    public NettyChannel(String name,Date createDate) {
        this.name = name;
        this.createDate = createDate;
    }


}
