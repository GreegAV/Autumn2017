package les04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static les04.Search.brandSearch;
import static les04.Search.modelSearch;
import static les04.Search.yearSearch;

/**
 * Created by avg-m on 01/11/2017.
 */
public class Runner {


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

        ArrayList<Car> brandList = brandSearch(brandSearch, carList);
        ArrayList<Car> modelList = modelSearch(modelSearch, ageSearch, carList);
        ArrayList<Car> yearList = yearSearch(yearSearch, priceSearch, carList);

        for (Car findedCar : brandList) {
            System.out.println("Find " + brandSearch);
            System.out.println(findedCar.toString());
        }

        for (Car findedCar : modelList) {
            System.out.println("Find " + modelSearch + " older than " + ageSearch + " years.");
            System.out.println(findedCar.toString());
        }

        for (Car findedCar : yearList) {
            System.out.println("Find year " + yearSearch + " with price more than " + priceSearch);
            System.out.println(findedCar.toString());
        }

    }

    private static Car genCars(int numCar) {
        Car car = new Car(numCar, "Vaz", "Aveo", 2000, "Red", 10000, "AA1111AA");
        return car;
    }


}
