package com.wanderlinker.wanderlinker.covid;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CountryMapper implements RowMapper<Country> {

    @Override
    public Country mapRow(ResultSet rs, int i) throws SQLException {
        Country country = new Country();
        country.setId(rs.getInt("id"));
        country.setName(rs.getString("name"));
        country.setOfficialName(rs.getString("officialName"));
        country.setCapital(rs.getString("capital"));
        country.setISO2(rs.getString("iso2"));
        country.setISO3(rs.getString("iso3"));
        country.setCurrencyName(rs.getString("currencyName"));

        country.setTotalConfirmed(rs.getInt("totalConfirmed"));
        country.setTotalDeaths(rs.getInt("totalDeaths"));
        country.setTotalRecovered(rs.getInt("totalRecovered"));
        country.setTotalActive(rs.getInt("totalActive"));
        country.setLastUpdate(rs.getDate("lastUpdate"));
        return country;
    }
}
