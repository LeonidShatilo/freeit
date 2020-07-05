import java.util.Scanner;

public class HelloUsername {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = input.next();
        System.out.println("Hello, " + name + "!");
    }
}