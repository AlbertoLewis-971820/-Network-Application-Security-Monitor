package com.albertolewis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<NetworkDevice> devices = new ArrayList<>();

        NetworkScanner networkScanner = new NetworkScanner();

        devices.add(new NetworkDevice("Cisco Switch", "192.168.1.254"));
        devices.add(new NetworkDevice("OMARCHY_DESKTOP", "192.168.1.183"));
        devices.add(new NetworkDevice("PS5", "192.168.1.190"));

        System.out.println("Network Application Security Monitor");
        System.out.println("-----------------------------------------");

        for (NetworkDevice device : devices) {

            try{
                boolean isReachable = networkScanner.checkConnectivity(device.getIpAddress());
                if(isReachable){
                    device.setDeviceStatus(DeviceStatus.ONLINE);
                }else{
                    device.setDeviceStatus(DeviceStatus.OFFLINE);
                }
            }catch(IOException e){
                System.out.println("Error with: " + device.getDeviceName() + " " + e.getMessage());
                device.setDeviceStatus(DeviceStatus.UNKNOWN);
            }

            System.out.println("Device Name: " + device.getDeviceName());
            System.out.println("Device Ip: " + device.getIpAddress());
            System.out.println("Device Status: " + device.getDeviceStatus());
            System.out.println();
        }
        System.out.println("-----------------------------------------");

        countTotalDevices(devices);

        int onlineCount = countOnLineDevices(devices);

        System.out.println("Online: " + onlineCount);


    }

    public static void countTotalDevices(List<NetworkDevice> devices) {

        System.out.println("Total Devices: " + devices.size());
    }

    public static int countOnLineDevices(List<NetworkDevice> devices){

        int onlineCount = 0;
        for(NetworkDevice device : devices){

            if(device.getDeviceStatus() == DeviceStatus.ONLINE){
                onlineCount++;
            }

        }
        return onlineCount;

    }
}