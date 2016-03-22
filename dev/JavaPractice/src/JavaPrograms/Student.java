package JavaPrograms;

import java.util.Comparator;

public class Student {
	
	private String studentName;
	private int rollno;
	private int studentAge;
	
	public Student(String studentName, int rollno, int studentAge){
		
		this.studentName = studentName;
		this.rollno = rollno;
		this.studentAge = studentAge;
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	
	// Comparator for sorting the list by student name
	
	public static Comparator<Student> StuNameComparator = new Comparator<Student>(){

		@Override
		public int compare(Student o1, Student o2) {
			String studentName1 = o1.getStudentName();
			String studentName2 = o2.getStudentName();
			return studentName1.compareTo(studentName2);
		}
		
	};

}
