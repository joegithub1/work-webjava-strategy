package com.example.factory;

import com.example.service.ICameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName CameraStrategyFactory
 * @Description:
 * @Author huangjian
 * @Date 2023/6/10
 **/
@Component
public class CameraStrategyFactory {
    @Autowired
    public Map<String, ICameraService> cameraServiceMap = new ConcurrentHashMap<>();
    public ICameraService cameraService;

    private ICameraService getCameraService(String component){
        ICameraService iCameraService = cameraServiceMap.get(component);
        if(null == iCameraService){
            throw  new RuntimeException("策略模式没有找到实现类。");
        }
        return iCameraService;
    }
    //获取实现类 //type：0乐橙，1大华，2海康威视
    public ICameraService getCameraService(int type){
        switch (type){
            case 0:
                cameraService = getCameraService("lcCameraServiceImpl");
                break;
            case 1:
                cameraService = getCameraService("ysCameraServiceImpl");
                break;
            case 2:
                break;
            default:
                break;
        }
        return cameraService;
    }
}
