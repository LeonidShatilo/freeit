/**
 * Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.
 */

public class StudyGuideTask14 {

    public static void main(String[] args) {
        int [] mark = {7, 10, 8, 6, 9};
        int minIndex = 0;
        int maxIndex = 0;
        int min = mark[0], max = mark[0];
        for (int i = 0; i < mark.length; i++) { // Выполняем цикл для нахождения наименьшего числа содержащегося в массиве
            if (mark[i] < min) {
                min = mark[i];
                minIndex = i;
            }
        }
        System.out.println("Минимальная оценка: " + min);
        System.out.println("Индекс минимальной оценки: " + minIndex);
        for (int i = 0; i < mark.length; i++) { // Выполняем цикл для нахождения наибольшего числа содержащегося в массиве
            if (mark[i] > max) {
                max = mark[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальная оценка: " + max);
        System.out.println("Индекс максимальной оценки: " + maxIndex);
    }
}