package com.hospital.hospital_system.repository;

import com.hospital.hospital_system.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {}
