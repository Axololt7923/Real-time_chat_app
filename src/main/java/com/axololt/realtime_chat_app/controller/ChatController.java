package com.axololt.realtime_chat_app.controller;

import com.axololt.realtime_chat_app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage send(ChatMessage message) {
        return message;
    }

    @GetMapping("chat")
    public String chat() {
        return "chat";
    }

    @GetMapping("")
    public String index(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Welcome to the Real-Time Chat App!");
        return "redirect:/chat";
    }

}
