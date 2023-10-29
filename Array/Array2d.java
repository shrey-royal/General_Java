import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        // int[][] arr = new int[rowSize][colSize];
        int[][] arr = new int[3][3];

        // System.out.println(arr[1].length);
        Scanner sc = new Scanner(System.in); 
        for(int i=0; i<arr.length; i++) {
            System.out.println("Enter data for row " + i + ": ");
            for(int j=0; j<arr[i].length; j++) {
                System.out.print("Enter arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        //printing the array
        System.out.println("\n");
        for(int i=0; i<arr.length; i++) {
            // System.out.println("Data for row " + i + ": ");
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("\b\b ");
        }
    }
}
