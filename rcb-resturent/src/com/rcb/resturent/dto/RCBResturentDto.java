package com.rcb.resturent.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RCBResturentDto {
    private String name;
    private String address;
    private String contactdetails;
    private String email;
    private int rating;
    private String[] foodmenu;
    private String type;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private LocalDate bookedDate;
    private LocalTime bookedTime;
}
