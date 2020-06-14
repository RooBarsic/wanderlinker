package com.wanderlinker.wanderlinker.rest.controllers;

import com.wanderlinker.wanderlinker.covid.Country;
import com.wanderlinker.wanderlinker.covid.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/countries", produces = MediaType.APPLICATION_JSON_VALUE)
public class CountriesRestController {
    private final CountryService countryService;

    @Autowired
    CountriesRestController(CountryService countryService){
        this.countryService = countryService;
    }

    @GetMapping(value = "/getCountry")
    public Country getCountry(@RequestParam(value = "id", required = false) Integer countryId,
                              @RequestParam(value = "name", required = false) String countryName,
                              @RequestParam(value = "capital", required = false) String countryCapital,
                              @RequestParam(value = "iso2", required = false) String countryISO2Code,
                              @RequestParam(value = "iso3", required = false) String countryISO3Code
    ){
        if(countryId != null){
            return countryService.getCountryById(countryId);
        }
        else if(countryName != null){
            return countryService.getCountryByName(countryName);
        }
        else if(countryCapital != null){
            return countryService.getCountryByCapital(countryCapital);
        }
        else if(countryISO2Code != null){
            return countryService.getCountryByISO2(countryISO2Code);
        }
        else if(countryISO3Code != null){
            return countryService.getCountryByISO3(countryISO3Code);
        }
        return null;
    }

    @GetMapping(value = "/all")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }
}
