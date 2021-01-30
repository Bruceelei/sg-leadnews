package com.sg.model.media.dtos;

import com.sg.model.annotation.IdEncrypt;
import lombok.Data;

@Data
public class WmMaterialDto {

    @IdEncrypt
    private Integer id;

//    private String url;
}
