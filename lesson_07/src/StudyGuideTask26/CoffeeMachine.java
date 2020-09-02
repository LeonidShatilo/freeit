package StudyGuideTask26;

public class CoffeeMachine extends SmallHouseholdAppliances implements Condition {

    String material; // Материал корпуса

    public String toString() {
        return "Кофеварка — " +
                "Бренд: " + getBrand() +
                ", Модель: " + getModel() +
                ", Мощность: " + getPower() + " Вт" +
                ", Материал корпуса: " + getMaterial() + ".";
    }

    @Override
    public void plugSocket(Boolean status) {
        if (status) {
            System.out.println("Кофеварка включена в розетку.");
        } else {
            System.out.println("Кофеварка не включена в розетку.");
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}