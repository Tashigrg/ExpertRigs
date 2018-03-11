package com.example.ashish.pcexp;

public class RigSaves {

    String rigID;
    String rigName;
    String rigType;
    String rigPrice;


    public RigSaves(){


    }

    public RigSaves(String rigID, String rigName, String rigType, String rigPrice) {
        this.rigID = rigID;
        this.rigName = rigName;
        this.rigType = rigType;
        this.rigPrice = rigPrice;
    }

    public String getRigID() {

        return rigID;
    }

    public String getRigName() {

        return rigName;
    }

    public String getRigType() {

        return rigType;
    }

    public String getRigPrice() {

        return rigPrice;
    }


}
