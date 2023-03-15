package org.example.Premium;

public class Standart {
    private double rewardPointPercentage = 1;
    private double penaltyPointPercentage = 1;
    private boolean isActive = true;

    public Standart() {
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
}


