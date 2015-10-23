public class Fruit extends Food
{
	public Fruit(String theShortName, double thePrice){
		super("1/", theShortName, thePrice);
	}
	@Override
	public String toString()
	{
		return "Fruct "+getId()+" "+getShortName()+" cena="+getPrice();
		
	}
	
}
