package StudyGuideTask26;

public class Refrigerator extends LargeHouseholdAppliances implements Condition {

    private int minTemperature;

    public String toString() {
        return "Холодильник — " +
                "Бренд: " + getBrand() +
                ", Модель: " + getModel() +
                ", Минимальная температура: " + getMinTemperature() + "°С" +
                ", Цвет: " + getColor() + ".";
    }

    @Override
    public void plugSocket(Boolean status) {
        if (status) {
            System.out.println("Холодильник включён в розетку.");
        } else {
            System.out.println("Холодильник не включён в розетку.");
        }
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }
}