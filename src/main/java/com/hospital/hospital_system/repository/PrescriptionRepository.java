package com.hospital.hospital_system.repository;

import com.hospital.hospital_system.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {}
