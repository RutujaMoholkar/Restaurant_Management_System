package com.in.restaurant.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

//utility() -- which is going to generic method which can be used in any service central classes or any classes
public class RestaurantUtils {

    /*
     * so that we can't create object of this one---we can define every method that
     * will be static
     * so that we can directly access with the class name.
     */
    private RestaurantUtils() {

    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus) {
        return new ResponseEntity<String>("{\"message\":\"" + responseMessage + "\"}", httpStatus);
    }

}
