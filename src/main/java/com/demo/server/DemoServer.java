package com.demo.server;

import io.magician.Magician;

public class DemoServer {

    public static void main(String[] args) {
        try {

            Magician.createTCPServer()
                    .scan("com.demo") // 这里不仅要扫描handler，还要扫描route，拦截器等所有资源
                    .bind(8080, 100);// 设置端口号和backlog

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
