package org.example.Premium;

public class Standart extends Membership{
    public Standart() {
        message = "Standart";
        log();
    }
    @Override
    public void setRewardPointPercentage(double rewardPointPercentage) {
        super.setRewardPointPercentage(rewardPointPercentage);
    }
    @Override
    public void setPenaltyPointPercentage(double penaltyPointPercentage) {
        super.setPenaltyPointPercentage(penaltyPointPercentage);
    }
}
