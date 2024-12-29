package com.smgeek.gkrpc.example;

/**
 * @Auther: Defend
 * @Date: 2024/12/29 15:01
 * @Description:
 */
public class CalsServiceImpl implements CalcService{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
}
