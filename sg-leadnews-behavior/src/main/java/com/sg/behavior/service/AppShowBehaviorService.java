package com.sg.behavior.service;

import com.sg.model.behavior.dtos.ShowBehaviorDto;
import com.sg.model.common.dtos.ResponseResult;

public interface AppShowBehaviorService {
    ResponseResult saveShowBehavior(ShowBehaviorDto dto);
}
