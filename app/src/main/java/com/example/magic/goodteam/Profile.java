package com.example.magic.goodteam;


import java.io.Serializable;

public class Profile  implements Serializable{


    private  String Namer ;
    private  String Age ;
    private  String Specialty ;
    private  String College ;
    private  String Grander ;

    public String getNamer() {
        return Namer;
    }

    public void setNamer(String name) {
        Namer = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public String getGrander() {
        return Grander;
    }

    public void setGrander(String grander) {
        Grander = grander;
    }
}
