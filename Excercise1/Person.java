package day5.Lab4.Excercise1;

public class Person {
	private String name;
	private float age;
	
	
	//--------Constructors---------
	
	public Person() {
		super();
	}
	
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//-------getters and setters-------
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	
	
	

}
