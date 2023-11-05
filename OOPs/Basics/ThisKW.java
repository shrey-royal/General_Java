import java.util.Scanner;

class Paint {
    public String colorName;

    public Paint(String colorName) {
        this.colorName = colorName; //here this keyword is reffering the current class' instance variable
    }
}

class House {
    String colorName;

    public House(String wallColor) {
        Paint p = new Paint(wallColor);
        System.out.println("You have selected " + p.colorName + " color for the wall.");
    }

    public void paintHouse() {
        Paint p = new Paint("Red");

        System.out.println("The color of the wall is: " + p.colorName);
    }
}

public class ThisKW {
    public static void main(String[] args) {
        // Paint pt = new Paint("Blue");
        // System.out.println(pt.colorName);
        // Paint p[] = new Paint[5];
        // Scanner sc = new Scanner(System.in);

        // for(int i=0; i<5; i++) {
        //     System.out.print("Enter the color name: ");
        //     p[i] = new Paint(sc.next());
        // }
        // sc.close();

        // for(Paint paint : p) {
        //     System.out.println(paint.colorName);
        // }

        House h = new House("Blue");
        h.paintHouse();
    
    }
}
/*
This keyword is used to refer the current object.


*/