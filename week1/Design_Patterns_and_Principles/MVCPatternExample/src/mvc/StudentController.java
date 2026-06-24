package mvc;

public class StudentController{
	private Student student;
	private StudentView view;
	StudentController(Student student,StudentView view){
		this.student=student;
		this.view=view;
	}
	public void setStudentName(String name) {
		student.setName(name);
	}
	public void setStudentId(int id) {
		student.setId(id);
	}
	public void setStudentGrade(char grade) {
		student.setGrade(grade);
	}
	public String getStudentName() {
		return student.getName();
	}
	public int getStudentId() {
		return student.getId();
	}
	public char getStudentGrade() {
		return student.getGrade();
	}
	public void displayDetails() {
		view.displayStudentDetails(getStudentName(), getStudentId(), getStudentGrade());
	}
	
}
