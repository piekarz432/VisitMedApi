package com.piekarski.VisitMed.service;

import com.piekarski.VisitMed.model.Doctor.Doctor;
import com.piekarski.VisitMed.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> findDoctors()
    {
        return doctorRepository.findAll();
    }

    public Doctor findDoctorByNameAndSurname(String name, String surname) {
        return doctorRepository.findByNameAndSurname(name, surname).orElseThrow();
    }

    public String addDoctor(Doctor doctor)
    {
        return doctorRepository.insert(doctor).toString();
    }


}
