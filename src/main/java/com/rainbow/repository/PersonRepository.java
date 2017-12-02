package com.rainbow.repository;

import com.rainbow.domain.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by lailai on 2017/12/1.
 */
public interface PersonRepository extends ElasticsearchRepository<Person,Long>{

}
