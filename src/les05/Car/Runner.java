package les05.Car;

/*
 Создать объект класса Автомобиль, используя класс Колесо. Методы: ехать, заправляться, менять
 колесо, вывести на консоль марку автомобиля.
 */

public class Runner {
    public static void main(String[] args) {
        Car car = new Car("Daewoo", "Lanos", "Red", 50, 25.0, 15, true);
        if (car.hasFuel()) {
            car.drive();
        } else {
            car.fillCar(10);
        }
        if (!car.isOkWheels()) {
            car.changeWheel();
        }

    }

}
