package DAO;

import secrects.Secretes;

import apis.Students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StudentDAO extends Secretes{
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;
	
	public StudentDAO() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		connection = DriverManager.getConnection(
				Secretes.getUrl()+Secretes.getDatabase(), 
				Secretes.getUsername(), 
				Secretes.getPassword());
		statement = connection.createStatement();
	}
	public List<Students> getAllStudents() throws SQLException {
		resultset = statement.executeQuery("select * from names");
		List<Students> studentList = new ArrayList<Students>();
		
		while(resultset.next()) {
			Integer id = resultset.getInt("id");
			String Name = resultset.getString("Name");
			Integer rollno = resultset.getInt("rollno");
			
			studentList.add(new Students(rollno, Name));
		}
		this.resultset.close();
		return studentList;
	}
	
	public List<Students> getStudentByName(String name) throws SQLException {
		resultset = statement.executeQuery(String.format("select * from names where Name = '%s'", name));
		List<Students> studentList = new ArrayList<Students>();
		
		while(resultset.next()) {
			Integer id = resultset.getInt("id");
			String Name = resultset.getString("Name");
			Integer rollno = resultset.getInt("rollno");
			
			studentList.add(new Students(rollno, Name));
		}
		this.resultset.close();
		return studentList;
	}
	
	public List<Students> getStudentByRollNumber(int rollnumber) throws SQLException {
		resultset = statement.executeQuery(String.format("select * from names where rollno= '%d'", rollnumber));
		List<Students> studentList = new ArrayList<Students>();
		
		while(resultset.next()) {
			Integer id = resultset.getInt("id");
			String Name = resultset.getString("Name");
			Integer rollno = resultset.getInt("rollno");
			
			studentList.add(new Students(rollno, Name));
		}
		this.resultset.close();
		return studentList;
	}
	
	public void close() throws SQLException {
		this.statement.close();
		this.connection.close();
	}
	
	
}
