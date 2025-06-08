package applications_of_exceptions;

import exceptions.NoWiFiConnectionException;

public class IoTDevice {
    boolean isconnected=false;
    String deviceName;
    public IoTDevice(String deviceName,boolean isconnected){
        this.deviceName=deviceName;
        this.isconnected=isconnected;
    }
    public void checkConnection(){
        try{
            if(!isconnected){
                throw new NoWiFiConnectionException("Device"+deviceName+"has lost Wi-Fi connectivity");
            }
            else{
                System.out.println("Device " + deviceName + " is connected to Wi-Fi.");
            }
        }catch(NoWiFiConnectionException e){
            System.out.println("Error:"+e.getMessage());
        }
        System.out.println("Wi-Fi check Complete");
    }
}
