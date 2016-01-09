package com.example.kishore.workshopform;

/**
 * Created by kishore on 7/1/16.
 */
public class User {

    String display_name;
    String email;
    String college;
    String course;
    String year;
    String contact;

    public User(String name, String email, String college, String course, String year, String contact) {
        this.display_name = name;
        this.email = email;
        this.college = college;
        this.course = course;
        this.year = year;
        this.contact = contact;
    }
}
