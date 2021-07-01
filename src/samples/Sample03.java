/**
 * 
 */
package samples;

import java.sql.SQLException;

/**
 * @author hari
 *
 */

import java.util.List;


import DAO.StudentMarkDAO;
import apis.StudentMark;

public class Sample03 {

	public static void main(String[] args) throws SQLException {
		StudentMarkDAO sm1 = new StudentMarkDAO();
		
		List<StudentMark> l1 = sm1.getAllStudentMark();
		
		for(StudentMark sm: l1) {
			System.out.println(sm);
		}
		
	}

}
