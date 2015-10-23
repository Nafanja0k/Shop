public class Vegetable extends Food
{
	public Vegetable(String theShortName, double thePrice){
		super("2/", theShortName, thePrice);
	}
	@Override
	public String toString()
	{
		return "Vegetable "+getId()+" "+getShortName()+" cena="+getPrice();

	}

}
