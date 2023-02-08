package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping(value="/country")
public class CountryController {

    @Autowired
    CountryRepository cr;

    @GetMapping("/getCountries")
    public List<Country> getCountries(){
        List<Country> countries = cr.findAll();
        for(Country c: countries){
            System.out.println(c.getName());
        }
        return countries;
    }

}
