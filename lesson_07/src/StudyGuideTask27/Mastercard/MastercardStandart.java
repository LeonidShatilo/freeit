package StudyGuideTask27.Mastercard;

import StudyGuideTask27.Status;

public class MastercardStandart extends Mastercard implements Status {

    private String cardType;

    @Override
    public String toString() {
        return "MastercardStandart — " +
                "Владелец карты: " + getUserName() +
                ", Номер карты: " + getNumber() +
                ", CVV-код: " + getCvvCode() +
                ", Тип валюты: " + getCurrencyType() +
                ", Тип карты: " + getCardType() + ".";
    }

    @Override
    public void activation(Boolean status) {
        if (status) {
            System.out.println("Карта MastercardStandart активирована.");
        } else {
            System.out.println("Карта MastercardStandart деактивирована.");
        }
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
