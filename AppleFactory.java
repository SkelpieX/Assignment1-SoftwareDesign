public class AppleFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct createProduct(String name) {
        return new Apple(name);
    }
}
