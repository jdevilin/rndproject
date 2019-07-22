package org.com.string;

public class StudentComparable implements Comparable<StudentComparable> {

	private int id;
	private String name;
	private String rollno;
	private String address;
	private int age;
	
	

	public StudentComparable(int id, String name, String rollno, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.address = address;
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentComparable [id=" + id + ", name=" + name + ", rollno=" + rollno + ", address=" + address
				+ ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(StudentComparable o) {
		if (age == o.age)
			return 0;
		else if (age > o.age)
			return 1;
		else
			return -1;
	}


}
