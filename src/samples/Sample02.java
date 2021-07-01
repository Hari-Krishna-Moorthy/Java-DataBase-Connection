package samples;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.sql.ResultSet;

import DAO.StudentDAO;
import DAO.MarkDAO;
import apis.Students;
import apis.Marks;


public class Sample02  {

	public static void main(String[] args) {
		try {
			StudentDAO s1 = new StudentDAO();
			
//			Get All students 
//			List<Students> l1 = s1.getAllStudents();
			
//			Get student by name
//			List <Students> l2 = s1.getStudentByName("Vishal"); 
			
//			Get student by rollno
			List <Students> l3 = s1.getStudentByRollNumber(4); 
			
			
			MarkDAO m1 = new MarkDAO();
			
//			Get all marks 
			List <Marks> l4 = m1.getAllMark();
			for(Students s: l3) {
				System.out.println(s);
			}
			System.out.println();
			Collections.sort(l4);
			for(Marks s: l4) {
				System.out.println(s);
			}
			s1.close();
			m1.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
