import java.util.Scanner;

/**
 * В переменную записываем число. Надо вывести на экран сколько в этом числе цифр
 * и положительное оно или отрицательное. Например, "Это однозначное положительное число".
 * Достаточно будет определить, является ли число однозначным, двухзначным или трёхзначным и более.
 */

public class GoogleDocsTask1 {

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите любое положительное или отрицательное число: ");
        int number = inputNumber.nextInt();
        int count = 0;
        int num = number;
        for(; num != 0; num/=10, ++count);
        if (number > 0 & count == 1) {
            System.out.println("Это однозначное положительное число.");
        }
        if (number < 0 & count == 1) {
            System.out.println("Это однозначное отрицательное число.");
        }
        if (number > 0 & count == 2) {
            System.out.println("Это двухзначное положительное число.");
        }
        if (number < 0 & count == 2) {
            System.out.println("Это двухзначное отрицательное число.");
        }
        if (number > 0 & count == 3) {
            System.out.println("Это трёхзначное положительное число.");
        }
        if (number < 0 & count == 3) {
            System.out.println("Это трёхзначное отрицательное число.");
        }
        if (number > 0 & count >= 4) {
            System.out.println("Это положительное число содержит более трёх знаков.");
        }
        if (number < 0 & count >= 4) {
            System.out.println("Это отрицательное число содержит более трёх знаков.");
        }
        if (number == 0) {
            System.out.println("Это ноль.");
        }
    }
}