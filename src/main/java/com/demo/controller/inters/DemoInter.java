package com.demo.controller.inters;

import com.magician.web.core.annotation.Interceptor;
import com.magician.web.core.interceptor.MagicianInterceptor;
import io.magician.tcp.http.request.MagicianRequest;

@Interceptor(pattern = "/demoController/*")
public class DemoInter implements MagicianInterceptor {

    /**
     * 接口执行之前
     * @param magicianRequest
     * @return
     */
    @Override
    public Object before(MagicianRequest magicianRequest) {
        System.out.println(magicianRequest);
        return SUCCESS;
    }

    /**
     * 接口执行之后
     * @param magicianRequest
     * @param o 接口返回的数据
     * @return
     */
    @Override
    public Object after(MagicianRequest magicianRequest, Object o) {
        System.out.println(o);
        return SUCCESS;
    }
}
