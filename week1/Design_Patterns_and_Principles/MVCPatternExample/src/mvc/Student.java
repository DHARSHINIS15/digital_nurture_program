package mvc;

public class Student {
	private String name;
	private int id;
	private char grade;
	public void setName(String name) {
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setGrade(char grade) {
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public char getGrade() {
		return grade;
	}
}
