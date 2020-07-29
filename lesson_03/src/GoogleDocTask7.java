/**
 * Напишите программу, определяющую сумму всех нечётных чисел от 1 до 99.
 */

public class GoogleDocTask7 {

    public static void main(String[] args) {
        int sum = 0; // Итоговая сумма всех нечётных чисел
        for (int number = 1; number <= 99; number += 2) { // Увеличивать number на 2 пока оно меньше или равно 99
            sum += number; // Прибавляем нечётное число к итоговой сумме
        }
        System.out.println("Сумма всех нечётных чисел от 1 до 99: " + sum);
    }
}