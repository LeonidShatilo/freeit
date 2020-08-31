package StudyGuideTask26;

/**
 * Создать иерархию классов, описывающих бытовую технику.
 * Создать несколько объектов описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.
 */

public class Runner {

    public static void main(String[] args) {

        Refrigerator refrigerator = new Refrigerator();
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        refrigerator.setBrand("LG");
        refrigerator.setModel("GA-B419SLGL");
        refrigerator.setMinTemperature(-26);
        refrigerator.setColor("нержавеющая сталь");
        System.out.println(refrigerator.toString());
        refrigerator.plugSocket(true);
        System.out.println();
        coffeeMachine.setBrand("Philips");
        coffeeMachine.setModel("EP2231/40");
        coffeeMachine.setPower(1500);
        coffeeMachine.setMaterial("пластик");
        System.out.println(coffeeMachine.toString());
        coffeeMachine.plugSocket(false);
    }
}