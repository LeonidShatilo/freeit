/**
 * Напишите программу печати таблицы перевода расстояний из дюймов в
 * сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см.
 */

public class GoogleDocTask5 {

    public static void main(String[] args) {
        // Печать шапки таблицы
        System.out.printf("|------|--------|%n");
        System.out.printf("| inch |   cm   |%n");
        System.out.printf("|------|--------|%n");
        // Печать таблицы с конвертацией дюймов в сантиметры
        for (int inches = 1; inches <= 20; inches++) {
            System.out.printf("|  %-3d | %6.2f |%n", inches, inches * 2.54);
            System.out.printf("|------|--------|%n");
        }
    }
}