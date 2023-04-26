package com.example.TestingApi.Service;

import com.example.TestingApi.Entity.TestApiEntity;
import com.example.TestingApi.Repository.TestApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;
import java.util.List;

@Service
public class TestApiService {
    @Autowired
TestApiRepository testApiRepository;
    public List<TestApiEntity> getTestData()
    {
        return testApiRepository.findAll();
    }
    @Retryable(retryFor = SQLException.class, maxAttempts = 3, backoff = @Backoff(delay = 100))
    public TestApiEntity postTestData(TestApiEntity testApiEntity) throws SQLException
    {
        return testApiRepository.save(testApiEntity);
    }
}
