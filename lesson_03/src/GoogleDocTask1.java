/**
 * Начав тренировки, спортсмен в первый день пробежал 10 км.
 * Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
 * Какой суммарный путь пробежит спортсмен за 7 дней?
 */

public class GoogleDocTask1 {

    public static void main(String[] args) {
        int day = 1; // Первый день
        double distance = 10; // Расстояние преодолённое за первый день
        double sumDistance = distance; // Суммарное расстояние за 7 дней
        while (day < 7) { // Выполняем цикл, для подсчёта суммарного расстояния
            distance *= 1.1; // Увеличиваем норму предыдущего дня на 10%
            sumDistance += distance; // Увеличиваем суммарный путь
            day++; // Отсчитываем дни
        }
        System.out.println("Суммарный путь за " + day + " дней: " + sumDistance + " км.");
    }
}