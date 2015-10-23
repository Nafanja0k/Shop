public class Technic extends Product
{
	public Technic(String theId, String theShortName, double thePrice){
		super("2/" + theId, theShortName, thePrice);
	}
	
	@Override
	public String toString()
	{
		return "Tecnic "+getId()+" "+getShortName()+" cena="+getPrice();

	}
}
