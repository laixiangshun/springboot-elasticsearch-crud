package com.rainbow.controller;

import com.rainbow.domain.City;
import com.rainbow.domain.Person;
import com.rainbow.repository.PersonRepository;
import com.rainbow.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lailai on 2017/12/1.
 */
@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private PersonRepository personRepository;

    /**
     * 增加
     * @param city
     * @return
     */
    @RequestMapping(value = "/api/city",method = RequestMethod.POST)
    public Long saveCity(@RequestBody City city){
        return cityService.saveCity(city);
    }

    /**
     * AND
     * @param description
     * @param score
     * @return
     */
    @RequestMapping(value = "/api/city/and/find",method = RequestMethod.GET)
    public List<City> findByDescriptionAndScore(@RequestParam(value = "description") String description,
                                                @RequestParam(value = "score") Integer score){
        return cityService.findByDescriptionAndScore(description, score);
    }

    /**
     * OR
     * @param description
     * @param score
     * @return
     */
    @RequestMapping(value = "/api/city/or/find",method = RequestMethod.GET)
    public List<City> findByDescriptionOrScore(@RequestParam(value = "description") String description,
                                               @RequestParam(value = "score") Integer score){
        return cityService.findByDescriptionOrScore(description, score);
    }

    /**
     * 查询城市描述
     *
     * @param description
     * @return
     */
    @RequestMapping(value = "/api/city/description/find", method = RequestMethod.GET)
    public List<City> findByDescription(@RequestParam(value = "description") String description) {
        return cityService.findByDescription(description);
    }

    /**
     * NOT 语句查询
     *
     * @param description
     * @return
     */
    @RequestMapping(value = "/api/city/description/not/find", method = RequestMethod.GET)
    public List<City> findByDescriptionNot(@RequestParam(value = "description") String description) {
        return cityService.findByDescriptionNot(description);
    }

    /**
     * LIKE 语句查询
     *
     * @param description
     * @return
     */
    @RequestMapping(value = "/api/city/like/find", method = RequestMethod.GET)
    public List<City> findByDescriptionLike(@RequestParam(value = "description") String description) {
        return cityService.findByDescriptionLike(description);
    }

    @RequestMapping(value = "/api/person/save",method = RequestMethod.POST)
    public Long savePerson(@RequestBody Person person){
        return personRepository.save(person).getId();
    }
}
