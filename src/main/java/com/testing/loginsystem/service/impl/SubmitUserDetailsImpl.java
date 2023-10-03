package com.testing.loginsystem.service.impl;
import com.testing.loginsystem.datamodel.request.LoginRepository;
import com.testing.loginsystem.datamodel.request.UserDetails;
import com.testing.loginsystem.service.SubmitUserDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SubmitUserDetailsImpl implements SubmitUserDetails {
    @Autowired
    private LoginRepository repo;
    public String getDetails(UserDetails userDetails){
        if(userDetails.getUserName().isEmpty()) {
            return "UserName Can't be Empty";
        }
        repo.insert(userDetails);
        return ("Registered successfully");
    }
}
