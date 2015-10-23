import java.util.*;

public class Main
{
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();*/
		Cart cart = new Cart();
		Catalog catalog = new Catalog();
		
		catalog.fillCatalog();
		mainMenu(catalog, cart);
		
		/*cart.addToCart(new Product("gazeta",3.5));
		cart.addToCart(new Fruit("apple", 6.0));
		cart.addToCart(new Fruit("orange", 23.5));
		cart.addToCart(new Technic("tv", 7500));
		
		cart.print();*/
}
	
	public static void mainMenu(Catalog theCatalog, Cart theCart){
		// print menu

		System.out.println(1 + ". Show products #" + 1);
		System.out.println(2 + ". Show cart #" + 2);

		System.out.println("0. Quit");
		// handle user commands
		boolean quit = false;
		int menuItem;
		do {
			System.out.print("Choose menu item or enter product# and quantity (1/2/1 10): ");
			menuItem = in.nextInt();
			switch (menuItem) {
				case 1:
					System.out.println("You've chosen Products #1");
					theCatalog.sort();
					theCatalog.print();
					break;
				case 2:
					System.out.println("You've chosen Cart #2");
					theCart.print();
					break;
				case 0:
					quit = true;
					break;
				default:
					theCart.addToCart(theCatalog.);
			}
		} while (!quit);
		System.out.println("Bye-bye!");
	}
}
