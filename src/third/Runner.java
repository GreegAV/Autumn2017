package third;

import java.util.Scanner;

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

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите горизонтальный размер первой матрицы: ");
        int horSize1 = scn.nextInt();

        System.out.println("Введите вертикальный размер первой матрицы: ");
        int vertSize1 = scn.nextInt();

        Matrix matr1 = MatrixFactory.createMatrix(horSize1, vertSize1);
        System.out.println("Матрица  1:");
        System.out.println(matr1.toString());

        System.out.println("Введите горизонтальный размер второй матрицы: ");
        int horSize2 = scn.nextInt();

        System.out.println("Введите вертикальный размер второй матрицы: ");
        int vertSize2 = scn.nextInt();

        Matrix matr2 = MatrixFactory.createMatrix(horSize2, vertSize2);
        System.out.println("Матрица 2:");
        System.out.println(matr2.toString());

        System.out.println("Горизонтальный размер первой матрицы: " + matr1.getHorizontalSize());
        System.out.println("Вертикальный размер первой матрицы: " + matr1.getVerticalSize());

        System.out.println("Горизонтальный размер второй матрицы: " + matr2.getHorizontalSize());
        System.out.println("Вертикальный размер второй матрицы: " + matr2.getVerticalSize());

        System.out.println("Получение элемента по номеру строки и столбца в первой матрице");


        int numRaw = getNumRaw(scn, matr1);
        int numCol = getNumCol(scn, matr1);

        System.out.println("Искомый элемент: " + matr1.getElement(numRaw - 1, numCol - 1) + "\n");

        System.out.println("Установка элемента матрицы");
        int numRawSet = getNumRaw(scn, matr1);
        int numColSet = getNumCol(scn, matr1);
        System.out.println("Введите элемент для вставки :");
        int insElement = scn.nextInt();

        matr1.setElement(numColSet - 1, numRawSet - 1, insElement);

        System.out.println("Результат вставки: ");
        System.out.println(matr1.toString());

        Matrix sumMatrix = Summator.sum(matr1, matr2);

        if (sumMatrix != null) {
            System.out.println("Сумма: ");
            System.out.println(sumMatrix.toString());
        }
    }

    private static int getNumCol(Scanner scn, Matrix matr1) {
        boolean rightChoice;
        int numCol;
        do {
            rightChoice = false;
            System.out.println("Введите номер столбца :");
            numCol = scn.nextInt();
            if ((numCol > 0) && (numCol - 1 < matr1.getHorizontalSize())) {
                rightChoice = true;
            } else System.out.println("Введите число больше нуля и меньшее, чем горизонтальный размер матрицы");
        } while (!rightChoice);
        return numCol;
    }

    private static int getNumRaw(Scanner scn, Matrix matr1) {
        boolean rightChoice;
        int numRaw;
        do {
            rightChoice = false;
            System.out.println("Введите номер строки :");
            numRaw = scn.nextInt();
            if ((numRaw > 0) && (numRaw - 1 < matr1.getVerticalSize())) {
                rightChoice = true;
            } else System.out.println("Введите число больше нуля и меньшее, чем вертикальный размер матрицы");
        } while (!rightChoice);
        return numRaw;
    }
}
