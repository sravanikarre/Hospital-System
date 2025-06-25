package com.hospital.hospital_system.repository;

import com.hospital.hospital_system.entity.SalesPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesPersonRepository extends JpaRepository<SalesPerson, Integer> {}
