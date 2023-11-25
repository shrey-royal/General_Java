// Description: Access Modifiers in Encapsulation

class School {
    public String name;
    private int rollNo;
    protected int classRooms;

    School() {}

    School(String name, int rollNo, int classRooms) {
        this.name = name;
        this.rollNo = rollNo;
        this.classRooms = classRooms;
    }
}

class Parent extends School {
    void knowSchool(School p) {
        System.out.println("School Name: " + p.name);
        System.out.println("Classrooms: " + p.classRooms);
    }
}

public class ENCAP_AM {
    public static void main(String[] args) {
        School s = new School("ABC", 1, 10);
        Parent p = new Parent();
        p.knowSchool(s);
    }
}
