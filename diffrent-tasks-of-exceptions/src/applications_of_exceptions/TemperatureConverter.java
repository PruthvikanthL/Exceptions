package applications_of_exceptions;

public class TemperatureConverter {
    String temp;
    public TemperatureConverter(String temp){
        this.temp=temp;
    }
    public void convertingtemp(){
        try{
            double tempconvert=Double.parseDouble(temp);
            System.out.println("Converted Temperature :"+tempconvert+"°C");
        }
        catch (NumberFormatException e){
            System.out.println("Error: Invalid Temperature Formate"+e.toString());
        }
        System.out.println("End of temperature Conversion");


    }
}
