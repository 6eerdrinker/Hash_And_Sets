package Products;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже есть в списке.");
        } else {
            this.products.add(product);
        }
    }

    public void selectProduct(String nameOfProduct) {
        for (Product product : this.products) {
            if (product.getNameOfProduct().equals(nameOfProduct)) {
                product.setSelected();
                break;
            }
        }
    }

    public void removeProduct(String nameOfProduct) {
        Iterator<Product> productIterator = this.products.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getNameOfProduct().equals(nameOfProduct)) {
                productIterator.remove();
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов: ").append('\n');
        for (Product product : this.products) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }
}
