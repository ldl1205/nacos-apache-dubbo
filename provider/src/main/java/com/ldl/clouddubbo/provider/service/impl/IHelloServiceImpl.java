package com.ldl.clouddubbo.provider.service.impl;


import com.ldl.clouddubbo.provider.service.IHelloService;
import org.apache.dubbo.config.annotation.Service;


/**
 * @author LDL
 * @description
 * @date 2020/3/14/0014 16:14
 */
//这里的 Service 注解是 Dubbo 提供的一个注解类 org.apache.dubbo.config.annotation.Service
@Service
public class IHelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String str) {
        return "Hello, " + str + " (from Dubbo with Spring Boot)";
    }
}
