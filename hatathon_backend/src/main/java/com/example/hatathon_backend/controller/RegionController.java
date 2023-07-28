package com.example.hatathon_backend.controller;

import com.example.hatathon_backend.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/region")
public class RegionController {

    @Autowired
    RegionRepository regionRepository;

    @GetMapping("/all")
    public ResponseEntity<?> getAllRegions() {
        return ResponseEntity.ok(List.of("Region1","Region2","Region3"));
//        return ResponseEntity.ok(regionRepository.findAll());
    }
}
