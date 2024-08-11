package udemy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/demo"; // table details
		String username = "root"; // MySQL credentials
		String password = "root";
		String query = "select *from students"; // query to be run

		// Class.forName("oracle.jdbc.driver.OracleDriver"); // Driver name
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established successfully");
		
		  
		 Statement st = con.createStatement(); 
		 ResultSet rs = st.executeQuery(query); // Execute query rs.next();
		  
		 String name = rs.getString("name"); // Retrieve name from db
		 
		 
		 System.out.println(name); // Print result on console 
		 st.close(); // close statement
		 
		con.close(); // close connection
		System.out.println("Connection Closed....");
	}

}
