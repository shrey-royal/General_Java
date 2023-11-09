//base class
class Animal {
    String name;
    public Animal getAnimal() {
        System.out.println("Creating a generic animal");
        name = "Chinku";
        return new Animal();    //returning Animal object
    }

    //getter method
    public String getName() {
        return name;
    }
}

//derived class
class Lion extends Animal {
    @Override
    public Lion getAnimal() {
        System.out.println("Creating a Lion");
        name = "Simba";
        return new Lion();      //returning Lion object
    }

    //getter method
    public String getName() {
        return name;
    }
}


public class CovariantRT {
    public static void main(String[] args) {
        Animal animal = new Animal();   //creating Animal object
        Animal copyOfAnimal = animal.getAnimal();   //calling getAnimal() method of Animal class
        System.out.println("Name of animal is " + animal.getName());

        Lion lion = new Lion();     //creating Lion object
        Lion copyOfLion = lion.getAnimal();     //calling getAnimal() method of Lion class

        System.out.println("Name of lion is " + lion.getName());
    }
}

/*
Co-variant return type is concept of java 5.0 version. It is used to override method by changing return type of method.

> return type: is basically what a function gives back after doing it's job.

Now, imagine single inheritance (one base class and one child class)

Covariant Return Type: the rt of a function in the derived class can be more specific than it is in the base class.

class Zoo {} ->class
    animal -> function -> return type: Zoo(object)

class Lion extends Zoo {} ->class
    @Override
    animal -> function -> return type: Lion

*/