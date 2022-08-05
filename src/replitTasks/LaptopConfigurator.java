package replitTasks;
import java.util.Scanner;


public class LaptopConfigurator {
    public static void main(String[] args){


    Scanner scan = new Scanner(System.in);

    int lapTopPrice = 0;

    System.out.println("Select screen size:");
    double size = scan.nextDouble();

    System.out.println("Select CPU type:");
    String iType = scan.next();

    System.out.println("Select RAM size:");
    String ramSize = scan.next();

    System.out.println("Select storage type:");
    String storageType = scan.next();

    System.out.println("Enter memory size:");
    int memorySize = scan.nextInt();

    System.out.println("Enter screen resolution:");
    String screenResolution = scan.next();

    if (size==13.3){
        lapTopPrice+= 200;
    }else if(size==15.0){
        lapTopPrice += 300;
    }else if(size == 17.3){
        lapTopPrice += 400;
    }


    if(iType== "i3"){
        lapTopPrice+= 150;
    }else if(iType=="i5"){
        lapTopPrice += 250;
    }else if(iType=="i7"){
        lapTopPrice+=350;
    }


    if(ramSize=="4GB"){
        lapTopPrice+=50;
    }else {
        lapTopPrice+= 100;

    }


    if(storageType=="HDD"){
        lapTopPrice +=50;
    }else if(storageType=="SSD"){
        lapTopPrice += 100;
    }
    if(memorySize == 500 ){
        lapTopPrice += 500;
    }else if(memorySize == 1000){
        lapTopPrice += 1000;
    }





    if(screenResolution == "FULLHD"){
        lapTopPrice+= 100;
    }else if(screenResolution=="4K"){
        lapTopPrice+= 200;
    }
    System.out.println("Laptop price is: "+lapTopPrice);


}}



