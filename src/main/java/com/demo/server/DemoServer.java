package com.demo.server;

import com.magician.web.MagicianWeb;
import io.magician.Magician;
import io.magician.tcp.codec.impl.http.request.MagicianRequest;

public class DemoServer {

    public static void main(String[] args) {
        try {

            Magician.createTCPServer()
                    .handler("/", req -> {
                        MagicianRequest request = (MagicianRequest) req;

                        // 在http的handler里面调用web组件
                        try{
                            MagicianWeb.createWeb()
                                    .scan("com.demo.controller")// controller和拦截器所在的包名
                                    .request(request);
                        } catch (Exception e){
                        }

                    })
                    .bind(8080, 100);// 设置端口号和最大连接数

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
