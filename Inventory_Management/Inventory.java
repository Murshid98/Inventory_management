import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void printPdoduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

}
