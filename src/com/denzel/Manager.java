package com.denzel;
public class Manager extends Employee {
	private double bonus;
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee("Denzel Qin",32000,1983,9,29);
		Manager ma1 = new Manager();
		Manager ma2 = new Manager("Rosie Qin",100000,2019,3,26);
		Employee[] ems = new Employee[4];
		ems[0] = emp1;
		ems[1] = emp2;
		ems[2] = ma1;
		ems[3] = ma2;
		
		for(Employee e:ems) {
			System.out.println("Name is "+e.getName()+", ID is "+e.getId()+" Brithday is ");
		}
	}
	
	public Manager() {
		super();
		bonus = 0;
	}
	public Manager(String name,double salary,int year,int month,int day) {
		super(name,salary,year,month,day);
		bonus = 0;
	}
	
	public void setBonus(double bonusForThisMonth) {
		bonus = bonusForThisMonth;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void reSetBonus() {
		bonus = 0;
	}
}
