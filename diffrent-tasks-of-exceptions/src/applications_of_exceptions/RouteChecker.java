package applications_of_exceptions;

import exceptions.RouteNotFoundException;

public class RouteChecker {
    String[][] availableroutes={{"challakere","Benglore"},{"chitradurga","Benglore"},{"hiriyur","Benglore"}};
    String source;
    String destination;
    public RouteChecker(String source,String destination){
        this.source=source;
        this.destination=destination;
    }
    public void findRoute(){
        boolean flag=false;
        for(String[] route:availableroutes) {
            if (route[0].equalsIgnoreCase(source) && route[1].equalsIgnoreCase(destination)) {
                flag = true;
                break;
            }
        }
            try{
                if(!flag){
                    throw new RouteNotFoundException("No route found from "+source+" to "+destination);
                }
                System.out.println("Route found from "+source+" to "+destination);
            }
            catch (RouteNotFoundException e){
                System.out.println("Error:"+e.toString());
            }
            System.out.println("Route checking complete.");
        }
    }

