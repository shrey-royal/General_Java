class Parent {
    public void printParent() {
        System.out.println("I'm from Parent Class");
    }
}

class Child extends Parent {
    public void printChild() {
        System.out.println("I'm from Child Class");
    }
}


public class Single {
    public static void main(String[] args) {
        Child c = new Child();
        c.printChild();
        c.printParent();
    }
}
