package com.piekarski.VisitMed.controller;

import com.piekarski.VisitMed.model.User;
import com.piekarski.VisitMed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> findAllUsers()
    {
        return userService.findUsers();
    }

    @GetMapping("/users/{name}/{surname}")
    public User findByNameAndSurname(@PathVariable String name, @PathVariable String surname)
    {
        return userService.findUserByNameAndSurname(name, surname);
    }

    @GetMapping("/users/{personalIdentityNumber}")
    public User findByPersonalIdentityNumber(@PathVariable String personalIdentityNumber)
    {
        return userService.findUserByPersonalIdentityNumber(personalIdentityNumber);
    }

    @GetMapping("/users/{email}")
    public User findByEmail(@PathVariable String email)
    {
        return userService.findUserByEmail(email);
    }

    @PostMapping("/users/addUser")
    public String addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable String id)
    {
        return userService.deleteUser(id);
    }


}
