package tasksDay40.device;

public class Device {

    private String brand;
    private String model;
    private int price;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String brand, String model, int price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        if(brand == null){
            System.err.println("Error");
            System.exit(0);
        }
    }

    public void setModel(String model) {
        this.model = model;

        if(model == null){
            System.err.println("Error");
            System.exit(0);
        }
    }

    public void setPrice(int price) {
        this.price = price;

        if(price <= 0){
            System.err.println("Error");
            System.exit(0);
        }
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){
        System.out.println(getBrand()+" "+getModel()+ " is turning on");
    }

    public void turnOff(){
        System.out.println(getBrand()+" "+getModel()+ " is turning off");
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
