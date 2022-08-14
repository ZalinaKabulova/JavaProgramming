package tasksDay40.device;

public class Phone extends Device {

    public Phone(String brand, String model, int price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void call(){
        System.out.println(getBrand()+" "+ getModel()+" is calling +77771803035");
    }

    public void text(){
        System.out.println(getBrand()+" "+ getModel()+" is texting +77771803035");
    }

}
