package example;

public abstract class FoodTest extends ProductTest {

    private final String id = "3";

    private final String name = "Food";

    protected String getId() {
        return super.getId() + id;
    }
    protected String getName() {
        return super.getName() + name;
    }
}
