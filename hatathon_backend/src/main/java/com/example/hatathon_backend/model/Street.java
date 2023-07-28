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
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    public Long street_id;

    @Column(nullable = false)
    public String name;

    @Column
    public String oldName;

    @ManyToOne
    @JoinColumn(name="city_id", nullable=false)
    private City city;

    @JsonIgnore
    @OneToMany(mappedBy = "street", cascade = CascadeType.ALL)
    public Collection<Address> addresses;

}
