package com.hospital.hospital_system.repository;

import com.hospital.hospital_system.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {}
