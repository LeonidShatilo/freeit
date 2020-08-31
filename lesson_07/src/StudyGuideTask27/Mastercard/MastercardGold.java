package StudyGuideTask27.Mastercard;

import StudyGuideTask27.Status;

public class MastercardGold extends Mastercard implements Status {

    private String code3dSecure;

    @Override
    public String toString() {
        return "MastercardGold — " +
                "Владелец карты: " + getUserName() +
                ", Номер карты: " + getNumber() +
                ", CVV-код: " + getCvvCode() +
                ", Тип валюты: " + getCurrencyType() +
                ", Код 3D-Secure: " + getCode3dSecure() + ".";
    }

    @Override
    public void activation(Boolean status) {
        if (status) {
            System.out.println("Карта MastercardGold активирована.");
        } else {
            System.out.println("Карта MastercardGold деактивирована.");
        }
    }

    public String getCode3dSecure() {
        return code3dSecure;
    }

    public void setCode3dSecure(String code3dSecure) {
        this.code3dSecure = code3dSecure;
    }
}