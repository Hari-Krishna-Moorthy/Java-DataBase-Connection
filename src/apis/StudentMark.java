package apis;

import apis.Students;
import apis.Marks;

public final class StudentMark {
	private Students student;
	private Marks mark;
	
	public StudentMark() {}
	public StudentMark(Students student, Marks mark) {
		this.student = student;
		this.mark = mark;
	}
	public StudentMark(Integer rollNumber, String name, Integer subject1, Integer subject2, Integer total) {
		this.student = new Students(rollNumber, name);
		this.mark = new Marks(subject1, subject2, total );
	}
	public Students getStudent() {
		return student;
	}
	public void setStudent(Students student) {
		this.student = student;
	}
	public Marks getMark() {
		return mark;
	}
	public void setMark(Marks mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return String.format("Name : %10s | Roll no: %2d\t|\tSubject 1: %4d | Subject 2: %4d | Total : %4d",
				student.getName(), student.getRollNumber(),
				mark.getSubject1(), mark.getSubject2(), mark.getTotal());
	}
	
	
	
}
