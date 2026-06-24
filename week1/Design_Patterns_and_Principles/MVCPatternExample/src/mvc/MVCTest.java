package mvc;

public class MVCTest {

	public static void main(String[] args) {
		Student student=new Student();
		StudentView view=new StudentView();
		StudentController control = new StudentController(student,view);
		control.setStudentName("Dharshini");
		control.setStudentId(113);
		control.setStudentGrade('B');
		control.displayDetails();

	}

}
