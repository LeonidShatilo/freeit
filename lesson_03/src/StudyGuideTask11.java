/**
 * 	Имеется целое число, определить является ли это число простым,
 * 	т.е. делится без остатка только на 1 и себя.
 */

public class StudyGuideTask11 {

    public static void main(String[] args) {
        int number = 7;
        boolean isSimple = true;
        int i = 0;
        if (number == 0 || number == 1) { // Если число равно 0 или 1, то оно не является простым
            System.out.println(number + " не является простым числом.");
        } else { // Иначе выполнить цикл с условием
            for (i = 2; i < number; i++) {
                if (number % i == 0) { // Если число делится без остатка на любые числа, кроме 1 и себя самого, то оно не является простым
                    System.out.println(number + " не является простым числом.");
                    isSimple = false;
                    break; // Останавливаем и выходим из цикла
                }
            }
            if (isSimple) { // Если условие внутри цикла не выполняется, тогда число является простым
                System.out.println(number + " является простым числом.");
            }
        }
    }
}