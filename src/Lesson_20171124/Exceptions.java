package Lesson_20171124;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exceptions {

    public String getNPE(){
        try {
            throw new NullPointerException();
        } catch (NullPointerException e){
            return e.toString();
        }
    }

    public String divideNumbers(int dividend, int divisor) {
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            return e.toString();
        } finally {
            System.out.println("Gotcha!");
        }
    }

    public String divideNumberToZero(int dividend) {
        StringBuilder msg = new StringBuilder();
        try {
            msg.append(String.valueOf(divisionByZero(dividend)));
        }catch (ArithmeticException ex) {
            msg.append(" \nthis exception had been caught: ").append(ex);
        } finally {
            msg.append("\nfinally : this block had been executed");
        }
        return msg.toString();
    }

    private static double division(int dividend, int divisor) {
        return dividend / divisor;
    }

    private static double divisionByZero(int dividend) {
        return dividend / 0;
    }

    public void getOutOfMemoryError(){
        List<Long[]> list = new ArrayList<>();
        Long[] heavyArr = new Long[2_000_00000];
        for (int i = 0; i < 2_000_000; i++) {
            heavyArr[i] = Long.MAX_VALUE;
        }
        while (true) {
            list.add(heavyArr);
        }
    }
}
