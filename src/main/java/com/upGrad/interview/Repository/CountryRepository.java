package com.upGrad.interview.Repository;


import com.upGrad.interview.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
