package com.example.demo

import org.springframework.stereotype.Service

@Service
class AdminService (private val countryRepository: CountryRepository){
    fun initMap() {
        val country1 = Country(title = "대한민국")
        val country2 = Country(title = "미국")
        countryRepository.save(country1)
        countryRepository.save(country2)
    }
}