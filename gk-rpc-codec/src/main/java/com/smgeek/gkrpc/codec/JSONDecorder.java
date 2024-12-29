package com.smgeek.gkrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @Auther: Defend
 * @Date: 2024/11/10 14:19
 * @Description:
 */
public class JSONDecorder implements Decoder{
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes, clazz);
    }
}
