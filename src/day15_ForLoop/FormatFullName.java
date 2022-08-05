package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName = "cyDEo",
                lastName = "SCHOOL";
        //firstName =firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        // C                                                +   ydeo
// this method is used when it is String

        firstName = (""+firstName.charAt(0)).toUpperCase()+ firstName.substring(1).toLowerCase();
                                             //here we convert char to string method

        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        //System.out.println(firstName);
        //System.out.println(lastName);

        String fullName = firstName+ " "+ lastName;
        System.out.println(fullName);

    }
}
