package collectors.pationingby;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestPartioningBy {
	public static void main(String[] args) {
		List<Student> s1 = Arrays.asList(
			new Student("Anna", Student.Faculty.BUSINESS),
			new Student("Brian", Student.Faculty.BUSINESS),
			new Student("Chris", Student.Faculty.ENGENEERING),
			new Student("Dolores", Student.Faculty.ENGENEERING)

		);
		
		s1.stream().collect((Collectors.partitioningBy( c -> c.getFaculty() == Student.Faculty.BUSINESS ))).
		forEach((k,v) -> System.out.println(v));
	}
	
}

class Student {
	private String name;
	private Faculty faculty;
	
	public Student(String name, Faculty faculty) {
		this.name = name;
		this.faculty = faculty;
	}
	
	public String toString() { 
		return name;
	}
	
	static enum Faculty {
		BUSINESS, ENGENEERING;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	
}