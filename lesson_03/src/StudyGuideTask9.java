/**
 * Изменить пример с суммой чисел таким образом, чтобы рассчитывалась
 * не сумма, а произведение, т.е. факториал числа.
 */

public class StudyGuideTask9 {

    public static void main(String[] args) {
        int i = 1;
        long factorial = 1;
        int number = (int)(Math.random() * 20); // Псевдослучайное целое число
        if (number != 0) { // Если число не равно нулю, то выполнять цикл
            while (i < number) { // Пока счётчик меньше числа — выполняется цикл
                i++;
                factorial *= i;
            }
        } else { // Иначе факториал равен нулю
            factorial = 0;
        }
        System.out.print(number + "! = " + factorial);
    }
}