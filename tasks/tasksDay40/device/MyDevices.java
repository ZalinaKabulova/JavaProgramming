package tasksDay40.device;

public class MyDevices {

    public static void main(String[] args) {

        BlackBerry blackBerry = new BlackBerry("Dark Rose",1200,true,true);

        Computer computer = new Computer("Lenovo","Open Book",1500,true,true);

    Desktop desktop = new Desktop("Lenovo","Open Book",1500,true,true);

    Device device = new Device("Lenovo","Open Book",1500,true,true);

    Google google = new Google("H5900",1500,true,true);

    Iphone iphone = new Iphone("12",1000,true,true);

    Laptop laptop = new Laptop("Lenovo","Open Book",1500,true,true);

    Nokia nokia = new Nokia("HP200",50,true,true);


        System.out.println(blackBerry);
        System.out.println(computer);

    }
}
/*
Device Task:
	1. Create a class named Device:
			Variables:
					brand, model, price, hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model can not be null (if obj == null means it's error)
							2. brand, model can not be empty or can not be blank
							3. price can not be set to negative or zero

			Methods:
				turnOn(), turnOff(), toString()


	2. Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)

	3. Create a subclass of Device named Computer:

				Add the extra methods if needed

	4. Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()

	5. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone
				2. Samsung
				3. BlackBerry
				4. Google
				5. Nokia


	5. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer
				1. Desktop
				2. Laptop


	6. Create a class named MyDevices:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes






 */