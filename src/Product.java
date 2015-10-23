
import java.security.*;
public class Product
{
	private static int genId = 1;
	private String id;
	private String shortName;
	private double price;
	
	public Product(){
		this("0", "n/a", 0.0);
	}
	
	public Product(String theId, String theShortName, double thePrice){
		id = theId + Integer.toString(getNextId());
		shortName = theShortName;
		price = thePrice;
	}
	
	public int getNextId(){
		return genId++;
	}

	public String getShortName(){
		return shortName;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getId(){
		return id;
	}
	
	@Override
	public String toString()
	{
		return "Superclass Tovar "+getId()+" "+getShortName()+" cena="+getPrice();
	}
	
	
	
}
