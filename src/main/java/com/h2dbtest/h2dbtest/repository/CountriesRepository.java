package com.h2dbtest.h2dbtest.repository;

import com.h2dbtest.h2dbtest.model.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Long> {
}
