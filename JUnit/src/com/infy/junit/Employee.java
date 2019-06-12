package com.infy.junit;

public class Employee {

	private String name;
	private Double mounthlySalary;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMounthlySalary() {
		return mounthlySalary;
	}
	public void setMounthlySalary(Double mounthlySalary) {
		this.mounthlySalary = mounthlySalary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Double calculateYearlySalary(){
		Double ySalary = null;
		if(age>18 && age<50){
			ySalary = (mounthlySalary + (0.08 * mounthlySalary))*12;
		}else if(age>50 && age<60){
			ySalary = (mounthlySalary + (0.09 * mounthlySalary))*12;
		}
			
		return ySalary;
			
	}
	
}
