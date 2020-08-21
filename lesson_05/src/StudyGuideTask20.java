import java.util.StringTokenizer;

/**
 * Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
 */

public class StudyGuideTask20 {

    public static void main(String[] args) {
        // Создаём строку и заполняем её текстом со знаками препинания, дополнительными пробелами, переносами строк и табуляцией
        String text = "\tРегулярные выражения используются в    случае, если необходимо выполнить\n" +
                "проверку текста в строке на   соответствие   определенному  шаблону. Например, в\n" +
                "тексте ?? необходимо  !  найти  числа, в  том  числе !? отрицательные, то   есть\n" +
                "последовательности цифр, которые могут начинаться со знака минус.";
        StringTokenizer wordsToken = new StringTokenizer(text, " .,!?:;—\n\t"); // Создаём объект класса StringTokenizer для нашей строки и указываем все разделители
        StringBuilder resultText = new StringBuilder(); // Создаём объект класса StringBuilder
        // Выполняем тело цикла, пока есть токены (слова)
        while (wordsToken.hasMoreTokens()) {
            String auxiliaryString = wordsToken.nextToken(); // Помещаем токен (слово) во вспомогательную строку
            char[] arr = auxiliaryString.toCharArray(); // Разбиваем слово на массив символов и помещаем в символьный массив
            resultText.append(arr[arr.length - 1] + " "); // Добавляем последнюю букву слова в объект resultText
        }
        System.out.println(resultText); // Выводим в консоль текст, составленный из последних букв всех слов.
    }
}