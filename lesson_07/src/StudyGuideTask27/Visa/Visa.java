package StudyGuideTask27.Visa;

import StudyGuideTask27.BankCard;

public abstract class Visa extends BankCard {

    protected String currencyType;

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }
}
