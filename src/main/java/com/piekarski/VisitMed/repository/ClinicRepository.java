package com.piekarski.VisitMed.repository;

import com.piekarski.VisitMed.model.Clinic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClinicRepository extends MongoRepository<Clinic, String> {
}
