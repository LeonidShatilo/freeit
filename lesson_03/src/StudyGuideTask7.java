/**
 * Имеется прямоугольное отверстие размерами a и b, определить,
 * можно ли его полностью закрыть круглой картонкой радиусом r.
 */

public class StudyGuideTask7 {

    public static void main(String[] args) {
        int a = 20;
        int b = 48;
        int r = 25;
        int d = r * 2; // Переводим радиус в диаметр
        if (d > a & d > b) { // Проверяем, закрывает ли полностью круг прямоугольное отверстие
            System.out.println("Отверстие можно полностью закрыть.");
        } else {
            System.out.println("Отврестие нельзя полностью закрыть.");
        }
    }
}