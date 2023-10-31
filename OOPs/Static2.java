
class IceCream {
    String[] flavors = {"Chocolate", "Vanilla", "Strawberry"};
    static int totalIceCreams = 3;
    String flavor;

    IceCream(String flavor) {
        this.flavor = flavor;
    }

    void getIceCream() {
        if(totalIceCreams > 0) {
            boolean flag = false;
            for (int i = 0; i < this.flavors.length; i++) {
                if (this.flavors[i].equals(flavor)) {
                    System.out.println("Here's your " + flavor + " ice cream");
                    totalIceCreams--;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Sorry, we don't have " + flavor + " ice cream");
            }
        } else {
            System.out.println("Sorry, we are out of ice creams");
        }
    }
    
}

public class Static2 {
    public static void main(String[] args) {
        IceCream iceCream1 = new IceCream("Chocolate");
        iceCream1.getIceCream();
        System.out.println("Total Ice Creams left: " + IceCream.totalIceCreams);
        
        IceCream iceCream2 = new IceCream("Mango");
        iceCream2.getIceCream();
        System.out.println("Total Ice Creams left: " + IceCream.totalIceCreams);

        IceCream iceCream3 = new IceCream("Strawberry");
        iceCream3.getIceCream();
        System.out.println("Total Ice Creams left: " + IceCream.totalIceCreams);

        IceCream iceCream4 = new IceCream("CraneBerry");
        iceCream4.getIceCream();
        System.out.println("Total Ice Creams left: " + IceCream.totalIceCreams);

    }
}
/*
Static variables are shared among all instances of a class.


Task:

Problem Statement: Car Fleet Management

You are tasked with developing a car fleet management system. The system needs to keep track of various pieces of information for each car in the fleet, such as the make, model, year, price, and whether the car is currently in use. Additionally, the system should maintain a count of the total number of cars in the fleet.

Design and implement a `Car` class to represent individual cars in the fleet. The `Car` class should have the following features:

- Attributes:
  - `make` (String): The make or brand of the car.
  - `model` (String): The model of the car.
  - `year` (int): The manufacturing year of the car.
  - `price` (double): The price of the car.
  - `isRunning` (boolean): A flag indicating whether the car is currently running or not.

- Static Attribute:
  - `numberOfCars` (int): A static variable to keep track of the total number of cars in the fleet.

- Methods:
  - A constructor to initialize the car's attributes.
  - `start()` and `stop()` methods to change the `isRunning` status.
  - `displayCarInfo()` method to display car information.
  - A `getNumberOfCars()` static method to retrieve the total number of cars in the fleet.

You need to implement the `Car` class and use it to create, manage, and display information for multiple cars in the fleet. Ensure that the `numberOfCars` variable is properly incremented when new cars are added to the fleet and that it can be accessed without creating an instance of the `Car` class.


*/