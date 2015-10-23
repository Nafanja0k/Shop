import java.util.*;
public class Catalog 
{
	private String name;
	private List<Product> products= new ArrayList<Product>();

	public Catalog(){
		this("n/a");
	}
	
	public Catalog(String theName){
		name = theName;
	}
	
	public void fillCatalog(){
		products.add(new Fruit("apple", 6.0));
		products.add(new Fruit("orange", 23.5));
		products.add(new Tv("tv1", 7500));
		products.add(new Vegetable("potato", 3.0));
		products.add(new Vegetable("carrot", 8.5));
		products.add(new Tv("tv1", 12500));
		
	}
	
	public void print(){
		for (Product item : products)
			System.out.println(item);
		
	}

	public void sort() {
		Collections.sort(products);
	}

}
