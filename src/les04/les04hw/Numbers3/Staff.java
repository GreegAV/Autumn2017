package les04.les04hw.Numbers3;

import java.util.Scanner;

public class Staff {

    public static int sumDepo(){
        int sumDepo=new Scanner(System.in).nextInt();
        while (sumDepo<=0) {
            System.out.println("Депозит должен быть положительным числом!.");
            sumDepo=new Scanner(System.in).nextInt();
        }
        return sumDepo;
    }

    public static double percentNum(){
        int percentNum=new Scanner(System.in).nextInt();
        while (percentNum<=0) {
            System.out.println("Величина процентов должна быть положительным числом!.");
            percentNum=new Scanner(System.in).nextInt();
        }
        return percentNum;
    }

    public static int desiredSum(){
        int desiredSum=new Scanner(System.in).nextInt();
        while (desiredSum<=0) {
            System.out.println("Желаемая сумма должна быть положительным числом!.");
            desiredSum=new Scanner(System.in).nextInt();
        }
        return desiredSum;
    }

    public static int timeDeposit(int sumDepo, double percentNum, int desiredSum){
        int time=0;
        double monthRevenue;
        double finDepo=sumDepo;
        if (sumDepo>=desiredSum) {
            System.out.println("И зачем вам депозит?");
            return 0;
        }
        do {
            monthRevenue=(sumDepo*percentNum/100.0)/12.0;
            finDepo+=monthRevenue;
            time++;
        } while (finDepo<desiredSum);

        return time;
    }

}
