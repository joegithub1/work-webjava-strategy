package com.example.entity;

/**
 * @ClassName DeviceManage
 * @Description:
 * @Author huangjian
 * @Date 2023/6/10
 **/
public class DeviceManage {

    private Long id;
    private String deviceName;

    private int type; //0乐橙，1大华，2海康威视

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
