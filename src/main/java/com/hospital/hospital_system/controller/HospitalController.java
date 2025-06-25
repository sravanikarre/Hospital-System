package com.hospital.hospital_system.controller;

import com.hospital.hospital_system.entity.*;
import com.hospital.hospital_system.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping("get-all-medicines")
    public List<Medicine> getAllMedicines(){
        return hospitalService.getAllMedicines();

    }
    @GetMapping("/revenue")
    public Double getRevenueBySalesPerson(){
        return hospitalService.getRevenueBySalesPerson();
    }

    @GetMapping("/all-patients")
    public List<Patient> getPatientsTreatedByParticularHosp(){
        return hospitalService.getPatientsTreatedByParticularHosp();
    }

    @GetMapping("/count-patients")
    public Map<String,Long> getTotalPatientsInHopital(){
        return hospitalService.getTotalPatientsInHopital();
    }

    @GetMapping("/get-medicines-n-prescribed")
    public List<Medicine> getMedicinesNeverPrescribed(){
        return  hospitalService.getMedicinesNeverPrescribed();
    }

    @GetMapping("/doctors-with-unique-patients")
    public List<Doctor> getDoctorsWithUniquePatients(){
        return hospitalService.getTop3DoctorsByUniquePatients();
    }

    @GetMapping("/get-prescription-by-patient")

    public Map<String,List<Prescription>> getPrescriptionByPatient() {
        return hospitalService.getPrescriptionByPatient();
    }
    }
