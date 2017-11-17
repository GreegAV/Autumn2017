package les03;

/**
 * Created by avg-m on 30/10/2017.
 */
public class Summator {
    /*
    суммирует две матрицы и возвращает результирующую матрицу
    - проверить на совпадение размеров суммируемых матриц
    При несовпадении размеров ничего не делаем и выдаем сообщение пользователю.
     */
    public static Matrix sum(Matrix matr1, Matrix matr2) {
        if ((matr1.getVerticalSize() == matr2.getVerticalSize()) && (matr1.getHorizontalSize() == matr2.getHorizontalSize())) {
            Matrix matrRes = new Matrix(matr1.getVerticalSize(), matr1.getHorizontalSize());
            for (int i = 0; i < matr1.getVerticalSize(); i++) {
                for (int j = 0; j < matr1.getHorizontalSize(); j++) {
                    int sum = matr1.getElement(i, j) + matr2.getElement(i, j);
                    matrRes.setElement(i, j, sum);
                }
            }
            return matrRes;
        } else {
            System.out.println("Матрицы разного размера");
            return null;
        }
    }
}


