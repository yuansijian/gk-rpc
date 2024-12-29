package com.smgeek.gkrpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther: Defend
 * @Date: 2024/11/10 13:54
 * @Description: 表示网络传输的一个断点
 */
@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private Integer port;
}
