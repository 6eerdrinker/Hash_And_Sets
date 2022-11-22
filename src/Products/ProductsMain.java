package Products;

import java.util.*;

public class ProductsMain {

    public static void main(String[] args) {

        Product butter = new Product("Сливочное масло",
                1000.50f, 0.250f);
        Product sourCream = new Product("Сметана",
                380.00f, 0.250f);
        Product tomato = new Product("Помидоры",
                205.00f, 0.850f);
        Product cucumbers = new Product("Огурцы",
                160.00f, 1.000f);
        Product onion = new Product("Лук",
                80.00f, 1.00f);
        Product sunFlowerOil = new Product("Подсолнечное масло",
                194.00f, 1.000f);
        Product beef = new Product("Говядина",
                550.00f, 2.000f);
        Product potato = new Product("Картофель",
                80.00f, 5.000f);
        Product sugar = new Product("Сахар",
                110.00f, 0.800f);
        Product pepper = new Product("Перец",
                230.00f, 0.500f);
        Product carrot = new Product("Морковь",
                100.00f, 0.800f);
        Product salt = new Product("Соль",
                120.00f, 0.500f);
        Product beet = new Product("Свекла",
                95.00f, 0.300f);

        System.out.println("******************************************" +
                "*****************************************************");

        ProductList productList = new ProductList();
        productList.addProduct(butter);
        productList.addProduct(salt);
        productList.addProduct(beef);
        productList.addProduct(sugar);
        productList.addProduct(sourCream);
        productList.addProduct(potato);
        productList.addProduct(cucumbers);
        productList.addProduct(carrot);
        productList.addProduct(tomato);
        productList.addProduct(onion);
        productList.addProduct(pepper);
        productList.addProduct(sunFlowerOil);
        productList.addProduct(beet);

        System.out.println(productList);

        System.out.println("******************************************" +
                "*****************************************************");

        List<String> product = new ArrayList<>();
        for (Product products : Arrays.asList(butter, beef, sourCream, potato,
                tomato, cucumbers, onion, sunFlowerOil,
                sugar, pepper, carrot, salt, beet)) {
            product.add(products.getNameOfProduct());
        }
        System.out.printf("В списке %d продуктов: \n", product.size());
        for (String products : product) {
            System.out.println(products);
        }

        System.out.println("****************************************");


    }
}
