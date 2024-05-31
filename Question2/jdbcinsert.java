package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcinsert {

	
	public static void main(String args[]) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee","root","");
			PreparedStatement stmt = con.prepareStatement("insert into employeeinfo (empcode, empname, empage, esalary) values (?, ?, ?, ?)");
				
			stmt.setInt(1, 101);
			stmt.setString(2, "Jenny");
			stmt.setInt(3, 25);
			stmt.setInt(4, 10000);
			
			stmt.setInt(1, 102);
			stmt.setString(2, "Jacky");
			stmt.setInt(3, 30);
			stmt.setInt(4, 20000);
			
			stmt.setInt(1, 103);
			stmt.setString(2, "Joe");
			stmt.setInt(3, 20);
			stmt.setInt(4, 40000);
			
			stmt.setInt(1, 104);
			stmt.setString(2, "John");
			stmt.setInt(3, 40);
			stmt.setInt(4, 80000);
			
			stmt.setInt(1, 105);
			stmt.setString(2, "Shameer");
			stmt.setInt(3, 25);
			stmt.setInt(4, 90000);
			
			int status = stmt.executeUpdate();
			System.out.println("status = "+status);
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
