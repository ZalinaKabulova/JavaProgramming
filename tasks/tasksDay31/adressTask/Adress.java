package tasksDay31.adressTask;

public class Adress {

    public String street, city, state, zipCode, buildingNumber;

    public Adress(String street, String city, String state, String zipCode, String buildingNumber) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.buildingNumber = buildingNumber;
    }



    public String toString() {
        return buildingNumber+"" + street + "\n"+ city + " "+state+ ", "+zipCode;

    }
}
/*
Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

 */

