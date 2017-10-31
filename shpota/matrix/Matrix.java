package com.shpota.matrix;

public class Matrix {
    private int[][] array;

    public Matrix(int vetrical, int horizontal) {
        array = new int[vetrical][horizontal];
    }

    public int getElement(int x, int y) {
        return array[x][y];
    }

    public void setElement(int x, int y, int element) {
        array[x][y] = element;
    }

    public int getVerticalSize() {
        return array.length;
    }

    public int getHorizontalSize() {
        return array[0].length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{\n");
        int verticalSize = getVerticalSize();
        int horizontalSize = getHorizontalSize();
        for (int i = 0; i < verticalSize; i++) {
            for (int j = 0; j < horizontalSize; j++) {
                stringBuilder.append(getElement(i, j)).append(", ");
            }
            stringBuilder.append("\n");
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
