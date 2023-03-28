package com.example.TestingApi.controller;

import com.example.TestingApi.Entity.TestApiEntity;
import com.example.TestingApi.Service.TestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestApiController {
    @Autowired
   TestApiService testApiService;
        @GetMapping("/getData")
        public List<TestApiEntity> getData()
        {
            return testApiService.getTestData();
        }
        @PostMapping("/putData")
        public TestApiEntity putData(@RequestBody TestApiEntity testApiEntity)
        {
            return testApiService.postTestData(testApiEntity);
        }
    }



