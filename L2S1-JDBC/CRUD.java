package L2S1;

import java.sql.*;

public class CRUD {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/codesmart","root","");

			//System.out.println("Createing db...");
			Statement stmt = con.createStatement();

			String sql= "CREATE TABLE DATA " + "(ID INTEGER , " + " Firstname VARCHAR(255), " + " Lastname VARCHAR(255), " + " Age INTEGER )";
			System.out.println("Table DATA created successfully!");
			stmt.executeUpdate(sql);
			
			 //insert record into database
	        stmt.executeUpdate("insert into DATA(ID,Firstname,Lastname,Age) values(1,'Lily','Liang',18)");
	        System.out.println("Insert table successfully!");
	        
	        //update employee record
	        stmt.executeUpdate("Update DATA set Age=30 where Firstname='Lily'");
	        System.out.println("Update table successfully!");
	        
	        //read employee records
	        ResultSet rs = stmt.executeQuery("Select * from DATA");
	        while(rs.next()){
	            System.out.println("Emp Id : " + rs.getInt("ID") + ", Firstname : " + rs.getString("Firstname") + ", Lastname : " + rs.getString("Lastname") + ", Age : " + rs.getInt("Age"));
	        }
	        
	        //delete employee record
	        stmt.executeUpdate("delete from DATA where Firstname = 'Lily'");
	        System.out.println("Delete table successfully!");
			
			stmt.close();
			con.close();	
			
			

		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
