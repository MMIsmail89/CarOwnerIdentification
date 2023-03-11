package com.example.caridentification;

public class Motor {
    private String make;
    private String model;
    private String ownerName;
    private String ownerTelNr;
    //

    public Motor(String make, String model, String ownerName, String ownerTelNr) {
        this.make = make;
        this.model = model;
        this.ownerName = ownerName;
        this.ownerTelNr = ownerTelNr;
    }
    //

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerTelNr() {
        return ownerTelNr;
    }

    public void setOwnerTelNr(String ownerTelNr) {
        this.ownerTelNr = ownerTelNr;
    }
}
