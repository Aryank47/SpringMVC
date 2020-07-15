package com.netcracker.dto;

public class Employee {

	 private int id;
	 private String name;
	 private float salay;
	 
	 public Employee() {
		// TODO Auto-generated constructor stub
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

	public float getSalay() {
		return salay;
	}

	public void setSalay(float salay) {
		this.salay = salay;
	}

	public Employee(int id, String name, float salay) {
		super();
		this.id = id;
		this.name = name;
		this.salay = salay;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salay=" + salay + "]";
	}
	 
	 
	
	
}
