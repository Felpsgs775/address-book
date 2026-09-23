package br.edu.utfpr.tsi.address;

import java.util.Scanner;

import br.edu.utfpr.tsi.address.control.PersonController;
import br.edu.utfpr.tsi.address.view.PersonView;

public class AddressBookApp 
{
	private Scanner scanner;
	
	private PersonView personView;
	private PersonController personController;
	public AddressBookApp()
	{
		this.scanner = new Scanner(System.in);
		this.personController = new PersonController();
		this.personView = new PersonView(scanner, personController);
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
		personView.createMultiplePeople();
		showGoodbyeMessage();
	}
	
	public static void main(String[] args)
	{
		(new AddressBookApp()).run();
		
	}
	
	

}
