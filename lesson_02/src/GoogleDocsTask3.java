import java.util.Scanner;

/**
 * Дано целое число. Если оно является положительным, то прибавить к нему 1.
 * Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10.
 * Вывести полученное число.
 */

public class GoogleDocsTask3 {

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int number = inputNumber.nextInt();
        if (number > 0) {
            number++;
            System.out.print("Полученное число: " + number);
        }
        if (number < 0) {
            number = number - 2;
            System.out.print("Полученное число: " + number);
        }
        if (number == 0) {
            number = 10;
            System.out.print("Полученное число: " + number);
        }
    }
}