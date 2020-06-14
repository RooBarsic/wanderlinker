package com.wanderlinker.wanderlinker.covid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class CountriesDaoImp implements CountriesDao {

    private static final String SQL_GET_COUNTRY_BY_ID = "select * from countries where id = :id";
    private static final String SQL_GET_COUNTRY_BY_NAME = "select * from countries where name = :name";
    private static final String SQL_GET_COUNTRY_BY_CAPITAL = "select * from countries where capital = :capital";
    private static final String SQL_GET_COUNTRY_BY_ISO2 = "select * from countries where iso2 = :iso2";
    private static final String SQL_GET_COUNTRY_BY_ISO3 = "select * from countries where iso3 = :iso3";
    private static final String SQL_GET_ALL_COUNTRIES = "select * from countries";

    private NamedParameterJdbcTemplate jdbcTemplate;
    private CountryMapper countryMapper;

    @Autowired
    public CountriesDaoImp(NamedParameterJdbcTemplate jdbcTemplate, CountryMapper countryMapper){
        this.jdbcTemplate = jdbcTemplate;
        this.countryMapper = countryMapper;
    }

    @Override
    public Optional<Country> getCountryById(int id) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        try {
            return Optional.ofNullable(
                    jdbcTemplate.queryForObject(
                            SQL_GET_COUNTRY_BY_ID,
                            params,
                            countryMapper
                    )
            );
        } catch (EmptyResultDataAccessException e){
            return Optional.empty();
        } catch (Exception e){
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<Country> getCountryByName(String countryName) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", countryName);
        try {
            return Optional.ofNullable(
                    jdbcTemplate.queryForObject(
                            SQL_GET_COUNTRY_BY_NAME,
                            params,
                            countryMapper
                    )
            );
        } catch (EmptyResultDataAccessException e){
            return Optional.empty();
        } catch (Exception e){
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<Country> getCountryByCapital(String capitalName) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("capital", capitalName);
        try {
            return Optional.ofNullable(
                    jdbcTemplate.queryForObject(
                            SQL_GET_COUNTRY_BY_CAPITAL,
                            params,
                            countryMapper
                    )
            );
        } catch (EmptyResultDataAccessException e){
            return Optional.empty();
        } catch (Exception e){
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<Country> getCountryByISO2(String ISO2Code) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("iso2", ISO2Code);
        try {
            return Optional.ofNullable(
                    jdbcTemplate.queryForObject(
                            SQL_GET_COUNTRY_BY_ISO2,
                            params,
                            countryMapper
                    )
            );
        } catch (EmptyResultDataAccessException e){
            return Optional.empty();
        } catch (Exception e){
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<Country> getCountryByISO3(String ISO3Code) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("iso3", ISO3Code);
        try {
            return Optional.ofNullable(
                    jdbcTemplate.queryForObject(
                            SQL_GET_COUNTRY_BY_ISO3,
                            params,
                            countryMapper
                    )
            );
        } catch (EmptyResultDataAccessException e){
            return Optional.empty();
        } catch (Exception e){
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public List<Country> getAllCountries() {
        try {
            return jdbcTemplate.query(SQL_GET_ALL_COUNTRIES, countryMapper);
        } catch (EmptyResultDataAccessException e){
            return Collections.emptyList();
        } catch (Exception e){
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
