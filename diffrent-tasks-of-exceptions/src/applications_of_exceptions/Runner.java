package applications_of_exceptions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("This is the List Operations Please Select Anyone");
        System.out.println("1.Division Calculator\n2.User Profile\n3.IngredientListParser\n4.TemperatureConverter\n5.FilenameParser\n6.SlopeCalculator\n7.Rating input\n8.Game Menu\n9.ImageResizer\n10.ShoppingListFetcher\n11.Drone Low Battery Exception\n12.Color validator\n13.Route Checker\n14.No Wi-Fi Connection\n15.Map Zoom Controller\n16.Email Validator\n17.Coordinate Converter\n18.Video Player Settings\n19.Date Format Validator\n20.Event Scheduler\n21.Age Calculator\n22.Booking Validator\n23.Formatting Example\n24.Leap Year Birthdate Validation\n25.Days Between Dates with Exception");
        int option=sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Welcome to Division Caluclator!....");
                System.out.println("Enter the dividend value");
                int d=sc.nextInt();
                System.out.println("Enter the divisor value");
                int d2=sc.nextInt();
                DivisionCalculator divisionCalculator=new DivisionCalculator(d,d2);
                int result=divisionCalculator.divison();
                if(result==-1){
                    System.out.println("Zero cannot be divided");
                }
                else{
                    System.out.println("The Value is "+result);
                }
                break;
            case 2:
                System.out.println("Welcome to User Profile!...");
                System.out.println("Enter your Name");
                String name=sc.next();
                UserProfile userProfile=new UserProfile(name);
                userProfile.profile();
                break;
            case 3:
                System.out.println("Welcome to IngredientListParser ");
                System.out.println("Enter the index value to access the Ingredient");
                int index=sc.nextInt();
                IngredientListParser ingredientListParser=new IngredientListParser(index);
                ingredientListParser.ingredientlist();
                break;
            case 4:
                System.out.println("Welcome to Temperature Converter ");
                System.out.println("Enter the Tempeture");
                String temp=sc.next();
                TemperatureConverter temperatureConverter=new TemperatureConverter(temp);
                temperatureConverter.convertingtemp();
                break;
            case 5:System.out.println("Welcome to FilenameParser ");
                sc.nextLine();
                System.out.println("Enter the file with extension");
                String file=sc.nextLine();
                FilenameParser filenameParser=new FilenameParser(file);
                filenameParser.extractExtension();
                break;
            case 6:
                System.out.println("Welcome to the SlopeCalculator");
                System.out.println("Enter the x1 and y1 value");
                int x1=sc.nextInt();
                int y1=sc.nextInt();
                System.out.println("Enter the x2 and y2 value");
                int x2=sc.nextInt();
                int y2=sc.nextInt();
                SlopeCalculator slopeCalculator=new SlopeCalculator(x1,y1,x2,y2);
                slopeCalculator.calculateSlope();
                break;
            case 7:
                System.out.println("Welcome to the Rating");
                System.out.println("Enter your Rating");
                double rate=sc.nextDouble();
                Rating rating=new Rating(rate);
                rating.userrating();
                break;
            case 8:GameMenu gameMenu=new GameMenu();
                   gameMenu.showMenu();
                   break;
            case 9:
                System.out.println("Welcome to the Image Resizer");
                System.out.println("Enter the width of the image");
                int width= sc.nextInt();
                System.out.println("Enter the Height of the image");
                int height=sc.nextInt();
                ImageResizer imageResizer=new ImageResizer(width,height);
                imageResizer.resize();
                break;
            case 10:
                System.out.println("Welcome to the Shopping List Fetcher");
                System.out.println("Enter the Index value to fetch it");
                int ind=sc.nextInt();
                ShoppingListFetcher shoppingListFetcher=new ShoppingListFetcher(ind);
                shoppingListFetcher.fetchItem();
                break;
            case 11:
                System.out.println("Welcome to the Drone Low Battery Exception");
                System.out.println("Enter the Battery value");
                int charge=sc.nextInt();
                Drone drone=new Drone(charge);
                drone.checkbattery();
                break;
            case 12:
                System.out.println("Welcome to the Color validator");
                System.out.println("Enter the color code");
                String code=sc.next();
                ColorValidator colorValidator=new ColorValidator(code);
                colorValidator.validate();
                break;
            case 13:
                System.out.println("Welcome to the RouteChecker");
                System.out.println("Enter the source");
                String source=sc.next();
                System.out.println("Enter the destination");
                String destination=sc.next();
                RouteChecker routeChecker=new RouteChecker(source,destination);
                routeChecker.findRoute();
                break;
            case 14:
                System.out.println("Welcome to the No Wi-Fi Connection");
                System.out.println("Enter the Device name");
                String devicename=sc.next();
                System.out.println("Enter is that device connected or not Enter true for on false for off");
                boolean isconnected=sc.nextBoolean();
                IoTDevice ioTDevice=new IoTDevice(devicename,isconnected);
                ioTDevice.checkConnection();
                break;
            case 15:
                System.out.println("Welcome to the Map Zoom Controller");
                System.out.println("Enter the zoom level:");
                int zoom = sc.nextInt();
                MapZoomController controller = new MapZoomController(zoom);
                controller.applyZoom();
                break;
            case 16:
                System.out.println("Welcome to Email Validator");
                sc.nextLine();
                System.out.println("Enter your email:");
                String email = sc.nextLine();
                EmailValidator validator = new EmailValidator(email);
                validator.validateEmail();
                break;
            case 17:
                System.out.println("Welcome to Coordinate Converter");
                sc.nextLine();
                System.out.println("Enter X coordinate:");
                String xStr = sc.nextLine();
                System.out.println("Enter Y coordinate:");
                String yStr = sc.nextLine();
                CoordinateConverter converter = new CoordinateConverter(xStr, yStr);
                converter.convert();
                break;
            case 18:
                System.out.println("Welcome to Video Player Settings");
                sc.nextLine();
                System.out.println("Enter device type (mobile/laptop):");
                String deviceType = sc.nextLine();
                System.out.println("Enter resolution(720p/1080p/4K):");
                String resolution = sc.nextLine();
                VideoPlayer videoPlayer = new VideoPlayer(deviceType,resolution);
                videoPlayer.playVideo();
                break;
            case 19:
                System.out.println("Welcome to Date Format Validator");
                sc.nextLine();
                System.out.println("Enter a date (dd-MM-yyyy): ");
                String dateStr = sc.nextLine();
                DateFormatValidator dateValidator = new DateFormatValidator(dateStr);
                dateValidator.validateDate();
                break;
            case 20:
                System.out.println("Welcome to Event Scheduler");
                sc.nextLine();
                System.out.println("Enter Event 1 end time (HH:mm):");
                String end1 = sc.nextLine();
                System.out.println("Enter Event 2 start time (HH:mm):");
                String start2 =sc.nextLine();
                LocalTime event1End =LocalTime.parse(end1);
                LocalTime event2Start =LocalTime.parse(start2);
                EventScheduler scheduler = new EventScheduler(event1End,event2Start);
                scheduler.validateSchedule();
                break;
            case 21:
                System.out.println("Welcome to Age Calculator");
                sc.nextLine();
                System.out.println("Enter your birthdate (yyyy-MM-dd):");
                String birthDateStr = sc.nextLine();
                AgeCalculator ageCalculator = new AgeCalculator(birthDateStr);
                ageCalculator.calculateAge();
                break;
            case 22:
                System.out.println("Welcome to Booking Validator");
                sc.nextLine();
                System.out.println("Enter booking date (yyyy-MM-dd):");
                String bookingDateStr = sc.nextLine();
                BookingValidator bookingValidator = new BookingValidator(bookingDateStr);
                bookingValidator.validateBookingDate();
                break;
            case 23:
                System.out.println("Null Date Formatting Example");
                LocalDate nullDate = null;
                NullDateHandler handler = new NullDateHandler(nullDate);
                handler.formatDate();
                break;
            case 24:
                System.out.println("Leap Year Birthdate Validation");
                System.out.println("Enter the birthdate in dd-MM-yyyy format:");
                String dateInput = sc.next();
                LeapYearBirthdateValidator leapYearBirthdateValidator = new LeapYearBirthdateValidator(dateInput);
                leapYearBirthdateValidator.validate();
                break;
            case 25:
                System.out.println("Calculate Days Between Dates");
                System.out.println("Enter start date (dd-MM-yyyy):");
                sc.nextLine();
                String start = sc.nextLine();
                System.out.println("Enter end date (dd-MM-yyyy):");
                String end = sc.nextLine();
                DateDifferenceCalculator calculator = new DateDifferenceCalculator(start, end);
                calculator.calculateDifference();
                break;
            default:
                System.out.println("Invalid Option!..");
                break;

        }


    }
}
