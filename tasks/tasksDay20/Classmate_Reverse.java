package tasksDay20;

public class Classmate_Reverse {

    public static void main(String[] args) {

        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};

        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";

            for (int j = name.length()-1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }
            System.out.println(reverseName);


        }
    }
}
/*
2. create string array, and store the names of your  classmates (10)
            reverse each student names and print them in separate line
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */