import java.util.Scanner;

public class Basic_Runtime_Errors {
    public static void main(String[] args) {
        System.out.println("Before Exception");
        // System.out.println(2/0);
        // String str = null;

        // try {
        //     System.out.println(2/0);
        //     System.out.println(str.length());
        // } catch (NullPointerException e) {
        //     // e.printStackTrace();
        //     // System.out.println("Exception Occurred here...");
        //     System.out.println(e.getMessage() + "\n" + e.getClass());
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getLocalizedMessage());
        // }

        // int arr[] = new int[4];
        String str = "123s";
        // Scanner sc = new Scanner(System.in);
        try {
            // System.out.println(str.charAt(89));
            // System.out.println(2/0);
            // System.out.println("Enter any integer: ");
            // int a = sc.nextInt();
            int a = Integer.valueOf(str);
            System.out.println(a);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getClass() + " -> " + e.getMessage());
            // System.out.println(e);
        }
        
        System.out.println("After Exception");
    }
}
