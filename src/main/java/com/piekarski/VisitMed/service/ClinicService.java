package com.piekarski.VisitMed.service;

import com.piekarski.VisitMed.model.Clinic;
import com.piekarski.VisitMed.repository.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicService {

    @Autowired
    private ClinicRepository clinicRepository;

    public String addClinic(Clinic clinic)
    {
        return clinicRepository.insert(clinic).toString();
    }

    public List<Clinic> findClinics()
    {
        return clinicRepository.findAll();
    }

    public String deleteClinic(String id)
    {
        clinicRepository.deleteById(id);

        return id;
    }


}
