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
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    @JsonBackReference(value = "hospital-doctor")
    private Hospital hospital;

    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
    @JsonManagedReference(value = "doctor-prescriptions")
    private List<Prescription> prescriptions = new ArrayList<>();

    // Getters, Setters
}
