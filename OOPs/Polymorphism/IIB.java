class Vehicle {
    Vehicle() {
        System.out.println("Himanshu from Vehicle class.");
    }
}

class Bike extends Vehicle {
    int speed;

    Bike() {
        super();
        // iib
        System.out.println("speed is " + speed);
    }

    //Instance Initializer Block
    {
        System.out.println("Instance Initializer Block!");
        speed = 100;
    }
}

public class IIB {
    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println(b.speed);
    }
}
/*
Instace Initializer Block: it is used to initialize the instance data member.
Priority Wise: Constructor > super() > iib > body of constructor

Tasks:
1. Temperature Converter: Create a class that converts temperatures between Celsius and Fahrenheit. Use an instance initializer block to set default conversion factors.
2. Math Operations: Develop a class that performs mathematical operations (addition, subtraction, etc.). Initialize required constants and variables within an instance initializer block.
3. Geometry Calculator: Create a class for calculating geometric shapes. Implement an instance initializer block to define default values for shape properties.
4. Time Zone Converter: Design a class for converting times between different time zones. Utilize an instance initializer block to set default time zone offsets.


*/