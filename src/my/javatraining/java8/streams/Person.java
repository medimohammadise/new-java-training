package my.javatraining.java8.streams;

public class Person {
	private String name;
	private int age;
	private Gender gender;
    public Person( String name,int age,Gender gender) {
      this.name=name;
      this.age=age;
      this.gender=gender;
    		  
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	

	@Override
	public int hashCode() {
		return age;
	}
    //this will cause when we are using collect(set()) it will remove same ages
	@Override
	public boolean equals(Object other) {
		if (other instanceof Person)
			return ((Person)other).getAge()==this.age;
		else
			return false;
	}


}
