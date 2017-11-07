package les05.Car;
/*
Методы: ехать, заправляться, менять
 колесо, вывести на консоль марку автомобиля.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Car {
    private String model;
    private double tank;
    private ArrayList<Wheel> wheels = new ArrayList<>();
    private boolean driving;

    public Car(String model, double tank, int wheelRadius, boolean wheelsOK) {
        this.model = model;
        if (tank>50) {
            System.out.println("Столько топлива в бак не влезет. Просто заполняю до полного. ");
            tank=50.0;
        }
        this.tank=(tank>0)?tank:0;

        for (int i=0;i<4;i++) {
            wheels.add(new Wheel(wheelRadius,wheelsOK));
        }
        this.driving = false;

    }

    public boolean isOkWheels() {
        for (Wheel wheel:wheels) {
            if (!wheel.isOkStatus()) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.modelCar();
    }

    public Car() {
        model = "Undefined";
        tank = 0;
        for (Wheel wheel:wheels) {
            wheels.add(new Wheel(14, true));
        }
        driving = false;


    }

    public void drive() {
        if (isDriving()) {
            System.out.println("И так уже едем :)");
        } else {
            System.out.println("Поехали!");
            this.driving = true;
        }
    }

    public boolean isDriving() {
        return this.driving;
    }

    public void fillCar(double fillLiters) {
        if ((50.0 - this.tank) < fillLiters) {
            System.out.println("В бак столько не влезет. Заливаю до полного.");
            this.tank=50.0;

        } else {
            this.tank += fillLiters;
        }

    }

    boolean hasFuel() {
        return (this.tank < 10) ? false : true;
    }


    public void changeWheel() {
        for (int i = 0; i <wheels.size() ; i++) {
            Wheel wheel=wheels.get(0);
            wheels.remove(0);
            wheel.setOkStatus(true);
            wheels.add(wheel);
        }
        System.out.println("Проверяем и меняем колеса");

    }

    public String modelCar() {
        return this.model;
    }

    public boolean checkStatus() {
        if (this.hasFuel()) {
            System.out.println("Топлива достаточно.");
        } else {
            System.out.println("С таким запасом топлива далеко не уехать. Сколько залить топлива?");

            this.fillCar(new Scanner(System.in).nextDouble());
        }

        if (!this.isOkWheels()) {
            System.out.println("На таких колесах далеко не уедешь");
            this.changeWheel();
        }

        return true;

    }
}
