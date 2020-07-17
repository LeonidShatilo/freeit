/**
 * Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
 */

public class GoogleDocsTask5 {

    public static void main(String[] args) {
        int num1 = -3, num2 = -7, num3 = 5;
        int countPositive = 0;
        int countNegative = 0;
        if (num1 > 0) {
            countPositive++;
        }
        if (num2 > 0) {
            countPositive++;
        }
        if (num3 > 0) {
            countPositive++;
        }
        if (num1 < 0) {
            countNegative++;
        }
        if (num2 < 0) {
            countNegative++;
        }
        if (num3 < 0) {
            countNegative++;
        }
        System.out.println("Количество положительных чисел в исходном наборе: " + countPositive);
        System.out.println("Количество отрицательных чисел в исходном наборе: " + countNegative);
    }
}