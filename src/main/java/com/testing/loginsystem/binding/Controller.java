package com.testing.loginsystem.binding;

import com.testing.loginsystem.datamodel.request.Product;
import com.testing.loginsystem.datamodel.request.UserDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestControllerAdvice
public interface Controller {

    @PostMapping(value = "/validateUser")
    @CrossOrigin
    String getLoginDto(@RequestBody UserDetails userDetails);
    @CrossOrigin
    @PostMapping(value = "/submitUser")
    ResponseEntity<String> registerUser(@RequestBody UserDetails userDetails);

    @CrossOrigin
    @GetMapping(value = "/getProducts")
    List<Product> getProductsList();

    @CrossOrigin
    @PostMapping(value = "/saveProductDetails")
    String saveProducts(@RequestBody Product productsList);

}




