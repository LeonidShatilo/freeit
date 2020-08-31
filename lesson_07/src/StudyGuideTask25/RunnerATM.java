package StudyGuideTask25;

import java.util.Scanner;

/**
 * 	Создать класс и объекты, описывающие Банкомат. Набор купюр находящихся в банкомате
 * 	должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
 * 	Сделать методы для добавления денег в банкомат. Сделать функцию, снимающую деньги.
 * 	На вход передаётся сумма денег. На выход – булевское значение (операция удалась или нет).
 * 	При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * 	Создать конструктор с тремя параметрами – количеством купюр.
 */

public class RunnerATM {

    public static void main(String[] args) {

        AutomatedTellerMachine atm = new AutomatedTellerMachine(50,50,50);
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько купюр по 20 выхотите добавить?");
        int cash20add = sc.nextInt();
        System.out.println("Сколько купюр по 50 выхотите добавить?");
        int cash50add = sc.nextInt();
        System.out.println("Сколько купюр по 100 выхотите добавить?");
        int cash100add = sc.nextInt();
        atm.addMoney(cash20add, cash50add, cash100add);
        atm.balance();
        System.out.println("Введите сумму денег, которую вы хотите снять:");
        if (atm.withdrawMoney(sc.nextInt())) {
            System.out.print("Операция успешно выполнена.");
        } else {
            System.out.print("Операция завершилась неудачей.");
        }
    }
}