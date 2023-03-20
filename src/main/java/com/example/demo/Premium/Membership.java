package com.example.demo.Premium;

import java.util.ArrayList;

public class Membership {
    private double rewardPointPercentage = 1;
    private double penaltyPointPercentage = 1;
    private boolean isActive = true;
    public String message;
    private ArrayList<Membership> memberships;


    public Membership() {

    }
    public void log(){
        System.out.println(message + " Membership logged");
        //this print method is just to have a concrete log example for now,
        // it must be changed in the future as to send the message , instead of printing , to database in a convenient way.
    }

    public double getRewardPointPercentage() {
        return rewardPointPercentage;
    }

    public void setRewardPointPercentage(double rewardPointPercentage) {
        this.rewardPointPercentage = rewardPointPercentage;
    }

    public double getPenaltyPointPercentage() {
        return penaltyPointPercentage;
    }

    public void setPenaltyPointPercentage(double penaltyPointPercentage) {
        this.penaltyPointPercentage = penaltyPointPercentage;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public ArrayList<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(ArrayList<Membership> memberships) {
        this.memberships = memberships;
    }
}


