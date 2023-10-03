package com.testing.loginsystem.service.impl;

import com.testing.loginsystem.datamodel.request.LoginRepository;
import com.testing.loginsystem.datamodel.request.UserDetails;
import com.testing.loginsystem.service.ValidateUserDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Slf4j
public class ValidateUserDetailsImpl implements ValidateUserDetails {

    @Autowired
    private LoginRepository repo;

    @Override
    public String getResponse(String userName, String password) {

        UserDetails userDetails = repo.find(userName);

        if (userDetails!= null) {
            String pwd = userDetails.getPassword();
            if (pwd.equals(password)) {
                return ("Login Success");
            } else {
                return ("Wrong password");
            }
        } else {
            return ("Username does not exist");
        }
    }
}