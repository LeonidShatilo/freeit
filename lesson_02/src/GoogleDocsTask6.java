/**
 * Даны 2 числа. Вывести большее из них.
 */

public class GoogleDocsTask6 {

    public static void main(String[] args) {
        int num1 = 5, num2 = 10;
        if (num1 != num2) {
            if (num1 > num2) {
                System.out.println("Большее число: " + num1);
            }
            if (num2 > num1) {
                System.out.println("Большее число: " + num2);
            }
        } else {
            System.out.println("Числа равны.");
        }
    }
}