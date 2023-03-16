package org.example.Entities;

import org.example.Premium.Membership;

public class User extends Profile{
    private double penaltyPoint = 0;
    private double rewardPoint = 0;
    private boolean isActive = true;
    private Membership membership;

    public User() {
    }

    public User(long id, String firstName, String lastName, String email, String password, double penaltyPoint, double rewardPoint, boolean isActive, Membership membership) {
        super(id, firstName, lastName, email, password);
        this.penaltyPoint = penaltyPoint;
        this.rewardPoint = rewardPoint;
        this.isActive = isActive;
        this.membership = membership;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public double getPenaltyPoint() {
        return penaltyPoint;
    }

    public void setPenaltyPoint(double penaltyPoint) {
        this.penaltyPoint = penaltyPoint;
    }

    public double getRewardPoint() {
        return rewardPoint;
    }

    public void setRewardPoint(double rewardPoint) {
        this.rewardPoint = rewardPoint;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
