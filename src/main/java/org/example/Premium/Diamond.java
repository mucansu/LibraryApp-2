package org.example.Premium;

public class Diamond extends Membership {
    private double DiamondRewardPercentage = 3;
    private double DiamondPenaltyPercentage = 0.25;
    public Diamond() {
    }
    @Override
    public void setRewardPointPercentage(double rewardPointPercentage) {
        super.setRewardPointPercentage(rewardPointPercentage*DiamondRewardPercentage);
    }
    @Override
    public void setPenaltyPointPercentage(double penaltyPointPercentage) {
        super.setPenaltyPointPercentage(penaltyPointPercentage*DiamondPenaltyPercentage);
    }
}
