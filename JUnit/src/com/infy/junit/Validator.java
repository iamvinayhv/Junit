package com.infy.junit;

public class Validator {

	public void validate(Employee employee) throws InvalidNameExceptions, InvalidAgeExceptions{
		if(!isValidName(employee.getName())){
			InvalidNameExceptions ine =new InvalidNameExceptions("Invalid Employee Name");
			throw ine;
		}else if(!isValidAge(employee.getAge())){
			InvalidAgeExceptions iae =new InvalidAgeExceptions("Invalid Employee Age");
			throw iae;
		}else
			System.out.println("All values are valid");
			
	}
	
	public Boolean isValidName(String name){
		if(name.length()<=8)
			return false;
		else
			return true;
	}
	
	public Boolean isValidAge(Integer age){
		if(age<=18 || age>=60)
			return false;
		else
			return true;
	}
	
}