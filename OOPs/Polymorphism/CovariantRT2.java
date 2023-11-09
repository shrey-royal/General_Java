
class Firecracker {
    public Firecracker ignite() {
        System.out.println("Igniting a generic firecracker");
        return new Firecracker();   //returning new Firecracker object
    }
}

class Fountain extends Firecracker {
    private String color;

    public Fountain(String color) {
        this.color = color;
    }

    //getter and setter methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public Fountain ignite() {
        System.out.println("Igniting a colorful fountain");
        return new Fountain(this.color);     //returning new Fountain object
    }
}


public class CovariantRT2 {
    public static void main(String[] args) {
        Firecracker genericFirecracker = new Firecracker();
        Firecracker ignitedGenericFirecracker = genericFirecracker.ignite();

        Fountain colorfulFountain = new Fountain("Red");
        Fountain ignitedColorfulFountain = colorfulFountain.ignite();
        
        System.out.println("Original Fountain Color: " + colorfulFountain.getColor());
        // colorfulFountain.setColor("Purple"); 
        System.out.println("Ignited Fountain Color: " + ignitedColorfulFountain.getColor());
    }
}

/*
Task:
> Design a class hierarchy representing different shapes in Java, where each shape has a method to calculate its area. Use covariant return types to allow subclasses to return more specific types for their area calculation methods, such as having a 'Circle' subclass return a more specific 'double' type for its 'calculateArea' method.


Code Design:

1. Shape class:
   - Attributes: None
   - Method: 'calculateArea()' (returns a generic 'double')

2. Circle class (subclass of Shape):
   - Attributes: radius
   - Method: 'calculateArea()' (returns a more specific 'double')

3. Square class (subclass of Shape):
   - Attributes: sideLength
   - Method: 'calculateArea()' (returns a more specific 'double')

Sample Output:

'''
Calculating area of a circle: 78.53981633974483
Calculating area of a square: 16.0
'''


*/