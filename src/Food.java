public class Food extends Product
{
	
	public Food(String theId, String theShortName, double thePrice){
		super("1/" + theId, theShortName, thePrice);
	}
	
	@Override
	public String toString()
	{
		return "Subclass Food "+getId()+" "+getShortName()+" cena="+getPrice();
		
	}
	 
}
