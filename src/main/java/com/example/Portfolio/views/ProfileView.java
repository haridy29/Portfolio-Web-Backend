package com.example.Portfolio.views;


import org.springframework.beans.factory.annotation.Value;

public interface ProfileView {
    @Value("#{target.firstName+' '+ target.lastName}")
    String getFullName();

    String getFirstName();

    String getLastName();


    String getEmail();

    String getPhone();

    String getAddress();


}
