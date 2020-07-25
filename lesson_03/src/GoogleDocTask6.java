/**
 * Напишите программу вывода всех чётных чисел от 2 до 100 включительно.
 */

public class GoogleDocTask6 {

    public static void main(String[] args) {
        for (int number = 2; number <= 100; number += 2) { // Увеличивать number на 2 пока оно меньше или равно 100
                System.out.println(number); // Вывод значения в консоль
        }
    }
}