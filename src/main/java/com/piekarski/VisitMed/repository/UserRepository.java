package com.piekarski.VisitMed.repository;

import com.piekarski.VisitMed.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    public Optional<User> findByNameAndSurname(String name, String surname);
    public Optional<User> findByPersonalIdentityNumber(String personalIdentityNumber);
    public Optional<User> findByEmail(String email);
}
