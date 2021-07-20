package com.piekarski.VisitMed.service;

import com.piekarski.VisitMed.model.User;
import com.piekarski.VisitMed.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findUsers()
    {
        return userRepository.findAll();
    }

    public User findUserByNameAndSurname(String name, String surname)
    {
        return userRepository.findByNameAndSurname(name, surname).orElseThrow();
    }

    public User findUserByPersonalIdentityNumber(String personalIdentityNumber)
    {
        return userRepository.findByPersonalIdentityNumber(personalIdentityNumber).orElseThrow();
    }

    public User findUserByEmail(String email)
    {
        return userRepository.findByEmail(email).orElseThrow();
    }

    public String addUser(User user)
    {
        return userRepository.insert(user).toString();
    }

    public String deleteUser(String id)
    {
        userRepository.deleteById(id);

        return id;
    }





}
