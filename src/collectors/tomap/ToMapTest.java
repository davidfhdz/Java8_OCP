package collectors.tomap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToMapTest {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
		    new Person("Andrew", Person.Gender.MALE),
		    new Person("Beatrice", Person.Gender.FEMALE),
		    new Person("Chris", Person.Gender.MALE),
		    new Person("Diana", Person.Gender.FEMALE)		    
		);
		System.out.println(persons.stream().collect( 
				Collectors.toMap(Person::getGender, Person::getName)
				));
	}
}

class Person {
	private String name;
	private Gender gender;
	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}
	
	static enum Gender {
		MALE, FEMALE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
