package com.example.hatathon_backend.repository;

import com.example.hatathon_backend.model.Category;
import com.example.hatathon_backend.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
