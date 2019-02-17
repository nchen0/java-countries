package com.lambda.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class CountryController {
    @RequestMapping("/all")
    public ArrayList<Country> getAllCountries() {
        return CountriesApplication.countriesList.countryList;
    }

    @RequestMapping("/begins")
    public ArrayList getCountryByLetter(@RequestParam(value="letter") char letter) {
        return CountriesApplication.countriesList.findCountries(c -> (c.getName().charAt(0) == letter));
    }

    @RequestMapping("/size")
    public ArrayList getCountryByLength(@RequestParam(value="letters") int letters) {
        CountriesApplication.countriesList.countryList.sort((c1, c2) -> c1.getName().compareToIgnoreCase((c2.getName())));
        return CountriesApplication.countriesList.findCountries(c -> (c.getName().length() == letters));
    }
}
