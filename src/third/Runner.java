package third;

/**
 * Created by avg-m on 30/10/2017.
 */
public class Runner {
    /*
    запускает Создание матрицы указанного размера
    размер задается статически
    - как вариант доработать ввод размерности матрицы с клавиатуры
     */
    public static void main(String[] args) {
        int horSize = 3;
        int vertSize = 4;
        System.out.println("Матрица  1:");

        Matrix matr1 = MatrixFactory.createMatrix(horSize, vertSize);

        System.out.println(matr1.toString());
        System.out.println("Матрица 2:");

        Matrix matr2 = MatrixFactory.createMatrix(horSize, vertSize);

        System.out.println(matr2.toString());

        System.out.println("Вертикальный размер" + matr1.getVerticalSize());
        System.out.println("Горизонтальный размер: " + matr1.getHorizontalSize());
        System.out.println("Получение элемента: " + matr1.getElement(1, 2));

        matr1.setElement(1, 1, 55);

        System.out.println(matr1.toString());

        Matrix sumMatrix = Summator.sum(matr1, matr2);

        if (sumMatrix != null) {
            System.out.println("Сумма: ");
            System.out.println(sumMatrix.toString());
        }
    }
}
