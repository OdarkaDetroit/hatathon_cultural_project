package com.example.hatathon_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    public Long region_id;

    @Column(nullable = false)
    public String name;

    @JsonIgnore
    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
    public Collection<City> cities;

}
