/**
 * Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */

public class GoogleDocTask4 {

    public static void main(String[] args) {
        int a = 5; // Первый аргумент
        int b = 25; // Второй аргумент
        int count = 0; // Счётчик
        int result = 0; // Результат вычисления
        while (count < b) { // Пока счётчик меньше второго аргумента, выполнять тело цикла
            result += a; // Прибавляем к результату первый аргумент
            count++; // Увеличиваем счётчик
        }
        System.out.println(a + " * " + b + " = " + result);
    }
}