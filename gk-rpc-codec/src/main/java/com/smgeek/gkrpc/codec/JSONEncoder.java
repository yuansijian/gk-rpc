package com.smgeek.gkrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @Auther: Defend
 * @Date: 2024/11/10 14:18
 * @Description: 基于json的序列化实现
 */
public class JSONEncoder implements Encoder {

    @Override
    public byte[] encode(Object object) {
        return JSON.toJSONBytes(object);
    }
}
