package com.example.hatathon_backend.controller;

import com.example.hatathon_backend.model.*;
import com.example.hatathon_backend.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/title")
public class TitleController {

    @Autowired
    TitleRepository titleRepository;

    Title test = new Title(1L, "Title","Lorem ipsum",
            new Address(1L, 34, 0,0,
                    new Street(1L, "Street", null,
                            new City(1L,"Kyiv",
                                    new Region(1L, "Kyiv", null), null), null), null), null,
            List.of(new Category(1L,"Category1", null)));

    @GetMapping("/all")
    public ResponseEntity<?> getAllTitles() {
        return ResponseEntity.ok(test);
//        return ResponseEntity.ok(titleRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTitleById(@PathVariable Long id) {
        return ResponseEntity.ok(test);
//        return ResponseEntity.ok(titleRepository.findById(id).orElseThrow());
    }

    @GetMapping("/region/{id}")
    public ResponseEntity<?> getTitleByRegionId(@PathVariable Long id) {
        return ResponseEntity.ok(test);
//        return ResponseEntity.ok(titleRepository.findById(id).orElseThrow());
    }

    @GetMapping("/hover/{id}")
    public ResponseEntity<?> getTitleByHoverRegionId(@PathVariable Long id) {
        return ResponseEntity.ok(test);
//        return ResponseEntity.ok(titleRepository.findById(id).orElseThrow());
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<?> getTitleByCategoryId(@PathVariable Long id) {
        return ResponseEntity.ok(test);
//        return ResponseEntity.ok(titleRepository.findById(id).orElseThrow());
    }

    @GetMapping("/categories")
    public ResponseEntity<?> getTitleByCategoriesIds(Long[] ids) {
        return ResponseEntity.ok(test);
//        return ResponseEntity.ok(titleRepository.findAll());
    }

    @GetMapping("/search")
    public ResponseEntity<?> getTitleBySearch(@PathVariable String searchWord) {
        return ResponseEntity.ok(test);
//        return ResponseEntity.ok(titleRepository.findAll());
    }
}
