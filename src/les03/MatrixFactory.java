package les03;

/**
 * Created by avg-m on 30/10/2017.
 */
public class MatrixFactory {
    /*
    создает матрицу указанного размера и возвращает её
    на вход конструктора получает размерность матрицы


     */
    public static Matrix createMatrix(int horSize, int vertSize) {
        Matrix newMatr = new Matrix(horSize, vertSize);

        for (int i = 0; i < horSize; i++) {
            for (int j = 0; j < vertSize; j++) {
                newMatr.setElement(i, j, Integer.valueOf(Integer.toString(i + 1) + Integer.toString(j + 1)));
            }
        }
        return newMatr;
    }
}

