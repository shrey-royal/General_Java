class GrandFather {
    public void grandFather() {
        System.out.println("Grand Father");
    }
}

class Father extends GrandFather {
    public void father() {
        System.out.println("Father");
    }
}

class Child extends Father {
    public void child() {
        System.out.println("Child");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Child c = new Child();
        c.child();
        c.father();
        c.grandFather();
    }
}
