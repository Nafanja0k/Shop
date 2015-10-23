public class Fruit extends Product
{
	public Fruit(String theShortName, double thePrice){
		super(theShortName, thePrice);
	}
	@Override
	public String toString()
	{
		return "Fruct "+getId()+" "+getShortName()+" cena="+getPrice();
		
	}
	
}
