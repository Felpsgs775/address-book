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
	
	private String readText(String prompt)
	{
		System.out.println(prompt);
		return scanner.nextLine().trim();
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
	
	public void registerPerson()
	{
		
		String firstName = readText("Nome: ");
		String lastName = readText("Sobrenome: ");
		
		LocalDate birthDate = readValidBirthDate();
		
		String email = readText("email: ");
		String phone = readText("Telefone: ");
		
		controller.registerPerson(firstName, lastName, birthDate, email, phone);
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
			registerPerson();
		}
		while(shouldContinue("Deseja cadastrar outra pessoa? (S/N)"));
			
	}

}