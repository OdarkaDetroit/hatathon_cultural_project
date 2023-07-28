package com.example.hatathon_backend.repository;

import com.example.hatathon_backend.model.City;
import com.example.hatathon_backend.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
