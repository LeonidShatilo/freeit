/**
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
 * таким образом:
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 */

public class StudyGuideTask17 {

    public static void main(String[] args) {
        int array[][] = new int[5][5]; // Создаём двумерный квадратный массив размерностью 5х5
        int i, j;
        for (i = 0; i < array.length / 2 + 1; i++) { // Выполняем цикл для заполнения верхнего треугольника
            for (j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= (array[i].length - i))) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        for (i = array.length - 1; i >= array.length / 2; i--) { // Выполняем цикл для заполнения нижнего треугольника
            for (j = 0; j < array[i].length; j++) {
                if ((j < (array[i].length - 1 - i)) || (j > i)) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        for (i = 0; i < array.length; i++) { // Вывод итогового массива в консоль
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}