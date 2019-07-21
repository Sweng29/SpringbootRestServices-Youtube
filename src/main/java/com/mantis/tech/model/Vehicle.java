package com.mantis.tech.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    private Long vehicleId;
    private String vehicleModel;
    private String modelYear;
    private Integer engineCapacity;
    // We are skipping this model as Manufacture itself will be an entity
    //private String manufacturerN

    private Integer noOfTires;
    private Integer noOfSeats;
    private Float laddenWeight;
    private Float unlaidenWeight;


}
