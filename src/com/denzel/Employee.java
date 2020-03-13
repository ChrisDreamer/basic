package com.denzel;
import java.time.LocalDate;

public class Employee {
	private static int nextId = 1;
	private String name;
	private double salary;
	private int id;
	private LocalDate hireDay;

	public Employee() {
		name = "nobody";
		salary = 0;
		hireDay = null;
		setId();
	}
	
	public Employee(String name,double salary,int year,int month,int day) {
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
		setId();
	}
	
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public int getId() {
		return id;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary*byPercent/100;
		salary += raise;
	}
	
	private void setId() {
		id = nextId;
		nextId++;
	}
}
