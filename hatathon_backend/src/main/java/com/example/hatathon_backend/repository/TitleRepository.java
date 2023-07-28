package com.example.hatathon_backend.repository;

import com.example.hatathon_backend.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TitleRepository extends JpaRepository<Title, Long> {

}
