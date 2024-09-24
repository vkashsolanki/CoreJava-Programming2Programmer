package corelogic;

import java.util.List;

public class Student {

	String name;
	int roll;

	Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	public class Record
	{
		Record() {
			
			
		}

		List<Student> studentlist;
		
		


		public List<Student> getStudentlist() {
			return studentlist;
		}

		public void setStudentlist(List<Student> studentlist) {
			this.studentlist = studentlist;
		}

		public String addStudent(Student student) {
			System.out.println(name);
			System.out.println(roll);
			//studentlist.addAll(name,roll);
			
			return "Added";
		}
		
		public String swapStudent(Student s1, Student s2) {
			
			
			
			return "";
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		
		Student s= new Student("Ra", 1);
		
		Record r = s.new Record();
		r.addStudent(s);

	}

}
