package Products;

import java.util.Objects;

public class Product {
    private final String nameOfProduct;
    private final float productPrice;
    private final float productWeight;
    private boolean selected;


    public Product(String nameOfProduct, float productPrice, float productWeight) {

        if (nameOfProduct != null || !nameOfProduct.isBlank()
                || !nameOfProduct.isEmpty()) {
            this.nameOfProduct = nameOfProduct;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью! " +
                    "Внесите наименование продукта.");
        }
        if (productPrice != 0) {
            this.productPrice = productPrice;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью! " +
                    "Укажите цену.");
        }
        if (productWeight != 0) {
            this.productWeight = productWeight;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью! " +
                    "Укажите вес.");
        }
        this.selected = true;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }


    public float getProductPrice() {
        return productPrice;
    }


    public float getProductWeight() {
        return productWeight;
    }

    public void setSelected() {
        this.selected = false;
    }

    public boolean isSelected() {
        return selected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return Objects.equals(nameOfProduct, product.nameOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfProduct);
    }

    @Override
    public String toString() {
        String selectedString = this.isSelected() ? "куплен." : "не куплен.";
       return String.format("Продукт - %s, по цене %s руб. за килограмм," +
                    " в количестве %s кг, %s ", this.nameOfProduct,
               this.productPrice, this.productWeight, selectedString);
 }
}
