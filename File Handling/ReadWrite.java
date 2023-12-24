import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class FileHandler {
    FileWriter fout = null;
    FileReader fin = null;
    Scanner sc = new Scanner(System.in);

    public void writeFile(String fileName, String folderPath) {
      if (folderPath == null) folderPath = "";
        try {
            fout = new FileWriter(fileName + folderPath + ".txt");
            System.out.println("Enter the data you want to write into " + fileName);
            String data = sc.nextLine();

            fout.write(data);
            fout.close();
            System.out.println("\n\nFile Written Successfully...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readFile(String fileName, String folderPath) {
      if (folderPath == null) folderPath = "";
        try {
            fin = new FileReader(fileName + folderPath + ".txt");
            int i=0;
            while(  (i = fin.read()) != -1 ) System.out.print((char)i);

            fin.close();
            System.out.println("\n\nEnd of File...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ReadWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileHandler fh = new FileHandler();
        String fileName = "";
        int choice;
        do {
            System.out.println("1. Write into a file");
            System.out.println("2. Read from the file");
            System.out.println("0: Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the file: ");
                    fileName = sc.next();
                    fh.writeFile(fileName, null);
                    break;

                case 2:
                    System.out.println("Enter the name of the file: ");
                    fileName = sc.next();
                    fh.readFile(fileName, null);
                    break;

                case 0:
                    System.out.println("Exiting the Program...");
                    break;
            
                default:
                    System.out.println("Invalid choice, Please try again!");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
