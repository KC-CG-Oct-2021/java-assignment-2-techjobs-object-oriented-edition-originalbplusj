package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    public int id;
    static int nextId = 1;
    private String value;

    public JobField(){
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }


    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if(value.equals("")){
            value = "Data not available";
        }
        return value;

    }


}
