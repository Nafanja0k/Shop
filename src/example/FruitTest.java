package example;

public abstract class FruitTest extends FoodTest {

    private final String id = "4";

    private final String name = "Fruit";

    protected String getId() {
        return super.getId() + id;
    }
    protected String getName() {
        return super.getName() + name;
    }
}
