package example;

public class BananaTest extends FruitTest {

    private final String id = "6";

    private final String name = "Banana";

    public BananaTest(){}

    public BananaTest(int price) {
        super.setPrice(price);
    }

    @Override
    public String getProductCode() {
        return super.getId() + id;
    }

    @Override
    public String getFullProductName() {
        return super.getName() + name;
    }

}
