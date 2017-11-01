package les04;

/**
 * Created by avg-m on 01/11/2017.
 */
public class Car {
    private  int carID;
    private  String brand;
    private  String model;
    private  int year;
    private  String color;
    private  int price;
    private String regNum;


    public Car(int carID, String brand, String model, int year, String color, int price, String regNum) {
        this.carID = carID;
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.regNum=regNum;
    }
    public String toString(){
        String result="";
        result+=carID+"\t";
        result+=brand+"\t";
        result+=model+"\t";
        result+=year+"\t";
        result+=color+"\t";
        result+="$"+price+"\t";
        result+=regNum;
        return result;
    }
}
