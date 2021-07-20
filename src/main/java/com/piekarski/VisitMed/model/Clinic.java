package com.piekarski.VisitMed.model;

import com.piekarski.VisitMed.model.Doctor.Doctor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Clinics")
public class Clinic {

    @Id
    private String id;
    private String city;
    private String name;
    private String address;
    private String phoneNumber;
    @DBRef
    private List<Doctor> doctors;

    public Clinic() {
    }

    public Clinic(String id, String city, String name, String address, String phoneNumber, List<Doctor> doctors) {
        this.id = id;
        this.city = city;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.doctors = doctors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", doctors=" + doctors +
                '}';
    }
}
