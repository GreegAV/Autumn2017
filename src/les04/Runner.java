package les04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by avg-m on 01/11/2017.
 */
public class Runner {

    private static void brandSearch(String brand, ArrayList<Car> carList) {
        for (Car carT : carList)
            if ( carT.getBrand().equals(brand) ) {
                System.out.println("Find " + brand);
                System.out.println(carT.toString());
            }
    }

    private static void modelSearch(String model, int age, ArrayList<Car> carList) {
        for (Car carT : carList)
            if ( carT.getModel().toLowerCase().equals(model) ) {
                if ( LocalDateTime.now().getYear() - carT.getYear() > age ) {
                    System.out.println("Find " + model + " older than " + age + " years.");
                    System.out.println(carT.toString());
                }
            }
    }

    private static void yearSearch(int year, int price, ArrayList<Car> carList) {
        for (Car carT : carList)
            if ( carT.getYear() == year && carT.getPrice() == price ) {
                System.out.println("Find year " + year + " with price more than " + price);
                System.out.println(carT.toString());
            }
    }

    public static void main(String[] args) {

        int numCar = 1;
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(genCars(numCar));
        // TODO car generating

        Scanner scn = new Scanner(System.in);
        System.out.println("Brand for searching: ");
        String brandSearch = scn.nextLine();
        System.out.println("Model for searching: ");
        String modelSearch = scn.nextLine();
        System.out.println("Age for searching: ");
        int ageSearch = scn.nextInt();
        System.out.println("Year for searching: ");
        int yearSearch = scn.nextInt();
        System.out.println("Price for searching: ");
        int priceSearch = scn.nextInt();

        brandSearch(brandSearch, carList);
        modelSearch(modelSearch, ageSearch, carList);
        yearSearch(yearSearch, priceSearch, carList);


    }

    private static Car genCars(int numCar) {
        Car car = new Car(numCar, "Chevrolet", "Aveo", 2000, "Red", 10000, "AA1111AA");
        return car;
    }


}
