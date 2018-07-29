package com.example.magic.goodteam;

import java.io.Serializable;

/**
 * Created by magic on 7/16/2018.
 */

public class User implements Serializable {

    private String LId ;
    private String LName ;
    private String LPass ;

    public String getLId() {
        return LId;
    }

    public void setLId(String id) {
        LId = id;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String name) {
        LName = name;
    }

    public String getLPass() {
        return LPass;
    }

    public void setLPass(String pass) {
        LPass = pass;
    }
}
