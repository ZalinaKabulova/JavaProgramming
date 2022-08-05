package utilities;

import day25_CustomMethods_Overloading.AddElementsToArray;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {


    //prints each integer of an integer Array in separate lines
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }              //1


    //prints each double of a double Array in separate lines           //2
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }


    //prints each char of a char Array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }           //3


    //prints each String of a String Array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }        //4


    // returns the maximum number for the integer array
    public static int maxNumber (int [] numbers){

        Arrays.sort(numbers);

        return numbers [numbers.length-1];

    }               //5


    // returns the maximum number for the double array
    public static double maxNumber (double [] numbers){

        Arrays.sort(numbers);

        return numbers [numbers.length-1];

    }        //6


    //returns the minimum number for integer array
    public static int minNumber (int[] numbers){
        Arrays.sort(numbers);

        return numbers[0];
    }               //7


    //returns the minimum number for double array
    public static double minNumber (double[] numbers){
        Arrays.sort(numbers);

        return numbers[0];
    }        //8


    // checks if the given integer is contained in the given array.returns boolean. contains(int[], int)
    public static boolean contains(int[] array, int element){

        boolean result = false;

        for (int each: array){
            if(each == element){
              result = true;
            }
        }

        return result;

    }  //9



    // checks if the given double is contained in the given array.returns boolean. contains(double[], double)
    public static boolean contains(double[] array, double element){

        boolean result = false;

        for (double each: array){
            if(each == element){
                result = true;
            }
        }

        return result;

    }  //10



    // checks if the given char is contained in the given array.returns boolean. contains(char[], char)
    public static boolean contains(char[] array, char element){

        boolean result = false;

        for (char each: array){
            if(each == element){
                result = true;
            }
        }

        return result;

    }    //11



    // checks if the given String is contained in the given array.returns boolean. contains(String[], String)
    public static boolean contains(String[] array, String element){

        boolean result = false;

        for (String each: array){
            if(each == element){// if any arrays element is matching with the given element, it means the given element is contained in the array
                result = true;
            }
        }

        return result;

    }  //12


    //   replace the elements of the array at given index with the new element
    // {1,2,3,4,5}     200         30
    public static int[] replace (int[] array, int index,int newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }   //13


    //   replace the elements of the array at given index with the new element
    public static double[] replace (double[] array, int index,double newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }  //14



    //   replace the elements of the array at given index with the new element
    public static char[] replace (char[] array, int index,char newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }  //15



    //   replace the elements of the array at given index with the new element
    public static String[] replace (String[] array, int index,String newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }   //16



    // replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array,int oldValue,int newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){ // if equal
                array[i] = newValue;  // assigning
            }
        }
        return array;
    }   //17


    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array,double oldValue,double newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){ // if equal
                array[i] = newValue;  // assigning
            }
        }
        return array;
    }  //18



    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array,char oldValue,char newValue){

        for (char i = 0; i < array.length; i++) {

            if(array[i] == oldValue){ // if equal
                array[i] = newValue;  // assigning
            }
        }
        return array;
    }    //19




    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array,String oldValue,String newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i].equals(oldValue)){ // if equal
                array[i] = newValue;  // assigning
            }
        }
        return array;
    }  //20

    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addInteger(int[] array, int element) {

        int[] result = new int[array.length + 1];


        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }    //21


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;
    }   //22

    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addString(String[] array, String element) {

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;
        // result[i] = element;

        return result;
    }   //23

    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addChar(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;
        // result[i] = element;

        return result;
    }           //24


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement (int [] array, int element){

        int count = 0;

        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return  count;
    }   //25


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement (double [] array, double element){

        int count = 0;

        for (double each : array) {
            if(each==element){
                count++;
            }
        }
        return  count;
    }  //26


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement (char [] array, char element){

        int count = 0;

        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return  count;
    }   //27


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement (String [] array, String element){

        int count = 0;

        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return  count;
    }  //28

    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addElement(int[] array, int element) {

        int[] result = new int[array.length + 1];


        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }             //29


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;
    }   //30

    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element) {

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;
        // result[i] = element;

        return result;
    }   //31

    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;
        // result[i] = element;

        return result;
    }         //32

    // returns the unique elements of the array
    public static int[] uniqueElements(int[] array) {

        int[] result = {};  //

        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one , the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }                    //33


    // returns the unique elements of the array
    public static double[] uniqueElements(double[] array) {

        double[] result = {};  //

        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one , the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }             //34

    // returns the unique elements of the array
    public static char[] uniqueElements(char[] array) {

        char[] result = {};  //

        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one , the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }                 //35


    // returns the unique elements of the array
    public static String[] uniqueElements(String[] array) {

        String[] result = {};  //

        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one , the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }            //36

    // removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length){
            System.err.println("Invalid index");
            System.exit(0);
        }

        int[] result = new int[array.length - 1]; // создаем новый массив и уменьшаем массив на один элемент

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue; // to skip the following index and then it goes on
            }
            result[j++] = array[i];
        }
        return result;
    }         //37


    // removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){ // index numbers are always integer

        if(index < 0 || index > array.length){
            System.err.println("Invalid index");
            System.exit(0);
        }

        double[] result = new double[array.length - 1]; // создаем новый массив и уменьшаем массив на один элемент

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue; // to skip the following index and then it goes on
            }
            result[j++] = array[i];
        }
        return result;
    }   //38


    // removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){ // index numbers are always integer

        if(index < 0 || index > array.length){
            System.err.println("Invalid index");
            System.exit(0);
        }

        char[] result = new char[array.length - 1]; // создаем новый массив и уменьшаем массив на один элемент

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue; // to skip the following index and then it goes on
            }
            result[j++] = array[i];
        }
        return result;
    }       //39


    // removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){ // index numbers are always integer

        if(index < 0 || index > array.length){
            System.err.println("Invalid index");
            System.exit(0);
        }

        String[] result = new String[array.length - 1]; // создаем новый массив и уменьшаем массив на один элемент

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue; // to skip the following index and then it goes on
            }
            result[j++] = array[i];
        }
        return result;
    }   //40


    // merge the given two arrays and returns the new array                //41
    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = {};

        for (int each : arr1) {

            result = ArraysUtility.addElement(result,each);

        }

        for (int each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }

        return result;


    }

    // merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = {};

        for (double each : arr1) {

            result = ArraysUtility.addElement(result,each);

        }

        for (double each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }

        return result;


    }       //42

    // merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2) {

        char[] result = {};

        for (char each : arr1) {

            result = ArraysUtility.addElement(result,each);

        }

        for (char each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }

        return result;


    }             //43

    // merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2) {

        String[] result = {};

        for (String each : arr1) {

            result = ArraysUtility.addElement(result,each);

        }

        for (String each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }

        return result;


    }       //44

    //reverses the given array, returns a new array
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            // OR   for (int i = array.length - 1,j ==0; i >= 0; i--, j++) { creating variable inside te loop
            result[j++] = array[i];

        }
        return result;
    }                          //45

    //reverses the given array, returns a new array
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            // OR   for (int i = array.length - 1,j ==0; i >= 0; i--, j++) { creating variable inside te loop
            result[j++] = array[i];

        }
        return result;
    }                        //46

    //reverses the given array, returns a new array
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            // OR   for (int i = array.length - 1,j ==0; i >= 0; i--, j++) { creating variable inside te loop
            result[j++] = array[i];

        }
        return result;
    }                   //47


    //reverses the given array, returns a new array
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            // OR   for (int i = array.length - 1,j ==0; i >= 0; i--, j++) { creating variable inside te loop
            result[j++] = array[i];

        }
        return result;
    }                   //48

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = AddElementsToArray.addInteger(result, each);
            }

        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array) {

        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = AddElementsToArray.addChar(result, each);
            }

        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array) {

        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = AddElementsToArray.addDouble(result, each);
            }

        }
        return result;

    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array) {

        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = AddElementsToArray.addString(result, each);
            }

        }
        return result;

    }


    public static ArrayList<Integer> convertArrayToArrayList(int[] array){

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }



}

