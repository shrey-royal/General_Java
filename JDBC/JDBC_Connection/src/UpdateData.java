import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		try {
			Connection conn = DBConn.getConnection();
			
			String updateQuery = "Update suratfood SET FoodName = ?, Description = ?, PopularImpressions = ?, Rating = ? WHERE FoodID = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);
			
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the FoodId: ");
			pstmt.setInt(5, sc.nextInt());
			
			sc.nextLine();
			System.out.println("Food Name: ");
			pstmt.setString(1, sc.nextLine());
			
			System.out.println("Food Description: ");
			pstmt.setString(2, sc.nextLine());
			
			System.out.println("Food PopularImpressions: ");
			pstmt.setString(3, sc.nextLine());
			
			System.out.println("Food Rating: ");
			pstmt.setFloat(4, sc.nextFloat());
			
			int re = pstmt.executeUpdate();
			
			if(re > 0) {
				System.out.println("Data Updated Successfully!");
			} else {
				System.out.println("Failed to update Data!");
			}
			sc.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
