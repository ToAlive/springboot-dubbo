package com.example.dubbozookeeper.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
//这个@Service是dubbo包下面的注解com.alibaba.dubbo.config.annotation
//dubbo会来扫描这个带@service注解的类将它们发布出去
@Service
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "《厉害了，我的国》";
    }
}
