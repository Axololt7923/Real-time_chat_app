package com.axololt.realtime_chat_app.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessage {
    private String message;
    private String sender;
    private Long id;
    private String image;
}
