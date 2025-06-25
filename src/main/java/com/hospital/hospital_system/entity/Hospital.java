package com.hospital.hospital_system.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "hospital")
    @JsonManagedReference(value = "hospital-doctor")
    private List<Doctor> doctors = new ArrayList<>();

    @OneToMany(mappedBy = "hospital")
    @JsonManagedReference(value = "hospital-patient")
    private List<Patient> patients = new ArrayList<>();

    @OneToMany(mappedBy = "hospital")
    @JsonManagedReference(value = "hospital-salesperson")
    private List<SalesPerson> salesPeople = new ArrayList<>();

    // Getters, Setters
}
