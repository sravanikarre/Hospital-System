package com.hospital.hospital_system.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class SalesPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany
    @JoinTable(
        name = "salesperson_medicine",
        joinColumns = @JoinColumn(name = "salesperson_id"),
        inverseJoinColumns = @JoinColumn(name = "medicine_id")
    )
    @JsonManagedReference(value = "salesperson-medicines")
    private List<Medicine> suppliedMedicines = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    @JsonBackReference(value = "hospital-salesperson")
    private Hospital hospital;

    // Getters, Setters
}
