package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Volkswagen","Turan","Black",2005,4500);

        System.out.println(car1);
        car1.drive();

        Car car2 = new Car();
        car2.setInfo("Toyota","Corolla","Blue",2015,4555.68);

        System.out.println(car2);
        car2.start();

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Red", 2019, 40000);

        System.out.println(car3);

        ArrayList<Car> carslist =new ArrayList<>();
        carslist.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carslist) {
            System.out.println(each.brand + " : "+each.price);
            
        }

        System.out.println("------------------------------------");

         /*
         Recall:
            BMW: 2005 ~ 2008
            Toyota: 1995 ~ 1997
         */

        carslist.removeIf(p ->p.brand.equals("BMW") && p.year >= 2005 && p.year<= 2008);
        carslist.removeIf( p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);



        



    }
}
