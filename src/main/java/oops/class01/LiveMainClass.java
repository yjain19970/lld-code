package oops.class01;

public class LiveMainClass {

    public static void main(String[] args) {
        Car hondaCity = new Car();
        hondaCity.carName = "HondaCity";
        hondaCity.fuelType = "petrol";
        hondaCity.color = "black";

        Car tesla  = new Car();
        tesla.carName = "tesla";
        tesla.fuelType = "petrol";
        tesla.color = "white";

        System.out.println(hondaCity.carName);
        System.out.println(hondaCity.fuelType);
        System.out.println(hondaCity.color);
        hondaCity.startEngine();
        hondaCity.applyBreaks();
        hondaCity.runningInfotainment();

        System.out.println(tesla.carName);
        System.out.println(tesla.fuelType);
        System.out.println(tesla.color);
    }
}
