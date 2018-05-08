package L2S1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class PreStmt {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/codesmart","root","");

			Statement stmt = con.createStatement();
			PreparedStatement pstmt=(PreparedStatement) con.prepareStatement("insert into DATA values(?,?,?,?)");  
			pstmt.setInt(1,2); 
			pstmt.setString(2,"Tao");
			pstmt.setString(3,"Sun");
			pstmt.setInt(4,35); 
			pstmt.execute();
			
			System.out.println("Query executed successfully");

	        ResultSet rs = stmt.executeQuery("Select * from DATA");
	        while(rs.next()){
	            System.out.println("Emp Id : " + rs.getInt("ID") + ", Firstname : " + rs.getString("Firstname") + ", Lastname : " + rs.getString("Lastname") + ", Age : " + rs.getInt("Age"));
	        }
	        
	        rs.close();
			con.close();	
			
			

		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
