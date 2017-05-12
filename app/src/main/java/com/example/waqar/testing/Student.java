package com.example.waqar.testing;

/**
 * Created by waqar on 5/12/2017.
 */

public class Student {

    int stud_id;
    String name;

    Student(int stud_id,String name){
        this.stud_id=stud_id;
        this.name=name;
    }

    public int getStud_id() {
        return stud_id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
