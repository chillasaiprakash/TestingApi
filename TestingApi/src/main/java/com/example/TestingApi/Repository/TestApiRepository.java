package com.example.TestingApi.Repository;

import com.example.TestingApi.DTO.TestApiDto;
import com.example.TestingApi.Entity.TestApiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestApiRepository extends JpaRepository<TestApiEntity,Long>  {
}
