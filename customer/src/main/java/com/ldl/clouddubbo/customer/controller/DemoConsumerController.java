package com.ldl.clouddubbo.customer.controller;

import com.ldl.clouddubbo.provider.service.IHelloService;
import org.apache.dubbo.config.annotation.Reference;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LDL
 * @description
 * @date 2020/3/14/0014 19:19
 */
@RestController
public class DemoConsumerController {

    @Reference
    private IHelloService demoService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return demoService.sayHello(name);
    }
}
