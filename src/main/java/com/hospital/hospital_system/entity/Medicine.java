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
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;

    @ManyToMany(mappedBy = "suppliedMedicines")
    @JsonBackReference(value = "salesperson-medicines")
    private List<SalesPerson> salesPeople = new ArrayList<>();

    @OneToMany(mappedBy = "medicine", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "medicine-prescriptions")
    private List<Prescription> prescriptions = new ArrayList<>();

    // Getters, Setters
}
