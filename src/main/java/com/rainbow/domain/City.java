package com.rainbow.domain;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * Created by lailai on 2017/12/1.
 */
@Document(indexName = "province",type = "city")
public class City implements Serializable{

    private static final Long serializableID=-1L;

    private Long id;

    private String name;

    private String description;

    private Integer score;

    public City(Long id, String name, String description, Integer score) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.score = score;
    }

    public City() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
