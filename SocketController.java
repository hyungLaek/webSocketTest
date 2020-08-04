package com.simple.portal.biz.v1.socket.api;

import com.simple.portal.biz.v1.socket.entity.SocketEntity;
import com.simple.portal.common.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/socket")
public class SocketApi {

    @Autowired
    ApiResponse apiResponse;

    @MessageMapping("/notread")
    @SendTo("/sub/comment/notread")
    public String tttx(String message) throws Exception {
        System.out.println("TTT>>"+message);
        return message;
    }

    @MessageMapping("/TTT")
    @SendTo("/topic/message")
    public SocketEntity ttt(SocketEntity message) throws Exception {
        System.out.println("id>>"+message.getId());
        return message;
    }

}
