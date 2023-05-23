package com.bit.Controller;

import com.bit.Service.BitDemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

@Controller
public class BitDemoServiceController {

    @Resource(name = "bitDemoServiceImp")
    private BitDemoService service;

    @PostMapping(value = "")
    public String insertDemoService(){

        return "";
    }


}
