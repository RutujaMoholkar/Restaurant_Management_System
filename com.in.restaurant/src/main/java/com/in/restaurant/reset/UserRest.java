package com.in.restaurant.reset;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/*One cls we have multiple api's..this will bifurgate that from here we want
to move to these classes
 */
@RequestMapping(path = "/user")
public interface UserRest {

    // we accepting value(key value pair)in body
    @PostMapping(path = "/signup")
    public ResponseEntity<String> signup(@RequestBody(required = true) Map<String, String> requestMap);

}
