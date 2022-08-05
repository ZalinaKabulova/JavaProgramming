package day24_CustomMethod_Return;

public class ReturnMethodsPractice4NOT {

    public static void main(String[] args) {

        String str = "ddhhhsggffdhhjjk";

        str = removeDuplicates(str);

        System.out.println(str);

    }

    //1. create a method that can remove duplicated characters
    // from a string and returns the new value
    public static String removeDuplicates (String str){ // "aaabbcc" ===> "abc"

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(each+"")){ //почему результат должен иметь каждый символ
                result += each;
            }
        }
          return result;
    }
}  //  и кстати в этот день мы вернулись в пакет "JavaIntro", который мы создали
// в первый день и создали класс под названием "Test"
