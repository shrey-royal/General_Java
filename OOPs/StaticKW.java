
class MyClass {
    //static variable
    public static int staticVariable = 42;

    //instance variable
    public int instanceVariable;

    //static method
    public static void staticMethod() {
        System.out.println("This is a Static method.");
    }

    //instance method
    public void instanceMethod() {
        System.out.println("This is an Instance method.");
    }

    public static void main(String[] args) {
        ////Accessing a static variable and method
        System.out.println("Static variable: " + MyClass.staticVariable);
        MyClass.staticMethod();

        //Creating instances of the class
        MyClass Obj1 = new MyClass();
        MyClass Obj2 = new MyClass();

        Obj1.instanceVariable = 10;
        Obj2.instanceVariable = 20;
        System.out.println("Obj1.instanceVariable: " + Obj1.instanceVariable);
        System.out.println("Obj2.instanceVariable: " + Obj2.instanceVariable);

        Obj1.instanceMethod();
        Obj2.instanceMethod();

        System.out.println(Obj1.staticVariable);
        Obj1.staticVariable = 100;
        System.out.println(Obj2.staticVariable);
    }

}

public class StaticKW {
    public static void main(String[] args) {
        MyClass.main(args);
    }
}
