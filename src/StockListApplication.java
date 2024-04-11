import java.io.*;
import java.util.*;

public class StockListApplication {
    private static final List<Product> products = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final String FILE_NAME = "stock_list.json";

    public static void main(String[] args) {
        loadFromFile();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add");
            System.out.println("2. List");
            System.out.println("3. Sort");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    listProducts();
                    break;
                case 3:
                    sortProducts();
                    break;
                case 4:
                    saveToFile();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter unit number: ");
        int units = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.addUnits(units);
                found = true;
                break;
            }
        }

        if (!found) {
            products.add(new Product(name, units));
        }

        System.out.println("Product added successfully.");
    }

    private static void listProducts() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + "- " + products.get(i));
        }
    }

    private static void sortProducts() {
        products.sort(Comparator.comparing(Product::getName));
        System.out.println("Products sorted successfully.");
    }

    private static void loadFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                products.add(new Product(parts[0], Integer.parseInt(parts[1])));
            }
        } catch (IOException e) {
            
        }
    }

    private static void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Product product : products) {
                writer.write(product.getName() + "," + product.getUnitNumber() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error occurred while saving to file: " + e.getMessage());
        }
    }
}