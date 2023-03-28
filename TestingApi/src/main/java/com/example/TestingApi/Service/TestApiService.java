package com.example.TestingApi.Service;

import com.example.TestingApi.Entity.TestApiEntity;
import com.example.TestingApi.Repository.TestApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class TestApiService {
    @Autowired
TestApiRepository testApiRepository;
    public List<TestApiEntity> getTestData()
    {
        return testApiRepository.findAll();
    }

    public TestApiEntity postTestData(TestApiEntity testApiEntity)
    {
        return testApiRepository.save(testApiEntity);
    }
}
