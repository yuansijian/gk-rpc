package com.smgeek.gkrpc.example;

import com.smgeek.gkrpc.server.RpcServer;
import com.smgeek.gkrpc.server.RpcServerConfig;

/**
 * @Auther: Defend
 * @Date: 2024/12/29 15:00
 * @Description:
 */
public class Server {
    public static void main(String[] args) {
        RpcServer server = new RpcServer(new RpcServerConfig());
        server.register(CalcService.class, new CalsServiceImpl());
        server.start();
    }
}
