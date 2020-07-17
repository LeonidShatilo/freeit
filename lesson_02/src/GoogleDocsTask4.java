/**
 * Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */

public class GoogleDocsTask4 {

    public static void main(String[] args) {
        int num1 = 5, num2 = -2, num3 = 8;
        int countPositive = 0;
        if (num1 > 0) {
            countPositive++;
        }
        if (num2 > 0) {
            countPositive++;
        }
        if (num3 > 0) {
            countPositive++;
        }
        System.out.println("Количество положительных чисел в исходном наборе: " + countPositive);
    }
}