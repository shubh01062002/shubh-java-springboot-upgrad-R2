package com.upGrad.interview.Service.Impl;

import com.upGrad.interview.Dto.CountryDto;
import com.upGrad.interview.Entity.Country;
import com.upGrad.interview.Repository.CountryRepository;
import com.upGrad.interview.Service.CountryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    private final ModelMapper modelMapper;
    @Override
    public ResponseEntity<Country> addCountry(CountryDto countryDto) {

        Country country = modelMapper.map(countryDto, Country.class);
        Country save = countryRepository.save(country);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }
}
