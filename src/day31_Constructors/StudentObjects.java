package day31_Constructors;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Hulya", 26, 'F', 'B', 13);

        Student student2 = new Student("Ali",30,'M','A',42);

        System.out.println(student1);
        System.out.println(student2);



        // Quiz questions
        String word = "Winter is coming";
        word = word.substring(1,6);

        //int c = word.charAt(4);
       //System.out.println(c);

        System.out.println(word);

        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");

        if(index1==index2){

            System.out.println(index1);

        } else{
            System.out.println(index2);
        }

        //String z = "popcorn";
       // z = z.substring(1,8);
        //System.out.println(z);



        String a = "today I will go to the beach";
        boolean b = a.contains("i");
        boolean c = a.substring(12).startsWith("go");

        String result = b && c ? "go" : "don't go";
        System.out.println(result);

        int y = 0;
        do{
            y = y++ + --y - (y % 3);
        } while ( ++y < 4);

        System.out.println(y);

        String str = "The whole time it was raining.";

        //do{
       //     System.out.println(str.charAt(0));
       // } while (!str.isEmpty());
    }



}
