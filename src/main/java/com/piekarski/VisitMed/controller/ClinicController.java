package com.piekarski.VisitMed.controller;

import com.piekarski.VisitMed.model.Clinic;
import com.piekarski.VisitMed.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClinicController {

    @Autowired
    private ClinicService clinicService;

    @PostMapping("/clinics/addClinic")
    public String addClinic(@RequestBody Clinic clinic)
    {
        return clinicService.addClinic(clinic);
    }

    @GetMapping("/clinics")
    public List<Clinic> findAllClinics()
    {
        return clinicService.findClinics();
    }

    @DeleteMapping("/clinics/{id}")
    public String deleteClinic(String id)
    {
        return clinicService.deleteClinic(id);
    }


}
