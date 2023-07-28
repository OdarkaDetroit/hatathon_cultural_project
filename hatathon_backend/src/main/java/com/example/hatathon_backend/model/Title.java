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
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    public Long title_id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String information;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "address_id")
    public Address address;

    @JsonIgnore
    @OneToMany(mappedBy = "title", cascade = CascadeType.ALL)
    public Collection<PhotoReference> photos;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "title_category",
            joinColumns = @JoinColumn(name = "title_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    public Collection<Category> titleCategories;

}
