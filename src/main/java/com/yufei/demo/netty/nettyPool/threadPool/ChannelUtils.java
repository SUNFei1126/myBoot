package com.yufei.demo.netty.nettyPool.threadPool;

import io.netty.channel.Channel;
import io.netty.util.AttributeKey;

import java.util.Map;

public class ChannelUtils {
    public static final int MESSAGE_LENGTH = 16;
    public static final AttributeKey<Map<Integer, Object>> DATA_MAP_ATTRIBUTEKEY = AttributeKey.valueOf("dataMap");
    public static <T> void putCallback2DataMap(Channel channel, int seq, T callback) {
        System.out.println(channel.id() +" 来添加属性 seq为: "+ seq +callback.toString());
        channel.attr(DATA_MAP_ATTRIBUTEKEY).get().put(seq, callback);
    }

    public static <T> T removeCallback(Channel channel, int seq) {
        System.out.println(channel.id() +" 来移除属性 seq为: "+ seq );
        return (T) channel.attr(DATA_MAP_ATTRIBUTEKEY).get().remove(seq);
    }
}

