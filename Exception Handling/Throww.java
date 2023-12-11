class Himanshu {
    public static void study(int milliseconds) {
        if(milliseconds >= 1000) throw new ArithmeticException("Leave it");
        else System.out.println("Study Now...");
    }
}

class ClassWork {
    public static void loadClass(String path) throws ClassNotFoundException {
        if(path.isEmpty()) throw new ClassNotFoundException();
        else Class.forName(path);
    }
}

public class Throww {
    public static void main(String[] args) {
        //Example 1: Throwing unchecked exception
        // Himanshu.study(1200);   //exception may occur here
        // System.out.println("rest of the code");

        //Example 2: Throwing checked exception
        
        try {
            ClassWork.loadClass("java.lang.Scanner");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
