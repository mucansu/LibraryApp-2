package org.example.Entities;

public class User extends Profile{
    private double penaltyPoint;
    private double rewardPoint;
    private boolean isActive;

    public User() {
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
