package com.sg.model.media.dtos;

import com.sg.model.annotation.IdEncrypt;
import com.sg.model.common.dtos.PageRequestDto;
import lombok.Data;

import java.util.Date;

@Data
public class WmNewsPageReqDto extends PageRequestDto {

    private Short status;
    private Date beginPubdate;
    private Date endPubdate;
    @IdEncrypt
    private Integer channelId;
    private String keyWord;
}
