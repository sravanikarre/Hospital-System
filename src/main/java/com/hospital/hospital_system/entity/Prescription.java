package com.hospital.hospital_system.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JsonBackReference(value = "doctor-prescriptions")
    private Doctor doctor;

    @ManyToOne
    @JsonBackReference(value = "patient-prescriptions")
    private Patient patient;

    @ManyToOne
    @JsonBackReference(value = "medicine-prescriptions")
    private Medicine medicine;

    // Getters, Setters
}
