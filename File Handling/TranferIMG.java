import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TranferIMG {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        int ctr=0;

        try {
            in = new FileInputStream("input.png");
            out = new FileOutputStream("output.png");
            int c;

            while((c = in.read()) != -1) {
                out.write(c);
                ctr++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(in != null) {
                    in.close();
                }
                if(out != null) {
                    out.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing File");
            }

            System.out.println("Done");
            System.out.println("Copied " + ctr + " bytes.");
        }
    }
}
