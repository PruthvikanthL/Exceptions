package com.rcb.resturent.runner;

import com.rcb.resturent.dto.RCBResturentDto;
import com.rcb.resturent.service.RCBResturentService;
import com.rcb.resturent.service.RCBResturentServiceImplementation;

import java.time.LocalDate;
import java.time.LocalTime;

public class RCBResturentRunner {
    public static void main(String[] args) {
        String name="RCBJOY";
        String location="Bengluru";
        String conctactdetails="11th Block BTM Benglore";
        String email="rcb@gmail.com";
        int rating=4;
        String[] foodmenu={"sandwitch","Gobi"};
        String type="veg";
        LocalTime openingtime=LocalTime.of(11,0);
        LocalTime closingtime=LocalTime.of(11,30);
        LocalDate bookeddate=LocalDate.of(2025,6,7);
        LocalTime bookedTime=LocalTime.of(10,0);
        RCBResturentDto rcbResturentDto=new RCBResturentDto();
        rcbResturentDto.setName(name);
        rcbResturentDto.setAddress(location);
        rcbResturentDto.setContactdetails(conctactdetails);
        rcbResturentDto.setEmail(email);
        rcbResturentDto.setRating(rating);
        rcbResturentDto.setFoodmenu(foodmenu);
        rcbResturentDto.setType(type);
        rcbResturentDto.setOpeningTime(openingtime);
        rcbResturentDto.setClosingTime(closingtime);
        rcbResturentDto.setBookedDate(bookeddate);
        rcbResturentDto.setBookedTime(bookedTime);

        RCBResturentService service = new RCBResturentServiceImplementation();
        service.Validation(rcbResturentDto);

    }
}
