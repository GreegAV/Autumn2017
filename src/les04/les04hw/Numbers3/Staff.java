package les04.les04hw.Numbers3;

import java.util.Scanner;

public class Staff {

    public static int sumDepo(){
        return new Scanner(System.in).nextInt();
    }

    public static double percentNum(){
        return new Scanner(System.in).nextInt();
    }

    public static int desiredSum(){
        return new Scanner(System.in).nextInt();
    }

    public static int timeDeposit(int sumDepo, double percentNum, int desiredSum){
        int time=0;
        double monthRevenue;
        double finDepo=sumDepo;
        if (sumDepo>desiredSum) {
            System.out.println("Депозит УЖЕ больше желаемого!");
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
