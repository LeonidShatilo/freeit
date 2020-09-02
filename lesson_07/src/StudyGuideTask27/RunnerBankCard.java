package StudyGuideTask27;

import StudyGuideTask27.Mastercard.MastercardGold;
import StudyGuideTask27.Mastercard.MastercardStandart;
import StudyGuideTask27.Visa.VisaElectrone;
import StudyGuideTask27.Visa.VisaGold;

/**
 * Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */

public class RunnerBankCard {

    public static void main(String[] args) {

        MastercardGold mcGold = new MastercardGold();
        mcGold.setUserName("JACK TOMPSON");
        mcGold.setNumber("4025 5004 8854 3447");
        mcGold.setCvvCode("586");
        mcGold.setCurrencyType("EUR");
        mcGold.setCode3dSecure("8f1Kh91zAH5");
        System.out.println(mcGold.toString());
        mcGold.activation(true);
        System.out.println();

        MastercardStandart mcSt = new MastercardStandart();
        mcSt.setUserName("NIKO BELLIC");
        mcSt.setNumber("4025 5247 6712 2897");
        mcSt.setCvvCode("125");
        mcSt.setCurrencyType("EUR");
        mcSt.setCardType("Бесконтактная");
        System.out.println(mcSt.toString());
        mcSt.activation(false);
        System.out.println();

        VisaGold vG = new VisaGold();
        vG.setUserName("MICHAEL LAMPE");
        vG.setNumber("4025 5374 6895 2825");
        vG.setCvvCode("721");
        vG.setCurrencyType("USD");
        vG.setCardCategory("Gold");
        System.out.println(vG.toString());
        vG.activation(true);
        System.out.println();

        VisaElectrone vE = new VisaElectrone();
        vE.setUserName("STEVE KELLIN");
        vE.setNumber("4025 5524 6978 2497");
        vE.setCvvCode("317");
        vE.setCurrencyType("USD");
        vE.setExpirationDate("02/22");
        System.out.println(vE.toString());
        vG.activation(true);
        System.out.println();
    }
}
