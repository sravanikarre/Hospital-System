package com.hospital.hospital_system.repository;

import com.hospital.hospital_system.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {}
