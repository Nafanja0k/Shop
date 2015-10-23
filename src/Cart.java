import java.util.*;
public class Cart
{
	private String name;
	private List<Product> products = new ArrayList<Product>();
	public Cart(){
		this("n/a");
	}
	
	public Cart(String theName){
		name = theName;
	}
	
	public void addToCart(Product theProduct){
		products.add(theProduct);
	}
	
	public void print(Cart theCart){
		for(Product item : products)
			System.out.println(item);
	}
}
