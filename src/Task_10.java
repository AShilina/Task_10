/*
Произведите ввод данных с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
*/
import java.util.Scanner; // импорт сканера

public class Task_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            // пользователь задает количество строк и столбцов матрицы
        System.out.println("Задайте количество строк матрицы:");
        int line_num = in.nextInt();
        System.out.println("Задайте количество столбцов матрицы:");
        int column_num = in.nextInt();

        int[][] myList = new int[line_num][column_num];

            //ввод данных в матрицу
        for (int i = 0; i < myList.length; i++)  // идем по строкам
        {
            for (int j = 0; j < myList[0].length; j++) // идем по столбцам
            {
                System.out.println("Введите значение для строки " + i + ", столбца " + j);
                myList[i][j] = in.nextInt();
            }
        }

        System.out.println("Элементы первой строки матрицы, умноженные на три:");
        for (int x = 0; x < myList[0].length; x++) // идем по первой строке
        {
            System.out.println("Столбец " + x + ": " + myList[0][x] * 3);
        }
    }
}