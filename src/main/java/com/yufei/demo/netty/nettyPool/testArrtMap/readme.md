# Netty4.1之后AttributeMap变化
在netty4.1之前 ChannelHandlerContext.attr()设置的属性值是相互独立的
例如 同一个客户端下设置两个handler 则不同handle之间设置的AttributeMap就是不同的

可以改变netty版本号做测试
```
<dependency>
            <groupId>io.netty</groupId>
            <artifactId>netty-all</artifactId>
            <version>4.1.51.Final</version>
<!--            <version>4.0.56.Final</version>-->
        </dependency>
```
在netty4.1之前的版本中使用ChannelHandlerContext.channle设置arrt 是通过channle设置属性 不同handle之间也是相同的属性