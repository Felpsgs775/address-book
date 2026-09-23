package br.edu.utfpr.tsi.address.control;
import br.edu.utfpr.tsi.address.model.Person;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonController 
{
	final private
	List<Person> personList = new ArrayList<>();

	
	public void registerPerson(String firstName, 
			                 String lastName, 
			                 LocalDate birthDate,
			                 String email, 
			                 String phone)
	{
		personList.add(new Person(firstName,
				                  lastName, 
				                  birthDate,
				                  email, 
				                  phone));
		
	}
	
}
