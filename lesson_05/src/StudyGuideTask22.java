import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записаных
 * по правилам Java, с помощью регулярных выражений и вывести их на страницу.
 */

public class StudyGuideTask22 {

    public static void main(String[] args) {
        // Создаём строку и помещаем в неё текст с шестнадцатеричными числами
        String text = "\tТаким образом, функция 0X021BA7 replaceAll находит фрагмент строки,\n" +
                "соответствующий 0x0ac89f регулярному выражению, полученному первым аргументом, и\n" +
                "заменяет его строкой, полученной 0x98FA3C как второй аргумент. В нашем случае\n" +
                "произвольное 0x727FF0 количество пробелов заменяется единичным пробелом. Функция\n" +
                "replaceFirst работает аналогично, но заменяет только 0X10A9B1 первое найденное\n" +
                "совпадение.";
        Pattern patternHexadecimal = Pattern.compile("0[x|X][0-9a-fA-F]{1,16}"); // Создаём объект класса Pattern и компилируем регулярное выражение для поиска шестнадцатеричного числа
        Matcher hexadecimalNumber = patternHexadecimal.matcher(text); // Создаём обект класса Matcher для запуска операции сравнения
        // Выполнять тело цикла, пока не будут найдены все шестнадцатеричные числа в тексте
        while(hexadecimalNumber.find()) {
            System.out.println(hexadecimalNumber.group()); // Вывод в консоль найденного шестнадцатеричного числа
        }
    }
}