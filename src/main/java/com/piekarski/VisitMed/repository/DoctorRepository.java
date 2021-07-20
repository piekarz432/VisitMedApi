package com.piekarski.VisitMed.repository;

import com.piekarski.VisitMed.model.Doctor.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DoctorRepository extends MongoRepository<Doctor, String> {
    public Optional<Doctor> findByNameAndSurname(String name, String surname);
}
