package com.example.dubbozookeeper.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.将服务提供者注册到注册中心
 *      引入dubbo和zookeeper相关的依赖
 *      配置dubbo的扫描包和注册中心地址
 *      使用@Service发布服务
 */
@SpringBootApplication
public class ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicketApplication.class, args);
    }
}
