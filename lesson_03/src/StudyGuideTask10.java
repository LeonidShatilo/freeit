/**
 * 	Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */

public class StudyGuideTask10 {

    public static void main(String[] args) {
        int min = 10; // Минимальное число для диапазона
        int max = 15; // Максимальное число для диапазона
        long factorial = 1;
        max -= min;
        int randomNumber = (int)(Math.random() * ++max) + min; // Псевдослучаное целое число
        for (int i = 1; i <= randomNumber; i++) { // Цикл выполняется до тех пор, пока счётчик меньше или равен числу
            factorial *= i;
        }
        System.out.println(randomNumber + "! = " + factorial);
    }
}