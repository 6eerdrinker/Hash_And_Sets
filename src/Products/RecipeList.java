package Products;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private final Set<Recipe> recipes = new HashSet<>();

    public void addRecipe(Recipe recipe) {
        if (recipe == null) {
            return;
        }
        if (this.recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже изобретен.");
        } else {
            this.recipes.add(recipe);
        }
    }

    @Override
    public String toString() {
        return "RecipeList{" +
                "recipes=" + recipes +
                '}';
    }
}
