package org.example.Premium;

public class Gold extends Membership {
    private double GoldRewardPercentage = 2;
    private double GoldPenaltyPercentage = 0.5;
    public Gold() {
        message = "Gold";
        log();
    }
    @Override
    public void setRewardPointPercentage(double rewardPointPercentage) {
        super.setRewardPointPercentage(rewardPointPercentage*GoldRewardPercentage);
    }
    @Override
    public void setPenaltyPointPercentage(double penaltyPointPercentage) {
        super.setPenaltyPointPercentage(penaltyPointPercentage*GoldPenaltyPercentage);
    }
}
