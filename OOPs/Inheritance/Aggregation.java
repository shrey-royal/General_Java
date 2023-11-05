class Address {
    String city, state, country;
    Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Student {
    private int rollNo;
    private String name;
    private Address address;
    
    public Student(int rollNo, String name, Address address) {  //Aggregation
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public void printStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("City: " + address.city);
        System.out.println("State: " + address.state);
        System.out.println("Country: " + address.country);
    }
}


public class Aggregation {
    public static void main(String[] args) {
        Address a = new Address("Surat", "Gujarat", "India");
        Student s = new Student(419, "Himanshu", a);
        s.printStudent();
    }
}
