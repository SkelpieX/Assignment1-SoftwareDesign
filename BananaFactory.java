public class BananaFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct createProduct(String name) {
        return new Banana(name);
    }
}
