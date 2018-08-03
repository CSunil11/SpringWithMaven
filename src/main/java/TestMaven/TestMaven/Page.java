package TestMaven.TestMaven;

import org.springframework.beans.factory.annotation.Autowired;

public class Page {

	String id = "";
	String name = "";
	
	private Person person;
	
	@Autowired
	public Page(Person person)
	{
		this.person=person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void testMePage() {
		System.out.println("I am listening...");
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
