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

//    private static ArrayList<Car> brandSearch(String brand, ArrayList<Car> carList) {
//        ArrayList<Car> brandList = new ArrayList<>();
//        for (Car carT : carList)
//            if ( carT.getBrand().toLowerCase().equals(brand.toLowerCase()) ) {
//                brandList.add(carT);
//            }
//        return brandList;
//    }
//
//    private static ArrayList<Car> modelSearch(String model, int age, ArrayList<Car> carList) {
//        ArrayList<Car> modelList = new ArrayList<>();
//        for (Car carT : carList)
//            if ( (carT.getModel().toLowerCase().equals(model.toLowerCase()) &&
//                 (LocalDateTime.now().getYear() - carT.getYear()) > age) ) {
//                modelList.add(carT);
//            }
//        return modelList;
//    }
//
//    private static ArrayList<Car> yearSearch(int year, int price, ArrayList<Car> carList) {
//        ArrayList<Car> yearList = new ArrayList<>();
//        for (Car carT : carList)
//            if ( carT.getYear() == year && carT.getPrice() == price ) {
//                yearList.add(carT);
//            }
//        return yearList;
//    }

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
