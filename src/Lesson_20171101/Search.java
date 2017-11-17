package Lesson_20171101;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by avg-m on 01/11/2017.
 */
public class Search {
    public static ArrayList<Car> brandSearch(String brand, ArrayList<Car> carList) {
        ArrayList<Car> brandList = new ArrayList<>();
        for (Car carT : carList)
            if ( carT.getBrand().toLowerCase().equals(brand.toLowerCase()) ) {
                brandList.add(carT);
            }
        return brandList;
    }

    public static ArrayList<Car> modelSearch(String model, int age, ArrayList<Car> carList) {
        ArrayList<Car> modelList = new ArrayList<>();
        for (Car carT : carList)
            if ( (carT.getModel().equalsIgnoreCase(model)) &&
                    (LocalDateTime.now().getYear() - carT.getYear() > age) ) {
                modelList.add(carT);
            }
        return modelList;
    }

    public static ArrayList<Car> yearSearch(int year, int price, ArrayList<Car> carList) {
        ArrayList<Car> yearList = new ArrayList<>();
        for (Car carT : carList)
            if ( carT.getYear() == year && carT.getPrice() == price ) {
                yearList.add(carT);
            }
        return yearList;
    }
}
