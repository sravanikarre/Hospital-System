package com.hospital.hospital_system.repository;

import com.hospital.hospital_system.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {}
