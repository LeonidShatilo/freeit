/**
 * Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
 * А) минут + секунд,
 * В) часов + минут + секунд,
 * С) дней + часов + минут + секунд,
 * D) недель + дней + часов + минут + секунд.
 */

public class StudyGuideTask3 {

    public static void main(String[] args) {
        int s = 4500;
        int seconds = s % 60;
        int m = (s - seconds) / 60;
        int minutes = m % 60;
        int h = (m - minutes) / 60;
        int hours = h % 24;
        int d = (h - hours) / 24;
        int days = d % 7;
        int w = (d - days) / 7;
        System.out.println(m + " минут " + seconds + " секунд");
        System.out.println(h + " часов " + minutes + " минут " + seconds + " секунд");
        System.out.println(d + " дней " + hours + " часов " + minutes + " минут " + seconds + " секунд");
        System.out.println(w + " недель " + days + " дней " + hours + " часов " + minutes + " минут " + seconds + " секунд");
    }
}