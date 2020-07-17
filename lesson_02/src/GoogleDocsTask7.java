import java.util.Scanner;

/**
 * В переменную записываете количество программистов. В зависимости от количества
 * программистов необходимо вывести правильно окончание.
 * Например: • 2 программиста • 1 программист • 10 программистов • и т.д.
 */

public class GoogleDocsTask7 {

    public static void main(String[] args) {
        Scanner inputQuantity = new Scanner(System.in);
        System.out.print("Введите количество программистов: ");
        int n = inputQuantity.nextInt();
        if (n % 10 == 1 & n % 100 != 11) {
            System.out.println(n + " программист");
        } else {
           if ((n % 100 >= 11 & n % 100 <= 14) | (n % 10 == 0) | (n % 10 >= 5 & n % 10 <= 9)) {
               System.out.println(n + " программистов");
           } else {
               System.out.println(n + " программиста");
           }
        }
    }
}