package com.in.restaurant.resetImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.in.restaurant.constents.RestaurantConstants;
import com.in.restaurant.reset.UserRest;
import com.in.restaurant.service.UserService;
import com.in.restaurant.utils.RestaurantUtils;

@RestController
public class UserResetImpl implements UserRest {

    @Autowired // able to access all method available in user service...actual impl
    UserService userService;

    @Override
    public ResponseEntity<String> signup(Map<String, String> requestMap) {

        try {
            return userService.signUp(requestMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // return new ResponseEntity<String>("{\"message\":\"Something went wrong\"}",
        // HttpStatus.INTERNAL_SERVER_ERROR);
        // instead of wrting above code again and again..we put in utility

        return RestaurantUtils.getResponseEntity(RestaurantConstants.SOMETHING_WENT_WRONG,
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
