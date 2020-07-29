/**
 * Вычислить: 1 + 2 + 4 + 8 +  ... + 256.
 */

public class GoogleDocTask3 {

    public static void main(String[] args) {
        int resultSum = 0; // Значение результирующей суммы
        for (int n = 1; n <= 256; n *= 2) { // Выполняем цикл пока счётчик меньше или равен 256, при этом умножая его с каждой итерацией на 2
            resultSum += n; // Прибавляем к результирующей сумме значение счётчика
        }
        System.out.println("Результирующая сумма: " + resultSum);
    }
}