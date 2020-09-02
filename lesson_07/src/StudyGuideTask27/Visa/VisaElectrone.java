package StudyGuideTask27.Visa;

import StudyGuideTask27.Status;

public class VisaElectrone extends Visa implements Status {

    private String expirationDate;

    @Override
    public String toString() {
        return "VisaElectrone — " +
                "Владелец карты: " + getUserName() +
                ", Номер карты: " + getNumber() +
                ", CVV-код: " + getCvvCode() +
                ", Тип валюты: " + getCurrencyType() +
                ", Срок действия: " + getExpirationDate() + ".";
    }

    @Override
    public void activation(Boolean status) {
        if (status) {
            System.out.println("Карта VisaElectrone активирована.");
        } else {
            System.out.println("Карта VisaElectrone деактивирована.");
        }
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
