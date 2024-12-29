package com.smgeek.gkrpc.server;

/**
 * @Auther: Defend
 * @Date: 2024/12/29 14:02
 * @Description:
 */
public class TestClass implements TestInterface{
    @Override
    public void hello() {
        System.out.println("hello");
    }
}
