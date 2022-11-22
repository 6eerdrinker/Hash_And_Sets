package Products;

import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final Set<Product> products;
    private final String nameOfRecipe;

    public Recipe(Set<Product> products, String nameOfRecipe) {
        if (products == null || products.size() == 0) {
            throw new IllegalArgumentException("Заполните данные рецепта полностью! " +
                    "Внесите названия продуктов.");
        } else
        {
            this.products = products;}

        if (nameOfRecipe == null || nameOfRecipe.isEmpty() || nameOfRecipe.isBlank()) {
            throw new IllegalArgumentException("Заполните данные рецепта полностью! " +
                    "Внесите наименование рецепта.");
        } else {
            this.nameOfRecipe = nameOfRecipe;}
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public float getRecipePrice() {
        float sum = 0;
        for (Product product : products) {
            sum += getRecipePrice();
        }
        return sum;
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameOfRecipe,recipe.nameOfRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe);
    }
}
