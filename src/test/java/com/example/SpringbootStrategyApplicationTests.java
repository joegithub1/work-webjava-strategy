package com.example;

import com.example.entity.DeviceManage;
import com.example.factory.CameraStrategyFactory;
import com.example.service.ICameraService;
import com.example.service.impl.LcCameraServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootStrategyApplicationTests {

    @Autowired
    public CameraStrategyFactory cameraStrategyFactory;
    @Test
    void contextLoads() {
        DeviceManage deviceManage = new DeviceManage();

        ICameraService cameraService = cameraStrategyFactory.getCameraService(1);
        cameraService.saveCamera(deviceManage);


    }

}
