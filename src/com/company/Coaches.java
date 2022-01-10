package com.company;

public class Coaches {
    private String fname,
            lname,
            id,
            dateOfBirth,
            roll,
            email;

    public Coaches(String fname, String lname, String id, String dateOfBirth, String roll, String email) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.roll = roll;
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getId() {
        return id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getRoll() {
        return roll;
    }

    public String getEmail() {
        return email;
    }

    public static Coaches newCoach(String fname, String lName, String dateOfBirth, String roll) {
        Integer id = IdGenerator.id();
        String getEmail = lName+fname+"@team.com";
        return new Coaches(fname, lName, ("s"+ id.toString()), dateOfBirth, roll, getEmail);
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}