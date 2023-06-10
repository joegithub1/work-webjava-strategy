package com.example.controller;

import com.example.entity.DeviceManage;
import com.example.factory.CameraStrategyFactory;
import com.example.service.ICameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CameraController
 * @Description:
 * @Author huangjian
 * @Date 2023/6/10
 **/
@RestController
@RequestMapping("/test")
public class CameraController {

    @Autowired
    public CameraStrategyFactory cameraStrategyFactory;

    @RequestMapping("/save")
    public String save(DeviceManage deviceManage){

        //0乐橙，1大华，2海康威视
        int type = deviceManage.getType();
        ICameraService cameraService = cameraStrategyFactory.getCameraService(type);
        cameraService.saveCamera(deviceManage);
        return "ok";
    }

}
