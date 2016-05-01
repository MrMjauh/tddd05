/**
 * Created by rasmus on 2016-04-29.
 */
public class Ingredient {

    private String ingredientName;
    private String ingredientGroup;

    public String getIngredientGroup() {
        return ingredientGroup;
    }

    public void setIngredientGroup(String ingredientGroup) {
        this.ingredientGroup = ingredientGroup;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String toString() {
        return "I am an ingredient class!";
    }
}
