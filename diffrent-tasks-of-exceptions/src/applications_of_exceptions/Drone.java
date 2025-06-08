package applications_of_exceptions;

import exceptions.LowBatteryException;

public class Drone {
    int batterlevel;
    public Drone(int batterlevel){
        this.batterlevel=batterlevel;
    }
    public void checkbattery(){
        try{
            if(batterlevel<10){
                throw new LowBatteryException("Battery is too low  "+batterlevel+"%");
            }
            System.out.println("Battery is sufficient"+batterlevel+"%");
        }
        catch (LowBatteryException e){
            System.out.println("Error :"+e.getMessage());
        }
        System.out.println("Battery check Complete");
    }
}
