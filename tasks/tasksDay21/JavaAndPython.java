package tasksDay21;

import java.util.Arrays;

public class JavaAndPython {

    public static void main(String[] args) {

        String sentence = "java java python python java python";
        String[] words = sentence.split(" ");

        int countJava = 0,
                countPython = 0;

        for (String each : words) {
            if(each.equalsIgnoreCase("Java")){
                countJava++;
            }
            if(each.equalsIgnoreCase("Python")){
                countPython++;
            }

        }
        System.out.println("Total count of Python is "+countPython+" and total count of Java is "+countJava);
    }
    }

/*6. Write a program that can return the number of appearances of “java”
and “python” anywhere in the sentence.
        (similar to the task 97 in repl.it, but this time you MUST
        use arrays and for each loop)
*/
