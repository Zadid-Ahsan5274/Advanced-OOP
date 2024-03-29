import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Admin extends User {
	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;

	Admin() {
		this.username = "admin";
		this.password = "password";
		students = new ArrayList<>();
		teachers = new ArrayList<>();
	}

	@Override
	public boolean authentication(String username, String password) {
		if (this.username.equals(username) && this.password.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	private void savestudentdata() {
		try {
			FileWriter writer = new FileWriter("students.txt");
			for (Student student : students) {
				writer.write(student.getName() + "," + student.getRollNumber() + "," + student.getAddress() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void add_student(Student student) {
		students.add(student);
		savestudentdata();
	}

	public void deleteStudent(int rollNumber) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getRollNumber() == rollNumber) {
				students.remove(i);
				break;
			}
		}
		savestudentdata();
	}

	public void updateStudent(Student student) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getRollNumber() == student.getRollNumber()) {
				students.set(i, student);
				break;
			}
		}
		savestudentdata();
	}

	public void createTeacher(String username, String password) {
		Teacher teacher = new Teacher(username, password);
		teachers.add(teacher);
		saveTeacherData();
	}

	private void saveTeacherData() {
		try {
			FileWriter writer = new FileWriter("teachers.txt");
			for (Teacher teacher : teachers) {
				writer.write(teacher.getUsername() + "," + teacher.getPassword() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}