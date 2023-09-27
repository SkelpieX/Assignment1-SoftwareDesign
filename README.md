# Grocery Store Product Pricing

This Java project demonstrates the use of design patterns (Abstract Factory and Factory Method) to create and set prices for grocery products in a store. Prices are fetched from a CSV file.

## File Structure

|-- src
| |-- GroceryProduct.java
| |-- Banana.java
| |-- Apple.java
| |-- GroceryProductFactory.java
| |-- BananaFactory.java
| |-- AppleFactory.java
| |-- TestDriver.java
| |-- ItemManifest.csv
|-- README.md


- `src/`: Contains all the Java source files.
  - `GroceryProduct.java`: Defines the interface for grocery products.
  - `Banana.java`: Implements the `GroceryProduct` interface for bananas.
  - `Apple.java`: Implements the `GroceryProduct` interface for apples.
  - `GroceryProductFactory.java`: Defines the interface for creating grocery products.
  - `BananaFactory.java`: Implements `GroceryProductFactory` for creating bananas.
  - `AppleFactory.java`: Implements `GroceryProductFactory` for creating apples.
  - `TestDriver.java`: Contains the main program to test the functionality including the logic to read pricing data from a file via partial loading.
  - `ItemManifest.csv`: Contains the list of products and their prices.

## Test Methods

The following test methods have been developed:

1. **Test for Creating Bananas:**
   - Description: This test creates a banana using the `BananaFactory` and sets its price.
   - Method: `testCreateBanana()`

2. **Test for Creating Apples:**
   - Description: This test creates an apple using the `AppleFactory` and sets its price.
   - Method: `testCreateApple()`

***Make sure that `ItemManifest.csv` is in the same directory as the Java files if cloning/downloading to local machine.

