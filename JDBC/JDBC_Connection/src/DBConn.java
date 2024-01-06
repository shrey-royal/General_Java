import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//url - jdbc:mysql://<dbhost>:<dbport>/<dbname>
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/faceBatch", "root", "root"); //url, username, pass 
			
			if(conn != null) {
				System.out.println("Connected to DB");
			} else {
				System.out.println("Failed to connect to DB");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	
//	public static void main(String[] args) {
//		System.out.println(getConnection());
//	}
}
