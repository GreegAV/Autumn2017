package les04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by avg-m on 01/11/2017.
 */
public class Runner {

    public static void brandSearch(String brand, ArrayList<Car> carList){
        for (Car carT:carList) {
            if(true) {
                System.out.println(carT.toString());
            }
        }

        System.out.println("brandsearchmethod");
    }

    public static  void modelSearch (String model, int age, ArrayList<Car> carList){
        System.out.println("modelsearchmethod");
    }

    public static void yearSearch (int year, int price, ArrayList<Car> carList) {
        System.out.println("yearsearchmethod");
    }

    public static void main(String[] args) {
        int numCar=1;
        ArrayList<Car>carList = new ArrayList<>();
        carList.add(genCars(numCar));

        Scanner scn = new Scanner(System.in);
        System.out.println("Brand for searching: ");
        String brandSearch=scn.nextLine();
        System.out.println("Model for searching: ");
        String modelSearch=scn.nextLine();
        System.out.println("Age for searching: ");
        int ageSearch=scn.nextInt();
        System.out.println("Year for searching: ");
        int yearSearch=scn.nextInt();
        System.out.println("Price for searching: ");
        int priceSearch=scn.nextInt();

        brandSearch(brandSearch, carList);
        modelSearch(modelSearch,ageSearch,carList);
        yearSearch(yearSearch,priceSearch,carList);


    }

    private static Car genCars(int numCar) {
        Car car = new Car(numCar,"Chevrolet", "Aveo", 2000, "Red", 10000, "AA1111AA");
        numCar++;
        return car;
    }


}
