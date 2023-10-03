package com.testing.loginsystem.binding.impl;

import com.testing.loginsystem.binding.Controller;
import com.testing.loginsystem.datamodel.request.Product;
import com.testing.loginsystem.datamodel.request.ProductsRepository;
import com.testing.loginsystem.datamodel.request.UserDetails;
import com.testing.loginsystem.service.AddProducts;
import com.testing.loginsystem.service.GetProductsList;
import com.testing.loginsystem.service.SubmitUserDetails;
import com.testing.loginsystem.service.ValidateUserDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@RestController
@CrossOrigin(origins = "*")
@Slf4j
public class ControllerImpl implements Controller {
    @Autowired
    ValidateUserDetails validateUserDetails;

    @Autowired
    SubmitUserDetails submitUserDetails;

    @Autowired
    GetProductsList getProductsList;

    @Autowired
    AddProducts addProducts;

    @Autowired
    private ProductsRepository productsrepo;

    @Override
    public String getLoginDto(@RequestBody UserDetails userDetails){
        String message = null;
        try {
            message = validateUserDetails.getResponse(userDetails.getUserName(), userDetails.getPassword());
        } catch (Exception e){
            log.error("",e);
            message = e.toString();
        }
        return message;
    }

    @Override
    public ResponseEntity<String> registerUser(@RequestBody UserDetails userDetails){
        String message = null;
        try{
            message = submitUserDetails.getDetails(userDetails);
            if(Objects.equals(message, "UserName Can't be Empty")){
                return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<>(message, HttpStatus.OK);
        } catch (Exception e) {
            log.error("", e);
            message = e.toString();
            return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @Override
    public List<Product> getProductsList(){
        List<Product> productList = new ArrayList<>();
        try{
            productList = productsrepo.findAll();
        } catch (Exception e) {
            log.error("", e);
        }
        log.info("ProductList: {}", productList);
        return productList;

    }


    @Override
    public String saveProducts(@RequestBody Product productsList){
        String message = null;
        try{
            message = addProducts.getProducts(productsList);
        } catch (Exception e) {
            log.error("", e);
            message = e.toString();
        }

        return message;
    }
}
