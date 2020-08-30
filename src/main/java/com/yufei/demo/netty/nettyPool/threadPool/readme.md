# 多线程客户端使用netty池
建立10个线程并发 使用netty池中的共享channel 4个
在channel中根据每条消息的seq 唯一标识 对应设置channel 的AttributeKeyMap设置对应callback响应
callback使用wait 和 notify 来等待结果

博客地址： https://blog.csdn.net/linsongbin1/article/details/77990882