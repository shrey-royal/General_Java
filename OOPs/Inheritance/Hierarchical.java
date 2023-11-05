class Shape {
    public void printShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is a rectangle");
    }
}

class Square extends Shape {
    public void printSquare() {
        System.out.println("This is a square");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.printShape();
        r.printRectangle();
        
        Square s = new Square();
        s.printShape();
        s.printSquare();


        // Shape s = new Rectangle();
        // s.printShape();
        // s.printRectangle(); // Error: cannot find symbol

        // s = new Square();
        // s.printShape();
        // s.printSquare(); // Error: cannot find symbol
    }
}
