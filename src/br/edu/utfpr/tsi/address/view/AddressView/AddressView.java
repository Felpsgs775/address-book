package br.edu.utfpr.tsi.address.view.AddressView;
import java.util.Scanner;
import br.edu.utfpr.tsi.address.model.Address.Address;
import br.edu.utfpr.tsi.address.view.util.ConsoleInput;

public class AddressView 
{
	private final ConsoleInput input = new ConsoleInput(new Scanner(System.in));
	public Address readAddress()
	{
		String street       = input.readText("Rua: ");
	    int number          = Integer.parseInt(input.readText("Número: "));
	    String neighborhood = input.readText("Bairro: ");
	    String city         = input.readText("Cidade: ");
	    String state        = input.readText("Estado: ");
	    String complement   = input.readText("Complemento: ");
	    
	    return new Address(street, number, neighborhood, city, state, complement);
		
	}
	
	public void showAddress(String street, 
		                    int number, 
		                    String neighborhood, 
		                    String city , 
		                    String state, 
		                    String complement)
	{
		
		System.out.println("Endereço:");
	    System.out.println("Rua: " + street + ", " + number);
	    System.out.println("Bairro: " + neighborhood);
	    System.out.println("Cidade/Estado: " + city + " - " + state);
	    System.out.println("Complemento: " + complement);
		
	}
	

}
