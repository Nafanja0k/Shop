import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();*/
		Cart cart = new Cart();
		cart.add(new Product("gazeta",3.5));
		cart.add(new Fruit("apple", 6.0));
		
		cart.print();
}

	
}
