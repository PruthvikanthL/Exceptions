package applications_of_exceptions;

import exceptions.InvalidColorCodeException;

public class ColorValidator {
    String colorcode;
    public ColorValidator(String colorcode){
        this.colorcode=colorcode;
    }
    public void validate(){
        try{
            if(!colorcode.matches("^#[0-9A-Fa-f]{6}$")){
                throw new InvalidColorCodeException("invalid color code "+colorcode);
            }
            System.out.println("Color code is valid "+colorcode);
        }
        catch (InvalidColorCodeException e){
            System.out.println("Error:"+e.toString());
        }
        System.out.println("End of Color validation ");
    }
}
