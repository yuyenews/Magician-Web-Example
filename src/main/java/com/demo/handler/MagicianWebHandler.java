package com.demo.handler;

import com.magician.web.MagicianWeb;
import io.magician.common.annotation.TCPHandler;
import io.magician.tcp.codec.impl.http.request.MagicianRequest;
import io.magician.tcp.handler.TCPBaseHandler;

@TCPHandler(path = "/")
public class MagicianWebHandler implements TCPBaseHandler<MagicianRequest> {

    @Override
    public void request(MagicianRequest magicianRequest) {
        // 在http的handler里面调用web组件
        try{
            MagicianWeb.createWeb()
                    .request(magicianRequest);
        } catch (Exception e){
        }
    }
}
