package com.example.viikko9;

import java.io.Serializable;

public class User implements Serializable {

    protected String firstName;
    protected String lastName;
    protected String email;
    protected String degreeProgram;
    protected int image;
    protected String degrees;

    public User(String firstName, String lastName, String email, String degreeProgram, int image, String degrees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.image = image;
        this.degrees = degrees;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getImage() {
        return image;
    }

    public String getDegrees() {
        return degrees;
    }
}
