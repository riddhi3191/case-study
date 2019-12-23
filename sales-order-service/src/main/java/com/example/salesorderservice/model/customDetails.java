package com.example.salesorderservice.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

//Order Description, Order Date, Customer email id, list of item names
@Data
public class customDetails {
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private String email;

    private List<String> itemNames;

}
