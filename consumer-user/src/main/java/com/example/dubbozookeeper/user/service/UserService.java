package com.example.dubbozookeeper.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbozookeeper.ticket.service.TicketService;
import org.springframework.stereotype.Service;
//这个是spring的@Service注解
@Service
public class UserService {

    //Reference按照全类名远程调用，它会在注册中心去找全类名与TicketService相同的类来调用
    @Reference //远程调用
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了："+ticket);
    }
}
