package samples;

//import secrects.Secretes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample01 {

	public static void main(String[] args) {
		String query = "select * from names";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/student", "hari", "hari");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from names");
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("id") + " " + resultSet.getString("Name") + " " + resultSet.getString("rollno") );
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
