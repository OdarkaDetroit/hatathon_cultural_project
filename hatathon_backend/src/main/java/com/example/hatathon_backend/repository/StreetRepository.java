package com.example.hatathon_backend.repository;

import com.example.hatathon_backend.model.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StreetRepository extends JpaRepository<Street, Long> {

}
