package com.wanderlinker.wanderlinker.covid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class CountryServiceImpl implements CountryService {

    private final CountriesDao countriesDao;

    @Autowired
    CountryServiceImpl(CountriesDao countriesDao){
        this.countriesDao = countriesDao;
    }

    @Override
    public Country getCountryById(int id) {
        return countriesDao
                .getCountryById(id)
                .orElse(null);
    }

    @Override
    public Country getCountryByName(String countryName) {
        return countriesDao
                .getCountryByName(countryName)
                .orElse(null);
    }

    @Override
    public Country getCountryByCapital(String capitalName) {
        return countriesDao
                .getCountryByCapital(capitalName)
                .orElse(null);
    }

    @Override
    public Country getCountryByISO2(String ISO2Code) {
        return countriesDao
                .getCountryByISO2(ISO2Code)
                .orElse(null);
    }

    @Override
    public Country getCountryByISO3(String ISO3Code) {
        return countriesDao
                .getCountryByISO3(ISO3Code)
                .orElse(null);
    }

    @Override
    public List<Country> getAllCountries() {
        return countriesDao.getAllCountries();
    }
}
