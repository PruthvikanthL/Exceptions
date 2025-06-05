package com.rcb.resturent.service;

import com.rcb.resturent.dto.RCBResturentDto;
import com.rcb.resturent.exception.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class RCBResturentServiceImplementation implements RCBResturentService{
    @Override
    public boolean Validation(RCBResturentDto rcbResturentDto) {
       try{
           String name=rcbResturentDto.getName();
           if(name==null){
               throw new NullPointerException();
           } else if (name.length()<3||name.length()>25) {
               throw new NameLengthSizeCheckException("Name length must be between above 3 and below 25 charcters");

           } else if (name.matches("^[0-9].*")) {
               throw new NameContatainsNumbersException("Name Starts with a number");

           }
           System.out.println("Name is valid:"+name);
       }
       catch (NullPointerException|NameLengthSizeCheckException|NameContatainsNumbersException e){
            System.out.println("Name is not Valid -->  "+e.getMessage());
        }

        int rating= rcbResturentDto.getRating();
       try{
           if(rating<3){
               throw new LowRatingException("Rating should be Greater then 3");
           }
           System.out.println("Rating is valid "+rating);
       }
       catch (LowRatingException e){
           System.out.println("Rating is not Valid -->  "+e.getMessage());
       }
            try{
                String[] menu=rcbResturentDto.getFoodmenu();
                if(menu==null){
                    throw new NullPointerException("Food menu cannot be null");
                    }
                    for(int i=0;i< menu.length;i++){
                    System.out.println("Menu item:"+menu[i]);
                }
            }
            catch (ArrayIndexOutOfBoundsException|NullPointerException e){
             System.out.println("Arrya Issue  -->  "+e.getMessage());
            }
            try{
                LocalTime openingTime=rcbResturentDto.getOpeningTime();
                LocalTime minAllowedTime=LocalTime.of(9,0);
                if(openingTime.isBefore(minAllowedTime)){
                throw new InvalidOpeningTimeException("Opening time must not be before 9:00 AM");
                }
                System.out.println("Opening Time is valid "+openingTime);
                }
                catch (InvalidOpeningTimeException e){
                System.out.println("Invalid Opeining Time  -->  "+e.getMessage());
           }
         try{
             LocalTime closingTime=rcbResturentDto.getClosingTime();
             LocalTime maxAllowedTime=LocalTime.of(12,0);
            if(closingTime.isAfter(maxAllowedTime)){
             throw new InvalidClosingTimeException("Closing Time must not be before 12:0PM");
            }
             System.out.println("Closing time is valid "+closingTime);
         }
          catch (InvalidClosingTimeException e){
            System.out.println("Invalid Closing Time -->  "+e.getMessage());
         }
         try{
             LocalDate bookingdate=rcbResturentDto.getBookedDate();
             LocalDate today=LocalDate.now();
             if(bookingdate.isBefore(today)){
                 throw new InvalidBookingDateException("Booking Date Cannot be a past Date");

             }
             System.out.println("Booking Date is valid "+ bookingdate);

         }
         catch (InvalidBookingDateException e){
             System.out.println("Invalid Booking Date -->  "+e.getMessage());
         }
         try{
             LocalTime bookingtime=rcbResturentDto.getBookedTime();
             LocalTime minTimeAllowed=LocalTime.of(9,0);
             LocalTime closingTime=rcbResturentDto.getClosingTime();
             LocalTime maxTimeAllowed=LocalTime.of(12,0);
             if(bookingtime.isBefore(minTimeAllowed)&&closingTime.isAfter(maxTimeAllowed)){
                 throw new InvalidOpeningClosingException("Booking Time is Before 9 AM and After 12 PM");

             }
             System.out.println("Booking Time is valid" +bookingtime);
         }
         catch (InvalidOpeningClosingException e){
             System.out.println("Invalid Booking and closing Time -->  "+e.getMessage());
         }
     return true;
    }
}
