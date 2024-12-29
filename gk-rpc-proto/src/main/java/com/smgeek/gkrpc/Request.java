package com.smgeek.gkrpc;

import lombok.Data;

/**
 * @Auther: Defend
 * @Date: 2024/11/10 13:58
 * @Description:
 */
@Data
public class Request {
    private ServiceDescriptor service;
    private Object[] parameters;
}
