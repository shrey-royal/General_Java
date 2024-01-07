import java.sql.Connection;

public class InsertData {	
	public static void main(String[] args) {
		Connection conn = DBConn.getConnection();
		
		try {
			String query = "INSERT INTO suratfood (FoodName, Description, PopularImpressions, Rating) VALUES ('Undhiyu', 'Mixed vegetable dish', 'Flavorful and rich', 4.5)";
			
			int rowsAffected = conn.createStatement().executeUpdate(query);
			
			if(rowsAffected > 0) {
				System.out.println("Dtaa inserted Successfully!");
			} else {
				System.out.println("Failed to insert Data!");
			}
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
