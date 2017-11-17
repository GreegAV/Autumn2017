package Lesson_20171030;

/**
 * Created by avg-m on 30/10/2017.
 */
public class Matrix {

    /*
-arr[][] (конструктор создает матрицу размера заданного в раннере)

+ getElement (int, int) возвращает элемент по заданным координатам
+ setElement (int, int, int) устанавливает значение элемента по заданным координатам
+getVerticalSize() возвращает вертикальный размер
+getHorisontalSize() возвращает горизонтальный размер
+toString() возвращает строковое значение матрицы
*/

    private int[][] arr;

    Matrix(int horSize, int vertSize) {
        arr = new int[horSize][vertSize];
    }

    public int getElement(int horSize, int vertSize) {
        return arr[horSize][vertSize];
    }

    public void setElement(int horSize, int vertSize, int item) {
        arr[horSize][vertSize] = item;
    }

    public int getVerticalSize() {
        return arr[0].length;
    }

    public int getHorizontalSize() {
        return arr.length;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < getVerticalSize(); i++) {
            for (int j = 0; j < getHorizontalSize(); j++) {
                result = result + arr[j][i] + " ";
            }
            result = result + "\n";
        }
        return result;
    }
}


