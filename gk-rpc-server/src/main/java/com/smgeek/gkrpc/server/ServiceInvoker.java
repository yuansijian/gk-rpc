package com.smgeek.gkrpc.server;

import com.smgeek.gkrpc.Request;
import com.smgeek.gkrpc.common.utils.ReflectionUtils;

/**
 * @Auther: Defend
 * @Date: 2024/12/29 14:07
 * @Description: 调用具体服务
 */
public class ServiceInvoker {
    public Object Invoke(ServiceInstance service, Request request){
        return ReflectionUtils.invoke(
                service.getTarget(),
                service.getMethod(),
                request.getParameters());
    }
}
