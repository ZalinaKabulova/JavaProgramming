package day14_String;

public class StringMethod4 {
    public static void main(String[] args) {

        String str = "Cydeo";

        String str2 = str.repeat(4);

        System.out.println(str2);

        String s1 = "Wooden spoon ";
        String str3 = s1.repeat(100);

        System.out.println(str3);

        System.out.println("---------------------------------");

        System.out.println("FADY\n".repeat(15));
        System.out.println("----------------------------------");

        String name = "Java";

        System.out.println(  name.repeat(5));// space before variable called NAME




        String ta = "A";
        ta = ta.concat("B");
        String tb = "C";
        ta = ta + tb;
        ta.replace('C','D');
        ta = ta+tb;
        System.out.println(ta);

        String rt ="Hello World";
        rt.trim();
        int z =rt.indexOf("");
        System.out.println(z);

        String t = "Batch 21";
        int Z = t.trim().length();
        System.out.println(Z);

    }

}
