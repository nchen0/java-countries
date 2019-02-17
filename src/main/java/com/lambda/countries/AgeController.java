package com.lambda.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/age")
public class AgeController {
    @RequestMapping("/age")
    public ArrayList getCountryByLetter(@RequestParam(value="age") int age) {
        return CountriesApplication.countriesList.findCountries(c -> (c.getMedian_age() > age));
    }

    @RequestMapping("/min")
    public Country getSmallest() {
        return CountriesApplication.countriesList.findCountry(c -> (c.getMedian_age() == CountriesApplication.countriesList.getSmallestParams("Age")));
    }

    @RequestMapping("/max")
    public Country getLargest() {
        return CountriesApplication.countriesList.findCountry(c -> (c.getMedian_age() == CountriesApplication.countriesList.getLargestAge()));
    }
}
