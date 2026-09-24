package br.edu.utfpr.tsi.address.view;
import java.time.LocalDate;
import br.edu.utfpr.tsi.address.control.PersonController;
import br.edu.utfpr.tsi.address.view.util.ConsoleInput;

public class PersonView 
{
	private ConsoleInput console;
	private PersonController controller = null;
	
	public PersonView(ConsoleInput console, PersonController controller)
	{
		this.console = console;
		this.controller = controller;
	}
	
	
	
	public void registerPerson()
	{
		
		String firstName    = console.readText("Nome: ");
		String lastName     = console.readText("Sobrenome: ");
		LocalDate birthDate = console.readDate("Data de nascimento: ");
		String email        = console.readText("email: ");
		String phone        = console.readText("Telefone: ");
		
		controller.registerPerson(firstName, lastName, birthDate, email, phone);
      }
	
	public void createMultiplePersons()
	{
		System.out.println("-- Cadastro de Pessoas--");
		do
		{
			registerPerson();
		}
		while(console.askConfirmation("Deseja cadastrar outra pessoa? (S/N)"));
			
	}

}