package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        System.out.println("Inside main");
        System.out.println();

        testGetAllCountries();
    }

    private static void testGetAllCountries() {

        System.out.println("Start");
        System.out.println();

        List<Country> countries = countryService.getAllCountries();

        System.out.println("countries=" + countries);
        System.out.println();

        System.out.println("End");
    }
}