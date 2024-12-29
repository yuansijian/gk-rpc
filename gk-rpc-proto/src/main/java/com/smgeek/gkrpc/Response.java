package com.smgeek.gkrpc;

import lombok.Data;

/**
 * @Auther: Defend
 * @Date: 2024/11/10 13:59
 * @Description: 表示RPC返回
 */
@Data
public class Response {
    /**
     * 服务返回编码，0-成功，非0失败
     */
    private Integer code;
    /**
     * 服务返回信息
     */
    private String message;
    /**
     * 返回的数据
     */
    private Object data;
}
