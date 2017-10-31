package third;

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

    private int[][] matr;

    Matrix(int horSize, int vertSize) {
        matr = new int[horSize][vertSize];
    }

    public int getElement(int horSize, int vertSize) {
        return matr[horSize][vertSize];
    }

    public void setElement(int horSize, int vertSize, int item) {
        matr[horSize][vertSize] = item;
    }

    public int getVerticalSize() {
        return matr.length;
    }

    public int getHorizontalSize() {
        return matr[0].length;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                result = result + matr[i][j] + " ";
            }
            result = result + "\n";
        }
        return result;
    }
}


}