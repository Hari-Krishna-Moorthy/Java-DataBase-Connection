package apis;

final public class Marks  implements Comparable{
	private Integer Subject1;
	private Integer Subject2;
	private Integer Total;
	public Marks() {}
	public Marks(Integer subject1, Integer subject2, Integer total) {
		Subject1 = subject1;
		Subject2 = subject2;
		Total = total;
	}
	public Integer getSubject1() {
		return Subject1;
	}
	public void setSubject1(Integer subject1) {
		Subject1 = subject1;
	}
	public Integer getSubject2() {
		return Subject2;
	}
	public void setSubject2(Integer subject2) {
		Subject2 = subject2;
	}
	public Integer getTotal() {
		return Total;
	}
	public void setTotal(Integer total) {
		Total = total;
	}
	@Override
	public String toString() {
		return String.format("Subject1 = %4d | Subject2 =  %4d | Total = %4d ", Subject1, Subject1,Total);
	}
	@Override
	public int compareTo(Object o) {
		Marks m = (Marks) o;
		if(this.Total == m.getTotal()) {
			if(this.Subject1==m.getSubject1()) {
				return -1 * this.Subject1.compareTo(Subject1);
			}else {
				return -1 * this.Subject2.compareTo(Subject2);
			} 
				
		} else {
			return -1 * this.Total.compareTo(m.getTotal());
		}
	}

	
	
}
