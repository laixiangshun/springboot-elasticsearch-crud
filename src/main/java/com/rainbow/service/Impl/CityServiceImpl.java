package com.rainbow.service.Impl;

import com.rainbow.domain.City;
import com.rainbow.repository.CityRepository;
import com.rainbow.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lailai on 2017/12/1.
 */
@Service
public class CityServiceImpl implements CityService{

    private static final Logger logger= LoggerFactory.getLogger(CityServiceImpl.class);

    private static final Integer pageNumber=0;
    private static final Integer pageSize=10;
    Pageable pageable=new PageRequest(pageNumber,pageSize);

    @Autowired
    private CityRepository cityRepository;

    @Override
    public Long saveCity(City city) {
       City cityresult=cityRepository.save(city);
        return cityresult.getId();
    }

    @Override
    public List<City> findByDescriptionAndScore(String description, Integer score) {
       return cityRepository.findByDescriptionAndScore(description,score);
    }

    @Override
    public List<City> findByDescriptionOrScore(String description, Integer score) {
        return cityRepository.findByDescriptionOrScore(description,score);
    }

    @Override
    public List<City> findByDescription(String description) {
        return cityRepository.findByDescription(description,pageable).getContent();
    }

    @Override
    public List<City> findByDescriptionNot(String description) {
       return cityRepository.findByDescriptionNot(description,pageable).getContent();
    }

    @Override
    public List<City> findByDescriptionLike(String description) {

        return cityRepository.findByDescriptionLike(description,pageable).getContent();
    }
}
