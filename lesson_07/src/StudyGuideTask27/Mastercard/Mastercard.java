package StudyGuideTask27.Mastercard;

import StudyGuideTask27.BankCard;

public abstract class Mastercard extends BankCard {

    protected String currencyType;

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }
}