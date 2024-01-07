import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
	public static void main(String[] args) {
		try {
			Connection conn = DBConn.getConnection();
			
			String query = "DELETE FROM suratfood WHERE FoodID = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the foodid that you want to delete: ");
			pstmt.setInt(1, sc.nextInt());
			
			int re = pstmt.executeUpdate();
			if(re > 0) {
				System.out.println("Data Deleted Successfully!");
			} else {
				System.out.println("Failed to delete Data!");
			}
			sc.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
