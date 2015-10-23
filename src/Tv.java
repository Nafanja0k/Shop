public class Tv extends Technic
{
	public Tv(String theShortName, double thePrice){
		super("1/", theShortName, thePrice);
	}
	@Override
	public String toString()
	{
		return "Tv "+getId()+" "+getShortName()+" cena="+getPrice();

	}
}
