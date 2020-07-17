import java.util.Scanner;

/**
 * Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
 */

 public class StudyGuideTask5 {

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Введите любое натуральное четырёхзначное число: ");
        int number = inputNumber.nextInt();
        int num1, num2, num3, num4;
        num4 = number % 10;
        number /= 10;
        num3 = number % 10;
        number /= 10;
        num2 = number % 10;
        number /= 10;
        num1 = number % 10;
        if (num1 == num2 & num2 == num3 & num3 == num4 & num4 == num1) {
            System.out.println("Все цифры числа идентичны.");
        } else if (num1 != num2 & num2 != num3 & num3 != num4 & num4 != num1) {
            System.out.println("Все цифры числа различны.");
        } else {
            System.out.println("Не все цифры числа различны.");
        }
    }
}