package les05.Car;
/*
Методы: ехать, заправляться, менять
 колесо, вывести на консоль марку автомобиля.
 */

public class Car {
    private String model;
    private String brand;
    private String color;
    private int speed;
    private double tank;
    private Wheel wheels[]=new Wheel[4];
    private int wheelRadius;
    private boolean driving;
    private boolean okWheels;

    public Car(String brand, String model, String color, int speed, double tank, int wheelRadius, boolean wheelsOK) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.tank = tank;
        for (Wheel wheel : wheels) {
            wheel = new Wheel(wheelRadius);
        }
        this.driving=false;
        this.okWheels=wheelsOK;

    }
    public boolean isOkWheels(){
        return this.okWheels;
    }
    @Override
    public String toString() {
        return this.modelCar();
    }

    public Car() {
        model = "Undefined";
        brand = "Undefined";
        color = "Undefined";
        speed = 0;
        tank = 0;
        wheelRadius = 14;
        driving=false;

    }

    public void drive(){
        if (isDriving()) {
            System.out.println("И так уже едем :)");
        } else {
            System.out.println("Поехали!");
            this.driving=true;
        }
    }

    public boolean isDriving(){
        return this.driving;
    }

    public void fillCar(double fillLiters) {
        if ((50.0 - this.tank) < fillLiters) {
            System.out.println("В бак столько не влезет.");
        } else {
            this.tank += fillLiters;
        }

    }

    boolean hasFuel() {
        return (this.tank < 1) ? false : true;
    }


    public void changeWheel() {
        System.out.println("Меняем колесо");
    }

        public String modelCar() {
        return this.model;
    }
}
