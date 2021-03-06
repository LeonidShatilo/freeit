/**
 * Найти в строке не только запятые, но и другие знаки препинания.
 * Подсчитать общее их количество.
 */

public class StudyGuideTask18 {

    public static void main(String[] args) {
        String sentence = "Раз, два, три! «Четыре: пять – шесть.» Семь; восемь (девять), десть?"; // Создаём строку и заполняем её текстом со знаками препинания
        int counter = 0; // Счётчик
        char symbol; // Переменная, которая будет содержать символы для сравнения
        for (int i = 0; i < sentence.length(); i++) { // Выполняем тело цикла до тех пор, пока не дойдём до конца строки
            symbol = sentence.charAt(i); // Возвращаем символ, расположенный по указанному индексу строки
            // Если символ идентичен любому из знаков препинания, то подсчитываем его
            if (symbol == '.' || symbol == ',' || symbol == '?' || symbol == '!' ||
                symbol == ':' || symbol == ';' || symbol == '–' || symbol == '(' ||
                symbol == ')' || symbol == '«' || symbol == '»') {
                counter++;
            }
        }
        System.out.println("В предложении " + counter + " знаков препинания"); // Вывод результата в консоль
    }
}