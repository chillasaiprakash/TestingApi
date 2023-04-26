package com.example.TestingApi.Entity;


import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;

@Table
@Entity
public class TestApiEntity {
    public String firstName;
    public String lastTime;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Double id;

    @Override
    public String toString() {
        return "TestApiDto{" +
                "firstName='" + firstName + '\'' +
                ", lastTime='" + lastTime + '\'' +
                ", id=" + id +
                '}';
    }

    public TestApiEntity() {
    }

    public TestApiEntity(String firstName, String lastTime, Double id) {
        this.firstName = firstName;
        this.lastTime = lastTime;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }


}

