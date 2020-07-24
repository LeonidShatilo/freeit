import java.util.Random;

/**
 * Имеется целое число. Это число – количество денег в рублях.
 * Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 */

public class StudyGuideTask8 {

    public static void main(String[] args) {
        Random rand = new Random();
        int rubles = rand.nextInt(1000); // Генерируем псевдослучайное число в диапазоне от 0 до 1000
        if (rubles % 10 == 1 && rubles % 100 != 11) { // Если остаток равеен 1 и не равен 11, то выводим в консоль "рубль"
            System.out.println(rubles + " рубль.");
        } else if ((rubles % 10 == 2 || rubles % 10 == 3 || rubles % 10 == 4)
                != (rubles % 100 == 12 || rubles % 100 == 13 || rubles % 100 == 14)) { // Иначе, если остаток равен 2, 3, 4, 12, 13 или 14, то выводим в консоль "рубля"
            System.out.println(rubles + " рубля.");
        } else { // Иначе выводим в консоль "рублей"
            System.out.println(rubles + " рублей.");
        }
    }
}