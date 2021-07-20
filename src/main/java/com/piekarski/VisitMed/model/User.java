package com.piekarski.VisitMed.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {

    @Id
    private String id;
    private String name;
    private String surname;
    @Indexed(unique = true)
    private String personalIdentityNumber;
    private String address;
    @Indexed(unique = true)
    private String email;
    private String password;
    private Integer age;
    private Integer rise;
    private Double weight;

    public User() {

    }

    public User(String id, String name, String surname, String personalIdentityNumber, String address, String email, String password, Integer age, Integer rise, Double weight) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personalIdentityNumber = personalIdentityNumber;
        this.address = address;
        this.email = email;
        this.password = password;
        this.age = age;
        this.rise = rise;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getPersonalIdentityNumber() {
        return personalIdentityNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Integer getRise() {
        return rise;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalIdentityNumber='" + personalIdentityNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", rise=" + rise +
                ", weight=" + weight +
                '}';
    }
}
