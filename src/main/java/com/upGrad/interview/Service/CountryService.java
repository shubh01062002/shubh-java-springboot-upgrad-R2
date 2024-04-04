package com.upGrad.interview.Service;

import com.upGrad.interview.Dto.CountryDto;
import com.upGrad.interview.Entity.Country;
import org.springframework.http.ResponseEntity;

public interface CountryService {
    ResponseEntity<Country> addCountry(CountryDto countryDto);
}
