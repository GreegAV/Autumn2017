package les05.Car;

/*
 Создать объект класса Автомобиль, используя класс Колесо. Методы: ехать, заправляться, менять
 колесо, вывести на консоль марку автомобиля.
 */

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите марку авто : ");
        String carBrand=scanner.nextLine();
        System.out.println("Сколько топлива в баке : ");
        double carTank=scanner.nextDouble();
        System.out.println("Введите размер колес : ");
        int wheelRadius=scanner.nextInt();
        System.out.println("Колеса исправны? ");
        boolean wheelsOK=scanner.hasNextBoolean();

        Car car = new Car(carBrand, carTank, wheelRadius, wheelsOK);

        System.out.println("Создана машина марки "+car.modelCar());

        if (car.checkStatus()){
            car.drive();
        }


    }

}
