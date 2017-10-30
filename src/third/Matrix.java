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

    private int horSize=3;
    private int vertSize=4;


    public Matrix Matrix(int horSize, int vertSize) {
        this.horSize = horSize;
        this.vertSize = vertSize;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}