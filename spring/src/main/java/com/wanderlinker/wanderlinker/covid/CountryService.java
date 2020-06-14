package com.wanderlinker.wanderlinker.covid;


import java.util.List;

public interface CountryService {
    Country getCountryById(int id);
    Country getCountryByName(String countryName);
    Country getCountryByCapital(String capitalName);
    Country getCountryByISO2(String ISO2Code);
    Country getCountryByISO3(String ISO3Code);
    List<Country> getAllCountries();



}
