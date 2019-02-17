package com.lambda.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class CountryController {
    @RequestMapping("/all")
    public ArrayList<Country> getAllCountries() {
        return CountriesApplication.countriesList.countryList;
    }
}
