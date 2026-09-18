package br.edu.utfpr.tsi.address.model;
import java.time.LocalDate;

public class Person 
{
	public String firstName;
	public String lastName;
	public LocalDate birthDate;
	public String email;
	public String phone;
	
	public Person(String firstName, String lastName, LocalDate birthDate, String email, String phone)
	{
		this.firstName =  firstName;
		this.lastName  = lastName;
		this.birthDate = birthDate;
		this.email     = email;
		this.phone     = phone;
	}
	
	public Person(String firstName, String lastName, LocalDate birthDate)
	{
		this.firstName =  firstName;
		this.lastName  = lastName;
		this.birthDate = birthDate;
	}
	
	public Person()
	{
		this.firstName =  " ";
		this.lastName  = " ";
		this.birthDate = LocalDate.now();
		this.email     = " ";
		this.phone     = " ";
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	
	

}
