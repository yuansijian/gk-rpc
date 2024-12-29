package com.smgeek.gkrpc.codec;

/**
 * @Auther: Defend
 * @Date: 2024/11/10 14:16
 * @Description: 序列化
 */
public interface Encoder {
    byte[] encode(Object object);

}
