package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import secrects.Secretes;
import apis.StudentMark;

public final class StudentMarkDAO {
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	public StudentMarkDAO() throws SQLException {
		connection = DriverManager.getConnection(
				Secretes.getUrl()+Secretes.getDatabase(), 
				Secretes.getUsername(), 
				Secretes.getPassword());
		statement = connection.createStatement();
	}
	public List<StudentMark> getAllStudentMark() throws SQLException {
		List<StudentMark> list = new ArrayList();
		String query = "select names.Name, names.rollno, "
					+ "marks.sub1, marks.sub2, marks.total from names,"
					+ " marks where names.id = marks.student_id";
		resultSet = this.statement.executeQuery(query);
		
		while(resultSet.next()) {
			Integer rollNumber = resultSet.getInt("rollno");
			String name = resultSet.getString("Name");
			Integer subject1 = resultSet.getInt("sub1");
			Integer subject2 = resultSet.getInt("sub2");
			Integer total = resultSet.getInt("total");
			list.add(new StudentMark(rollNumber, name, subject1, subject2, total));
		}
		return list;
	}
	
	
	
}
