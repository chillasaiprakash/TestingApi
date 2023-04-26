package com.example.TestingApi.controller;

import com.example.TestingApi.Entity.TestApiEntity;
import com.example.TestingApi.Service.TestApiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@RestController
@Api(value = "TestingApi call to get and put the data")
public class TestApiController {

    @Autowired
    TestApiService testApiService;

    @GetMapping("/getData")
    @ApiOperation(value = "Get all users ", response = TestApiEntity.class)

    public List<TestApiEntity> getData() {
        return testApiService.getTestData();
    }

    @PostMapping("/putData")
    @ApiOperation(value = "Api that Saves users ", response = TestApiEntity.class)
    public TestApiEntity putData(@RequestBody TestApiEntity testApiEntity) throws SQLException {


        try {
            return testApiService.postTestData(testApiEntity);
        } catch (SQLException ex) {
            System.out.println("An SQL exception occurred: " + ex.getMessage());

        }
       return testApiEntity;
    }
}







