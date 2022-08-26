package day45_Abstraction;

public interface  PropertiesOfInterface {

    int a = 100;  //static & final by default
    static int b = 200; //final by default

    /* public PropertiesOfInterface (int a){ //interface does not accept constructor
       this.a = a;
    }
*/
   /* static {                              // interface does not accept blocks
        b = 100;
    }
*/
    /*public void method1(){              // interface does not accept instance method
      System.out.println("Instance method");
    }

     */
    public static void method2(){
        System.out.println("Static method");
    }

    public abstract void method3();
}
