package br.edu.utfpr.tsi.address.model.Address;

public class Address 
{
	public String street;
	public int number;
	public String neighborhood;
	public String city;
	public String state;
	public String complement;
	
	public Address(String street, 
			       int number, 
			       String neighborhood, 
			       String city, 
			       String state, 
			       String complement)
	{
		this.street       = street;
		this.number       = number;
		this.neighborhood = neighborhood;
		this.city         = city;
		this.state        = state;
		this.complement   = complement;
		
	}
	

}
