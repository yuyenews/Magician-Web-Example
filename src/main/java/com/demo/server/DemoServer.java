package com.demo.server;

import com.magician.web.MagicianWeb;
import io.magician.Magician;

public class DemoServer {

    public static void main(String[] args) {
        try {

            Magician.createHttpServer()
                    .bind(8080, 100)// 设置端口号和最大连接数
                    .threadPool(DemoThreadPool.getThreadPoolExecutor())// 设置一个线程池
                    .httpHandler("/", req -> {

                        // 在http的handler里面调用web组件
                        MagicianWeb.createWeb()
                                .scan("com.demo.controller")// controller和拦截器所在的包名
                                .request(req);

                    })
                    .start();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
