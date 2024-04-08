package com.upGrad.interview.Controllers;

import com.upGrad.interview.Dto.CountryDto;
import com.upGrad.interview.Entity.Country;
import com.upGrad.interview.Service.CountryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/api/v1/country")


public class CountryController {

    private final CountryService countryService;

    @PostMapping
    public ResponseEntity<Country> addCountry(@RequestBody CountryDto country){
      return   countryService.addCountry(country);
    }

}
