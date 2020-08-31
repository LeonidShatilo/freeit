package StudyGuideTask24;

public class TimeLapse {

    private int seconds;
    private int minutes;
    private int hours;

    public TimeLapse(int seconds) { // Конструктор, который получает общее количество секунд
        this.seconds = seconds;
    }

    public TimeLapse(int seconds, int minutes, int hours) { // Конструктор, который получает секунды, минуты и часы по отдельности
        this.seconds = seconds % 60;
        this.minutes = minutes % 60 + (seconds / 60);
        this.hours = hours + (minutes / 60) + (seconds / 3600);
    }

    public int getNumberOfSeconds() { // Метод, который возвращает общее количество секунд
        return getSeconds() + getMinutes() * 60 + getHours() * 3600;
    }

    public String compareTo(TimeLapse time) { // Метод для сравнения двух промежутков времени
        int firstTimeLapse = getNumberOfSeconds();
        int secondTimeLapse = time.getNumberOfSeconds();
        if (firstTimeLapse == secondTimeLapse) {
            return "Промежутки времени равны.";
        } else if (firstTimeLapse > secondTimeLapse) {
            return "Первый промежуток времени больше второго.";
        } else {
            return "Второй промежуток времени больше первого.";
        }
    }

    public void printTime() { // Метод для вывода данных
        System.out.println(getHours() + " часов " + getMinutes() + " минут " + getSeconds() + " секунд = " + getNumberOfSeconds() + " секунд");
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }
}