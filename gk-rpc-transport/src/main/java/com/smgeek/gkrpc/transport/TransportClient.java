package com.smgeek.gkrpc.transport;

import com.smgeek.gkrpc.Peer;

import java.io.InputStream;

/**
 * 创建连接
 * 发送数据，并且等待响应
 * 关闭连级
 */
public interface TransportClient {
    void connect(Peer peer);
    void close();
    InputStream write(InputStream data);
}
