package com.lambda.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountriesApplication {

    static CountryList countriesList;
    public static void main(String[] args) {
        countriesList = new CountryList();
        SpringApplication.run(CountriesApplication.class, args);
    }

}
