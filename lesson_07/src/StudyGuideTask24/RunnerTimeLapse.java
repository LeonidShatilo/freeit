package StudyGuideTask24;

/**
 * Создать класс и объекты, описывающие промежуток времени.
 * Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
 * (метод должен работать аналогично compareTo в строках).
 * Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
 * Сделать метод для вывода данных.
 */

public class RunnerTimeLapse {

    public static void main(String[] args) {
        TimeLapse firstPeriod = new TimeLapse(2542);
        TimeLapse secondPeriod = new TimeLapse(425,72,3);
        firstPeriod.printTime();
        secondPeriod.printTime();
        System.out.println(firstPeriod.compareTo(secondPeriod));
    }
}