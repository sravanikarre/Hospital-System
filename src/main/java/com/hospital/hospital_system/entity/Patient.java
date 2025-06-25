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
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;


    @ManyToOne
    @JsonBackReference(value = "hospital-patient")
    private Hospital hospital;

    @OneToMany(mappedBy = "patient")
    @JsonManagedReference(value = "patient-prescriptions")
    private List<Prescription> prescriptions = new ArrayList<>();

    // Getters, Setters
}
