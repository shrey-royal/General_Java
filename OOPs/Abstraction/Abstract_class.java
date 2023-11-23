/*
Abstraction : Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Abstract Class: A class with the abstract keyword is called an abstract class. It can have abstract and non-abstract methods.

0%-100% abstraction is possible in abstract class.

Rules for Abstract class:

1. must declare with abstract keyword.
2. it can have abstract and non-abstract methods.
3. it cannot be instantiated.
4. it can have constructors and static methods also.
5. it can have final methods which will force the subclass not to change the body of the method.

*/

abstract class Person {
    String name;
    int age;

    abstract void display();

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nRoll No: " + rollNo);
    }
}

public class Abstract_class {
    public static void main(String[] args) {
        // Person p = new Person("Rahul", 20) {
        //     @Override
        //     void display() {
        //         System.out.println("Name: " + name + "\nAge: " + age);
        //     }
        // };

        // p.display();

        Student s = new Student("Devam", 89, 230);
        s.display();
    }
}

/*
Tasks:

Abstract Class:

Scenario 1: Animal Hierarchy
Create an abstract class called "Animal" with abstract methods like "eat" and "sound." Implement derived classes like "Cat" and "Dog" that provide specific implementations for these abstract methods.

Scenario 2: Vehicle Manufacturing
Design an abstract class called "Vehicle" with abstract methods like "assemble" and "paint." Implement derived classes like "Car" and "Motorcycle" that provide specific implementations for these abstract methods.

Scenario 3: Banking System
Develop an abstract class called "Account" with abstract methods like "deposit" and "withdraw." Implement derived classes like "SavingsAccount" and "CurrentAccount" that provide specific implementations for these abstract methods.

Scenario 4: Shape Calculation
Create an abstract class called "Shape" with abstract methods like "calculateArea" and "calculatePerimeter." Implement derived classes like "Circle" and "Rectangle" that provide specific implementations for these abstract methods.

Scenario 5: Employee Management
Design an abstract class called "Employee" with abstract methods like "calculateSalary" and "displayDetails." Implement derived classes like "Manager" and "Engineer" that provide specific implementations for these abstract methods.

Scenario 6: Music Player Application
Develop an abstract class called "MediaPlayer" with abstract methods like "play" and "stop." Implement derived classes like "AudioPlayer" and "VideoPlayer" that provide specific implementations for these abstract methods.

Scenario 7: University Management System
Create an abstract class called "Person" with abstract methods like "registerCourse" and "submitAssignment." Implement derived classes like "Student" and "Professor" that provide specific implementations for these abstract methods.

Scenario 8: Mobile Application Development
Design an abstract class called "App" with abstract methods like "open" and "close." Implement derived classes like "ChatApp" and "PhotoEditingApp" that provide specific implementations for these abstract methods.

Scenario 9: Shopping Cart System
Develop an abstract class called "CartItem" with abstract methods like "calculatePrice" and "displayDetails." Implement derived classes like "ElectronicsItem" and "ClothingItem" that provide specific implementations for these abstract methods.

Scenario 10: Recipe Management Application
Create an abstract class called "Recipe" with abstract methods like "prepareIngredients" and "cook." Implement derived classes like "SoupRecipe" and "DessertRecipe" that provide specific implementations for these abstract methods.



*/