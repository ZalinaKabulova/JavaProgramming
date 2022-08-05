package day05_Concatenation;

public class ShippingAdress {
    public static void main(String[] args) {
        /* 1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address
*/
        String name = "Dolores Hamacher",
                buildingNumber = "344/5",
                streetName = "Bielefelder Str.",
                city = "Enger",
                state = "Kreis Herford",
                zipCode = "33824";
        //System.out.println(name + "\n" + streetName + ", " + buildingNumber+ "\n"+ zipCode+" "+ city+ ", "+ state);

        String adress = name + "\n" + streetName + ", " + buildingNumber+ "\n"+ zipCode+" "+ city+ ", "+ state;
        System.out.println(adress);
    }
}
