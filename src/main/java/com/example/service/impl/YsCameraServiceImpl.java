package com.example.service.impl;

import com.example.entity.DeviceManage;
import com.example.service.ICameraService;
import org.springframework.stereotype.Service;

/**
 * @ClassName YsCameraService
 * @Description:
 * @Author huangjian
 * @Date 2023/6/10
 **/
@Service
public class YsCameraServiceImpl implements ICameraService {
    @Override
    public void saveCamera(DeviceManage deviceManage) {
        System.out.println("调用【萤石】品牌的摄像头API新增接口");
    }
}
