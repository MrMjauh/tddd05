import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Created by rasmus on 2016-04-29.
 */
public class Recipe implements InitializingBean,DisposableBean {

    private String title,body;
    private List<Ingredient> ingredientList;

    private String initProp = "not set";
    private String dispProp = "not set";

    @Autowired
    @Qualifier("chefRasmey")
    private IUser theOneAndOnlyauthor;

    @Autowired
    private Ingredient dependentIngredient;

    public IUser getTheOneAndOnlyauthor() {
        return theOneAndOnlyauthor;
    }

    public void setTheOneAndOnlyauthor(IUser theOneAndOnlyauthor) {
        this.theOneAndOnlyauthor = theOneAndOnlyauthor;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredientList != null) {
            ingredientList.add(ingredient);
        }
    }

    public Ingredient getDependentIngredient() {
        return dependentIngredient;
    }

    public void setDependentIngredient(Ingredient dependentIngredient) {
        this.dependentIngredient = dependentIngredient;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        initProp = "something to set after properties";
    }

    public String getInitProp() {
        return initProp;
    }

    public void setInitProp(String initProp) {
        this.initProp = initProp;
    }

    @Override
    public void destroy() throws Exception {
        this.dispProp = "some disposable stuff";
    }

    public String getDispProp() {
        return dispProp;
    }

    public void setDispProp(String dispProp) {
        this.dispProp = dispProp;
    }
}
