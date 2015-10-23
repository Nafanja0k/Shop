
import java.security.*;public class Product
{
	private static int genId;
	private int id;
	private String shortName;
	private double price;
	
	public Product(){
		this("n/a", 0.0);
	}
	
	public Product(String theShortName, double thePrice){
		id = getNextId();
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
	
	public int getId(){
		return id;
	}
	
	@Override
	public String toString()
	{
		return "Tovar "+getId()+" "+getShortName()+" cena="+getPrice();
	}
	
	
	
}
