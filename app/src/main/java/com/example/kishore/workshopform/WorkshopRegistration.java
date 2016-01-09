package com.example.kishore.workshopform;

import com.example.kishore.workshopform.User;

import java.util.List;


/**
 * Created by kishore on 7/1/16.
 */
public class WorkshopRegistration {

    public List<User> users;

    public String work_id;

    public boolean fb;
    public boolean wh;
    public boolean sa;
    public boolean web;
    public boolean other;

    public String other_detail;
    public String sa_Id;

    public WorkshopRegistration(List<User> users, String work_id, boolean fb, boolean wh, boolean sa, boolean web, boolean other, String other_detail, String sa_Id) {
        this.users = users;
        this.work_id = work_id;
        this.fb = fb;
        this.wh = wh;
        this.sa = sa;
        this.web = web;
        this.other = other;
        this.other_detail = other_detail;
        this.sa_Id = sa_Id;
    }
}
