/**
 * Напишите три цикла выполняющих многократное сложение строк, один с
 * помощью оператора сложения и String, другой с помощью StringBuilder и метода
 * append, а также аналогично для StringBuffer. Сравните скорость их выполнения.
 */

public class StudyGuideTask21 {

    public static void main(String[] args) {
        String string = ""; // Создаём пустую строку
        StringBuilder stringBuilder = new StringBuilder(); // Создаём объект класса String Builder
        StringBuffer stringBuffer = new StringBuffer(); // Создаём объект класса String Buffer

        //Многократное сложение строк с помощью оператора сложения
        long startTime1 = System.currentTimeMillis(); // Задаём точное время начала цикла сложения строк
        for (int i = 0; i < 100000; i++) {
            string += "WOW!";
        }
        long endTime1 = System.currentTimeMillis(); // Задаём точное время окончания цикла сложения строк
        System.out.println("Время, затраченное на сложение с помощью оператора сложения: " + (endTime1 - startTime1) + " миллисекунд.");

        //Многократное сложение строк с помощью StringBuilder и метода append
        long startTime2 = System.currentTimeMillis(); // Задаём точное время начала цикла сложения строк
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append("WOW!");
        }
        long endTime2 = System.currentTimeMillis(); // Задаём точное время окончания цикла сложения строк
        System.out.println("Время, затраченное на сложение с помощью String Builder: " + (endTime2 - startTime2) + " миллисекунд.");

        //Многократное сложение строк с помощью StringBuffer и метода append
        long startTime3 = System.currentTimeMillis(); // Задаём точное время начала цикла сложения строк
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append("WOW!");
        }
        long endTime3 = System.currentTimeMillis(); // Задаём точное время окончания цикла сложения строк
        System.out.println("Время, затраченное на сложение с помощью String Buffer: " + (endTime3 - startTime3) + " миллисекунд.");
    }
}