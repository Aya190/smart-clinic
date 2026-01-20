package org.example.smartclinic.Controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
@Scope("prototype")
@Component("user")
public class userController {
    @id
    String id;

    String first_name;
    String last_name;
    String email;
    String address;
    int age;
    userController(){
        //the user info comes from the db that we will create inshalla
    }
}