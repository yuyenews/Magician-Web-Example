package com.demo.controller;

import com.demo.controller.vo.DemoVO;
import com.magician.web.core.annotation.Route;
import io.magician.tcp.http.constant.ReqMethod;

@Route("/demoController")
public class DemoController {

    @Route(value = "/demo", requestMethod = ReqMethod.POST)
    public DemoVO demo(DemoVO demoVO){
        return demoVO;
    }
}
