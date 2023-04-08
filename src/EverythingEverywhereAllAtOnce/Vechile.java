package EverythingEverywhereAllAtOnce;

import java.util.Scanner;

public class Vechile {
    private Brand brand;
    private String model;
    private String gear_type;

    private double daily_price;


    public Vechile(Brand brand, String model, String gear_type) {
        this.brand = brand;
        this.model = model;
        setGear_type(gear_type);
       setDaily_price();
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGear_type() {
        return gear_type;
    }

    public void setGear_type(String gear_type) {
        while (true){
            if ( gear_type.equalsIgnoreCase("auto") || gear_type.equalsIgnoreCase("manual")){
                this.gear_type = gear_type;
                break;
            }
            else{
                System.out.println("please enter a valid value those are \n1.auto\n2.manual");
                Scanner scan = new Scanner(System.in);
                gear_type = scan.next();
            }
        }

    }

    public double getDaily_price() {
        return daily_price;
    }

    public void setDaily_price() {
        this.daily_price = 100;
    }
}
