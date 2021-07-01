package apis;

public final class Students {
	private Integer RollNumber;
	private String Name;
	public Students() {}
	public Students(Integer rollNumber, String name) {
		RollNumber = rollNumber;
		Name = name;
	}
	public Integer getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		RollNumber = rollNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return String.format("Name : %10s | Roll number : %2d",Name, RollNumber);
	}
}
