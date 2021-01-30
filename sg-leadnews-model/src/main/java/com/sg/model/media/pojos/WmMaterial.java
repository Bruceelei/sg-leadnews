package com.sg.model.media.pojos;

import com.sg.model.annotation.IdEncrypt;
import lombok.Data;

import java.util.Date;

@Data
public class WmMaterial {
    private Integer id;
    @IdEncrypt
    private Long userId;
    private String url;
    private short type;
    private Short isCollection;
    private Date createdTime;
}