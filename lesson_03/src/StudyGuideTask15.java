import java.util.Random;

/**
 * 	Создать массив, заполнить его случайными элементами, распечатать,
 * 	перевернуть, и снова распечатать (при переворачивании нежелательно создавать ещё один массив).
 */

public class StudyGuideTask15 {

    public static void main(String[] args) {
        int[] array = new int[5]; // Создаём массив размерностью 5
        Random rand = new Random();
        for (int i = 0; i < 5; i++) { // Выполняем цикл для генерации псевдослучайных чисел от 0 до 100 и заполняем ими массив
            int numbers = rand.nextInt(100);
            array[i] = numbers;
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) { // Вывод исходного массива в консоль
            System.out.print(array[i] + " ");
        }
        for(int i = 0; i < array.length / 2; i++) { // Выполняем цикл для переворота массива
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("\n" + "Перевёрнутый массив:");
        for (int i = 0; i < array.length; i++) { // Вывод перевёрнутого массива в консоль
            System.out.print(array[i] + " ");
        }
    }
}