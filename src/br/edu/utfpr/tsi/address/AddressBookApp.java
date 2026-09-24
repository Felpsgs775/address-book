package br.edu.utfpr.tsi.address;

import java.util.Scanner;

import br.edu.utfpr.tsi.address.control.PersonController;
import br.edu.utfpr.tsi.address.view.PersonView;
import br.edu.utfpr.tsi.address.view.util.ConsoleInput;

public class AddressBookApp 
{
	private Scanner scanner;
	
	private ConsoleInput console;
	private PersonView personView;
	private PersonController personController;
	
	public AddressBookApp()
	{
		this.scanner = new Scanner(System.in);
		this.console = new ConsoleInput(scanner);
		this.personController = new PersonController();
		this.personView = new PersonView(console, personController);
	}
	
	
	private void showWelcomeMessage()
	{
		System.out.print("===============================\n"
				+ "Address Book Aplication - UTFPR/TSI\n"
				+        "===============================\n");
	}
	
	private void showGoodbyeMessage()
	{
		System.out.println("E N D");
	}
	
	public void run()
	{
		showWelcomeMessage();
		personView.createMultiplePersons();
		showGoodbyeMessage();
	}
	
	public static void main(String[] args)
	{
		(new AddressBookApp()).run();
		
	}
	
	

}
