package com.albertolewis;


public class NetworkDevice {

    private String deviceName;
    private String ipAddress;
    private DeviceStatus deviceStatus;
    public NetworkDevice(String deviceName, String ipAddress) {
        this.deviceName = deviceName;
        this.ipAddress = ipAddress;
        this.deviceStatus = DeviceStatus.UNKNOWN;
    }


    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public DeviceStatus getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus;
    }
}
