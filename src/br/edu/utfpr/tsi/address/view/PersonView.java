package br.edu.utfpr.tsi.address.view;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import br.edu.utfpr.tsi.address.control.PersonController;

public class PersonView 
{
	private Scanner scanner;
	private PersonController controller = null;
	
	public PersonView(Scanner scanner, PersonController controller)
	{
		this.scanner = scanner;
		this.controller = controller;
	}
	
	private LocalDate readValidBirthDate()
	{
		String errorMessage = "Data inválida! Por favor tente novamente. ";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		while(true)
		{
			try
			{
				System.out.print("Data de Nascimento");
				String dateInput = scanner.nextLine();
				
				return LocalDate.parse(dateInput, formatter);
			}
			catch(DateTimeParseException e)
			{
				System.out.println(errorMessage);
			}
		}
	}
	
	public void createPerson()
	{
		System.out.print("Nome: ");
		String firstName = scanner.nextLine();
		
		System.out.print("Sobrenome: ");
		String lastName = scanner.nextLine();
		
		LocalDate birthDate = readValidBirthDate();
		
		System.out.println("Email: ");
		String email = scanner.nextLine();
		
		System.out.println("Telefone");
		String phone = scanner.nextLine();
		
		controller.createPerson(firstName, lastName, birthDate, email, phone);
      }
	
	private boolean shouldContinue(String message)
	{
		System.out.print(message + " ");
		String answer = scanner.nextLine().trim().toUpperCase();
		return answer.equals("S");
	}
	
	public void createMultiplePeople()
	{
		System.out.println("-- Cadastro de Pessoas--");
		do
		{
			createPerson();
		}
		while(shouldContinue("Deseja cadastrar outra pessoa? (S/N)"));
			
	}

}