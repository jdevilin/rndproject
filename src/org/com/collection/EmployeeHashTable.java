package org.com.collection;

public class EmployeeHashTable {

	private int id;
	private String name;
	private String address;
	private int phone;

	public EmployeeHashTable(int id, String name, String address, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "EmployeeHashTable [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

	
}
