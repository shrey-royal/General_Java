class Bike {
    int speedLimit = 80;
    final static int blank;    // blank final variable

    static {
        blank = 90;    // static blank final variable
    }

    // Bike() {
    //     // super();
    //     // iib
    //     blank = 0;
    // }

    final void run() {
        speedLimit = 100;
    }
}

class Cyclist extends Bike {
    // void run() {
    //     System.out.println("Cyclist is running");
    // }

    // {super.speedLimit = 90;}
}

public class Final_KW {
    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println("speedlimit before calling run method: " + b.speedLimit);
        b.run();
        System.out.println("speedlimit after calling run method: " + b.speedLimit);

        // Cyclist c = new Cyclist();
        // System.out.println("speedlimit in cyclist: " + c.speedLimit);
    }
}

/*
Final Keyword is used to restrict the user:
    > value change
    > method override
    > inheritance

Tasks:

final keyword:

Scenario 1: Math Constants
In a mathematical calculation library, define a class called "MathConstants" with final variables for commonly used mathematical constants like pi and e. These variables cannot be modified and hold their constant values throughout the program.

Scenario 2: Configuration Settings
In a configuration management system, define a class called "Configuration" with final variables for system settings like database URL, username, and password. These variables cannot be modified and represent fixed configuration values.

Scenario 3: Math Calculations
In a math calculation library, define a class called "MathUtils" with final methods for commonly used mathematical calculations like square root and logarithm. These methods cannot be overridden and provide consistent behavior throughout the program.



*/