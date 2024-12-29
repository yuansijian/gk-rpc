package com.smgeek.gkrpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONDecorderTest {
    @Test
    public void decode() {
        Encoder encoder = new JSONEncoder();
        TestBean testBean = new TestBean();
        testBean.setName("yuan");
        testBean.setAge(18);

        Decoder decoder = new JSONDecorder();
        TestBean testBean2 = decoder.decode(encoder.encode(testBean), TestBean.class);
        assertEquals(testBean.getName(), testBean2.getName());
        assertEquals(testBean.getAge(), testBean2.getAge());
    }

}