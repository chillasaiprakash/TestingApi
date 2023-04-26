package com.example.TestingApi.DTO;



public class TestApiDto {
    public String firstName;
    public String lastTime;
    public Double id;

    @Override
    public String toString() {
        return "TestApiDto{" +
                "firstName='" + firstName + '\'' +
                ", lastTime='" + lastTime + '\'' +
                ", id=" + id +
                '}';
    }

    public TestApiDto(String firstName, String lastTime, Double id) {
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
