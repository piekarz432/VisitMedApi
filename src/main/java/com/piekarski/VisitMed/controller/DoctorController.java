package com.piekarski.VisitMed.controller;

import com.piekarski.VisitMed.model.Doctor.Doctor;
import com.piekarski.VisitMed.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public List<Doctor> findAllDoctors()
    {
        return doctorService.findDoctors();
    }

    @GetMapping("/doctors/{name}/{surname}")
    public Doctor findByNameAndSurname(@PathVariable String name, @PathVariable String surname)
    {
        return doctorService.findDoctorByNameAndSurname(name, surname);
    }

    @PostMapping("/doctors/addDoctor")
    public String addDoctor(@RequestBody Doctor doctor)
    {
        return doctorService.addDoctor(doctor);
    }


}
