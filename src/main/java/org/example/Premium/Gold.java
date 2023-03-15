package org.example.Premium;

public class Gold extends Standart{
    public Gold() {
    }

    @Override
    public double getRewardPointPercentage() {
        return super.getRewardPointPercentage();
    }

    @Override
    public void setRewardPointPercentage(double rewardPointPercentage) {
        super.setRewardPointPercentage(rewardPointPercentage);
    }

    @Override
    public double getPenaltyPointPercentage() {
        return super.getPenaltyPointPercentage();
    }

    @Override
    public void setPenaltyPointPercentage(double penaltyPointPercentage) {
        super.setPenaltyPointPercentage(penaltyPointPercentage);
    }

    @Override
    public boolean isActive() {
        return super.isActive();
    }

    @Override
    public void setActive(boolean active) {
        super.setActive(active);
    }
}
