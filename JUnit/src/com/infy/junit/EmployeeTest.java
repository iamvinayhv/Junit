package com.infy.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
	
	Employee e = new Employee();
	
	
	@Test
	public void calculateYearlySalaryTest(){
		e.setAge(53);
		e.setMounthlySalary(15000.00);
		
		assertEquals(Double.valueOf(196200),e.calculateYearlySalary());
	}
	
	/*@Test
	public void validateInvalidNameTest(){
		e.setAge(38);
		e.setMounthlySalary(20000.00);
		e.setName("John");
		Validator v = new Validator();
		asser(new InvalidNameExceptions("Invalid Employee Name"), print);
		
		
		
	}*/
	
	@Test
	public void isValidNameInvalidNameTest(){
		e.setAge(45);
		e.setMounthlySalary(20000.00);
		e.setName("John");
		Validator v = new Validator();
		assertEquals(false, v.isValidName(e.getName()));
	}
	
	@Test
	public void isValidNameValidNameTest(){
		e.setAge(45);
		e.setMounthlySalary(20000.00);
		e.setName("Yuvarj Singh");
		Validator v = new Validator();
		assertEquals(true, v.isValidName(e.getName()));
	}
	
	@Test
	public void isValidageValidAgeTest(){
		e.setAge(23);
		e.setMounthlySalary(20000.00);
		e.setName("Yuvarj Singh");
		Validator v = new Validator();
		assertEquals(true, v.isValidAge(e.getAge()));
	}
	
	@Test
	public void isValidageInValidAgeTest(){
		e.setAge(17);
		e.setMounthlySalary(20000.00);
		e.setName("Yuvarj Singh");
		Validator v = new Validator();
		assertEquals(false, v.isValidAge(e.getAge()));
	}
	
	
}
