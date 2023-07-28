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
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    public Long address_id;

    @Column(nullable = false)
    public int building;

    @Column(nullable = false)
    public double coordinate1;

    @Column(nullable = false)
    public double coordinate2;

    @ManyToOne
    @JoinColumn(name="street_id", nullable=false)
    private Street street;

    @JsonIgnore
    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    public Title title;


}
