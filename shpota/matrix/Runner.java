package com.shpota.matrix;

public class Runner {
    public static void main(String[] args) {
        int vertical = 3;
        int horizontal = 4;
        Matrix a = createRandomMatrix(vertical, horizontal);
        Matrix b = createRandomMatrix(vertical, horizontal);
        Matrix sum = Summator.sum(a, b);

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("Sum: " + sum);
    }

    private static Matrix createRandomMatrix(int vertical, int horizontal) {
        Matrix a = MatrixFactory.createMatrix(vertical, horizontal);
        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                a.setElement(i, j, (int) (Math.random() * 100));
            }
        }
        return a;
    }
}
