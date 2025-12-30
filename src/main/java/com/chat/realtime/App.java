package com.chat.realtime;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.chat.realtime.Config.Msg;

@Controller
public class App {

    @MessageMapping("/chatMessage")
    @SendTo("/canal")
    public Msg sendMessage(Msg message){
        return message;
    }

}