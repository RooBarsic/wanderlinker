package com.wanderlinker.wanderlinker.covid;

import java.util.List;
import java.util.Optional;

public interface CountriesDao {

    Optional<Country> getCountryById(int id);
    Optional<Country> getCountryByName(String countryName);
    Optional<Country> getCountryByCapital(String capitalName);
    Optional<Country> getCountryByISO2(String ISO2Code);
    Optional<Country> getCountryByISO3(String ISO3Code);
    List<Country> getAllCountries();
}
