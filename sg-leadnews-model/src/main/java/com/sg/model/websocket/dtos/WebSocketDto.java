package com.sg.model.websocket.dtos;

import com.sg.model.annotation.IdEncrypt;
import lombok.Data;

@Data
public class WebSocketDto {
    // 设备ID
    @IdEncrypt
    Integer equipmentId;
    // 文章ID
    @IdEncrypt
    String token;
}
