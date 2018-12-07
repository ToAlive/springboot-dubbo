package com.example.dubbozookeeper.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.引入dubbo和zookeeper的相关依赖
 * 2.配置dubbo的注册中心地址
 * 3.引用服务
 *      在类路径下创建一个要调用的服务中的接口类
 *      注意：这个接口类的全路径名要与服务中被调用的接口类的全路径相同
 */
@SpringBootApplication
public class ConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApplication.class, args);
    }
}
