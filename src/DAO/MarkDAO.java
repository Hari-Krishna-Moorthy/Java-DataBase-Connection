package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import secrects.Secretes;
import apis.Marks;

public class MarkDAO extends Secretes{
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	public MarkDAO() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		connection = DriverManager.getConnection(
				Secretes.getUrl()+Secretes.getDatabase(), 
				Secretes.getUsername(), 
				Secretes.getPassword());
		statement = connection.createStatement();
	}
	public List<Marks> getAllMark() throws SQLException {
		List<Marks> markList = new ArrayList<Marks>();
		resultSet = statement.executeQuery("select * from marks");
		while(resultSet.next()) {
			Integer sub1 = resultSet.getInt("sub1"); 
			Integer sub2 = resultSet.getInt("sub2");
			Integer total = resultSet.getInt("total");
			
			markList.add(new Marks(sub1, sub2, total));
		}
		resultSet.close();
		return markList;
	}
		
	public void close() throws SQLException {
		this.statement.close();
		this.connection.close();
	}
	
}
