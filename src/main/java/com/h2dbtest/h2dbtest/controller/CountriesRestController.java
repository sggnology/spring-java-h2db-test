package com.h2dbtest.h2dbtest.controller;

import com.h2dbtest.h2dbtest.model.Countries;
import com.h2dbtest.h2dbtest.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api/countries")
public class CountriesRestController {

    @Autowired
    private CountriesService countriesService;

    @GetMapping("/save")
    @Transactional
    public Countries saveCountry(@RequestParam String name){
        return countriesService.saveCountry(
            name
        );
    }
}
