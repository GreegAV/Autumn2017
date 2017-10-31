package third;

/**
 * Created by avg-m on 30/10/2017.
 */
public class Summator {
/*
суммирует две матрицы и возвращает результирующую матрицу
- проверить на совпаlение размеров суммируемых матриц
При несовпадении размеров ничего не делаем и выдаем сообщение пользователю.
 */
    public static Matrix sum(Matrix firstMatrix, Matrix secondMatrix) {
        if ((firstMatrix.getVerticalSize() == secondMatrix.getVerticalSize()) & (firstMatrix.getHorizontalSize() == secondMatrix.getHorizontalSize())) {
            Matrix matrix = new Matrix(firstMatrix.getVerticalSize(), firstMatrix.getHorizontalSize());
            for (int i = 0; i < firstMatrix.getVerticalSize(); i++) {
                for (int j = 0; j < firstMatrix.getHorizontalSize(); j++) {
                    int sum = firstMatrix.getElement(i, j) + secondMatrix.getElement(i, j);
                    matrix.setElement(i, j, sum);
                }
            }
            return matrix;
        } else {
            System.out.println("Матрицы разного размера");
            return null;
        }
    }
}
}

