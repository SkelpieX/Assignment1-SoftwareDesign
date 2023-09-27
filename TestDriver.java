import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestDriver {
    private static final String MANIFEST_FILE = "ItemManifest.csv";
    private static Map<String, Double> itemPrices = new HashMap<>();

    public static void main(String[] args) {
        // Create the factories and products first
        GroceryProductFactory bananaFactory = new BananaFactory();
        GroceryProduct banana = bananaFactory.createProduct("Banana");

        GroceryProductFactory appleFactory = new AppleFactory();
        GroceryProduct apple = appleFactory.createProduct("Apple");

        // Display creation message
        System.out.println(banana.getName() + " has been created in the main inventory");
        System.out.println(apple.getName() + " has been created in the main inventory");

        // Set prices
        banana.setPrice(getPriceFromManifest("Banana"));
        apple.setPrice(getPriceFromManifest("Apple"));

        // Display price-setting message
        System.out.println("Price of " + banana.getName() + " has been set to $" + banana.getPrice());
        System.out.println("Price of " + apple.getName() + " has been set to $" + apple.getPrice());
    }

    private static double getPriceFromManifest(String itemName) {
        if (!itemPrices.containsKey(itemName)) {
            loadPriceFromManifest(itemName);
        }
        return itemPrices.get(itemName);
    }

    private static void loadPriceFromManifest(String itemName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(MANIFEST_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    double price = Double.parseDouble(parts[1]);
                    itemPrices.put(name, price);
                    if (name.equals(itemName)) {
                        break; // Stop reading after finding the required item
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
