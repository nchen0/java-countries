package com.lambda.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")
public class PopulationController {
    @RequestMapping("/size")
    public ArrayList getCountryByLetter(@RequestParam(value="people") int people) {
        return CountriesApplication.countriesList.findCountries(c -> (c.getPopulation() > people));
    }

    @RequestMapping("/min")
    public Country getSmallest() {
        return CountriesApplication.countriesList.findCountry(c -> (c.getPopulation() == CountriesApplication.countriesList.getSmallestPopulation()));
    }

    @RequestMapping("/max")
    public Country getLargest() {
        return CountriesApplication.countriesList.findCountry(c -> (c.getPopulation() == CountriesApplication.countriesList.getLargestPopulation()));
    }

}
