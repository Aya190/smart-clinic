package org.example.smartclinic.model;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Controller
@Data
@Scope("prototype")
@Component("user")
public class userModel {
    @id
    String id;

    String first_name;
    String last_name;
    String email;
    String address;
    int age;

    userModel() {
        //the user info comes from the db that we will create inshalla
    }
}