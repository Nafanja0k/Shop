package example;

public abstract class ProductTest {

    private final String id = "1";

    private final String name = "Product";

    private int price;

    protected String getId() {
        return "id";
    }
    protected String getName() {
        return name;
    }

    public abstract String getProductCode();

    public abstract String getFullProductName();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
