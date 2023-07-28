package com.example.hatathon_backend.repository;

import com.example.hatathon_backend.model.PhotoReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PhotoReferenceRepository extends JpaRepository<PhotoReference, Long> {

}
