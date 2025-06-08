package applications_of_exceptions;

public class CoordinateConverter {
    String xStr,yStr;

    public CoordinateConverter(String xStr,String yStr) {
        this.xStr = xStr;
        this.yStr = yStr;
    }

    public void convert() {
        try {
            int x = Integer.parseInt(xStr);
            int y = Integer.parseInt(yStr);
            try {
                if (x<0) {
                    throw new IllegalArgumentException("X-coordinate cannot be negative:"+x);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Validation Error: "+e.getMessage());
            }
            try {
                if (y<0){
                    throw new IllegalArgumentException("Y-coordinate cannot be negative:"+y);}
            } catch (IllegalArgumentException e) {
                System.out.println("Validation Error: " + e.getMessage());
            }
            System.out.println("Final Coordinates: ("+x+","+y+")");
        } catch (NumberFormatException e) {
            System.out.println("Input Error: Please enter valid integer values."+e.getMessage());
        }
        System.out.println("Coordinate conversion completed.");
    }
}
