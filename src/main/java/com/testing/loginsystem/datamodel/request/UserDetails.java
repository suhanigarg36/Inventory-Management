package com.testing.loginsystem.datamodel.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "user_details")
@NoArgsConstructor
@Entity
public class UserDetails {
    @Id
    @JsonProperty(value = "userName")
    private String userName;
    private String password;
    private String name;
    private String email;
    private String phone_no;
    private String user_role;

}

