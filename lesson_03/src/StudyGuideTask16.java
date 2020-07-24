import java.util.Random;

/**
     * Определите сумму элементов одномерного массива, расположенных между
     * минимальным и максимальным значениями.
 */

public class StudyGuideTask16 {

    public static void main(String[] args) {
        int [] array = new int[10];
        int x = 0;
        int y = 0;
        int sum = 0;
        int min = array[0];
        int max = array[0];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) { // Выполняем цикл для генерации псевдослучайных чисел от 0 до 50 и заполняем ими массив
            int numbers = rand.nextInt(50);
            array[i] = numbers;
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) { // Вывод исходного массива в консоль
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) { // Выполняем цикл для нахождения наименьшего числа содержащегося в массиве
            if (array[i] < min) {
                min = array[i];
                x = i;
            }
        }
        for (int i = 0; i < array.length; i++) { // Выполняем цикл для нахождения наибольшего числа содержащегося в массиве
            if (array[i] > max) {
                max = array[i];
                y = i;
            }
        }
        for (int i = x + 1; i < y; i++) { // Выполняем цикл для нахождения суммы между наименьшим и наибольшим значением массива
            sum += array[i];
        }
        System.out.println("\n" + "Сумма элементов: \n" + sum);
    }
}