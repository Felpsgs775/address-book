package br.edu.utfpr.tsi.address.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PersonView 
{
	private Scanner scanner;
	public PersonView()
	{
		
	}
	public void createPerson()
	{
		System.out.println("Nome: ");
		String firstName = scanner.nextLine();
		
		System.out.println("Sobrenome: ");
		String lastName = scanner.nextLine();
		
		System.out.println("Data de Nascimento (dd/mm/aaaa): ");
		String input = scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthDate = LocalDate.parse(input, formatter);
		
		System.out.println("Email: ");
		String email = scanner.nextLine();
		
		System.out.println("Telefone");
		String phone = scanner.nextLine();
		
	}

}
