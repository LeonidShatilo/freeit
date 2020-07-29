import java.util.Random;

/**
 * Создать последовательность случайных чисел, найти и вывести наибольшее из них.
 */

public class StudyGuideTask13 {

    public static void main(String[] args) {
        int[] arrayNumbers = new int[10]; // Создаём массив размерностью 10
        int max = 0;
        Random rand = new Random();
        for (int i = 0; i < 10; i++) { // Выполняем цикл для генерации псевдослучайных чисел от 0 до 100 и заполняем ими массив
            int numbers = rand.nextInt(100);
            arrayNumbers[i] = numbers;
        }
        for (int i = 0; i < arrayNumbers.length; i++) { // Выполняем цикл для нахождения наибольшего числа содержащегося в массиве
            if (arrayNumbers[i] > max) {
                max = arrayNumbers[i];
            }
        }
        System.out.println("Наибольшее число в массиве: " + max);
    }
}