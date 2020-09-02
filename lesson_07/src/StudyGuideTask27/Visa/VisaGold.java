package StudyGuideTask27.Visa;

import StudyGuideTask27.Status;

public class VisaGold extends Visa implements Status {

    private String cardCategory;

    @Override
    public String toString() {
        return "VisaGold — " +
                "Владелец карты: " + getUserName() +
                ", Номер карты: " + getNumber() +
                ", CVV-код: " + getCvvCode() +
                ", Тип валюты: " + getCurrencyType() +
                ", Категория карты: " + getCardCategory() + ".";
    }

    @Override
    public void activation(Boolean status) {
        if (status) {
            System.out.println("Карта VisaElectrone активирована.");
        } else {
            System.out.println("Карта VisaElectrone деактивирована.");
        }
    }

    public String getCardCategory() {
        return cardCategory;
    }

    public void setCardCategory(String cardCategory) {
        this.cardCategory = cardCategory;
    }
}
