package com.luv2code.ecommerce.dto;

// use this class to send back a Java object as JSON

import lombok.Data;

@Data
public class PurchaseResponse {

    private final String orderTrackingNumber;

}
