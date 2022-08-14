package day40_ProtectedAccessModifierFinalKeyword;

public class ProtectedAccessModifier {

    static String name1 = "Cydeo"; //default access modifier, can not be  accessed in subclasses and in world but can be accessed at the same package and class

    protected static String name2 = "Wooden Spoon";// protected access modifier, can not be  accessed in world but can be accessed at the same package and class and in subclass

    static void method1(){

    }

    protected static void method2(){

    }
}
