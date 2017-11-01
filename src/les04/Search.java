package les04;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by avg-m on 01/11/2017.
 */
public class Search {
    static ArrayList<Car> brandSearch(String brand, ArrayList<Car> carList) {
        ArrayList<Car> brandList = new ArrayList<>();
        for (Car carT : carList)
            if ( carT.getBrand().toLowerCase().equals(brand.toLowerCase()) ) {
                brandList.add(carT);
            }
        return brandList;
    }

    static ArrayList<Car> modelSearch(String model, int age, ArrayList<Car> carList) {
        ArrayList<Car> modelList = new ArrayList<>();
        for (Car carT : carList)
            if ( (carT.getModel().toLowerCase().equals(model.toLowerCase()) &&
                    (LocalDateTime.now().getYear() - carT.getYear()) > age) ) {
                modelList.add(carT);
            }
        return modelList;
    }

    static ArrayList<Car> yearSearch(int year, int price, ArrayList<Car> carList) {
        ArrayList<Car> yearList = new ArrayList<>();
        for (Car carT : carList)
            if ( carT.getYear() == year && carT.getPrice() == price ) {
                yearList.add(carT);
            }
        return yearList;
    }
}
