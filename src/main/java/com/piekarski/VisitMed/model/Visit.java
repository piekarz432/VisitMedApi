package com.piekarski.VisitMed.model;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Visit {

    @DBRef
    private User user;
    @DBRef
    private Clinic clinic;
    private String date;
    private String time;

    public Visit() {
    }

    public Visit(User user, Clinic clinic, String date, String time) {
        this.user = user;
        this.clinic = clinic;
        this.date = date;
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Visits{" +
                "user=" + user +
                ", clinic=" + clinic +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
