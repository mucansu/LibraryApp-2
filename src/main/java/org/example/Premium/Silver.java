package org.example.Premium;

public class Silver extends Membership {
    private double SilverRewardPercentage = 1.5;
    private double SilverPenaltyPercentage = 0.75;
    public Silver() {
        message = "Silver";
        log();
    }

    @Override
    public void setRewardPointPercentage(double rewardPointPercentage) {
        super.setRewardPointPercentage(rewardPointPercentage*SilverRewardPercentage);
    }
    @Override
    public void setPenaltyPointPercentage(double penaltyPointPercentage) {
        super.setPenaltyPointPercentage(penaltyPointPercentage*SilverPenaltyPercentage);
    }
}
