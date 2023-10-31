
class SchoolBus {
    int seats;
    String color;

    SchoolBus() {
        this(30, "Grey");
    }

    SchoolBus(int seats, String color) {
        this.seats = seats;
        this.color = color;
    }

    void display() {
        System.out.println("Seats: " + seats + "\nColor: " + color);
    }

    void showBus() {
        this.display();
    }
}

public class ThisKW {
    public static void main(String[] args) {
        // SchoolBus bus = new SchoolBus(10, "Yellow");
        // bus.showBus();

        SchoolBus bus = new SchoolBus();
        bus.showBus();
    }
}

/*
This keyword is used to refer to the current object in a method or constructor.

used to:
    1. refer current class instance variable
    2. invoke current class method
    ex:
        this.methodName();


    3. invoke current class constructor


*/