package com.rainbow.service;

import com.rainbow.domain.City;

import java.util.List;

/**
 * Created by lailai on 2017/12/1.
 */
public interface CityService {

    Long saveCity(City city);

    List<City> findByDescriptionAndScore(String description,Integer score);

    List<City> findByDescriptionOrScore(String description,Integer score);

    List<City> findByDescription(String description);

    List<City> findByDescriptionNot(String description);

    List<City> findByDescriptionLike(String description);
}
