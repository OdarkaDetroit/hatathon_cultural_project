package com.example.hatathon_backend.repository;

import com.example.hatathon_backend.model.Address;
import com.example.hatathon_backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
