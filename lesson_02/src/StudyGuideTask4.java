import java.util.Scanner;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 * любого 4-х значного натурального числа n.
 */

public class StudyGuideTask4 {

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите любое натуральное четырёхзначное число: ");
        int number = inputNumber.nextInt();
        int result;
        System.out.print("Реверсивное число: ");
        result = number % 10;
        System.out.print(result);
        number /= 10;
        result = number % 10;
        System.out.print(result);
        number /= 10;
        result = number % 10;
        System.out.print(result);
        number /= 10;
        result = number % 10;
        System.out.print(result);
    }
}