package day22_MultiDimensionalArray;

public class ReverseSecondWord2 {

    public static void main(String[] args) {

        String sentence = "Java has different versions";

        String[] words = sentence.split(" ");

        String reverse = "";

        for (int i = words[2].length() - 1; i >= 0; i--) {
            reverse+= words[2].charAt(i); //  tnereffid
        }
        System.out.println(reverse);

        // теперь нам надо это перевернутое слово вернуть обратно в предложение!!!
        // есть два способа

       // sentence= sentence.replaceFirst(words[2], reverse); если в предложении несколько одинаковых слов different то используем replaceFirst
        //System.out.println(sentence);
        //   ИЛИ ЖЕ
        words[2] = reverse;
        for (String word : words) {
            System.out.print(word+ " ");
        }
    }
}
