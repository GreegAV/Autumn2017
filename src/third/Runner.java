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

        System.out.println("Введите горизонтальный размер матрицы: ");
        int horSize = scn.nextInt();

        System.out.println("Введите вертикальный размер матрицы: ");
        int vertSize = scn.nextInt();

        System.out.println("Матрица  1:");

        Matrix matr1 = MatrixFactory.createMatrix(horSize, vertSize);

        System.out.println(matr1.toString());
        System.out.println("Матрица 2:");

        Matrix matr2 = MatrixFactory.createMatrix(horSize, vertSize);

        System.out.println(matr2.toString());
//
        System.out.println("Горизонтальный размер: " + matr1.getHorizontalSize());
        System.out.println("Вертикальный размер: " + matr1.getVerticalSize());

        System.out.println("Получение элемента по номеру строки и столбца");

        boolean rightChoice = false;
        int numCol, numRaw;

        do {
            System.out.println("Введите номер строки :");
            numRaw = scn.nextInt();
            if ((numRaw > 0) && (numRaw - 1 < matr1.getHorizontalSize())) {
                rightChoice = true;
            } else System.out.println("Введите число больше нуля и меньшее, чем горизонтальный размер матрицы");
        } while (!rightChoice);

        rightChoice = false;

        do {
            System.out.println("Введите номер столбца :");
            numCol = scn.nextInt();
            if ((numCol > 0) && (numCol - 1 < matr1.getVerticalSize())) {
                rightChoice = true;
            } else System.out.println("Введите число больше нуля и меньшее, чем вертикальный размер матрицы");
        } while (!rightChoice);


        System.out.println("Получение элемента: " + matr1.getElement(numRaw - 1, numCol - 1));
//
//        matr1.setElement(1, 1, 55);
//
//        System.out.println(matr1.toString());
//
//        Matrix sumMatrix = Summator.sum(matr1, matr2);
//
//        if (sumMatrix != null) {
//            System.out.println("Сумма: ");
//            System.out.println(sumMatrix.toString());
//        }
    }
}
