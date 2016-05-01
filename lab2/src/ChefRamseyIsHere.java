import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by rasmus on 2016-04-29.
 */
public class ChefRamseyIsHere implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Recipe recipe = applicationContext.getBean(Recipe.class);

        if (recipe.getTheOneAndOnlyauthor().getPublicUserName().equals("Chef Ramsey")) {
            System.out.println("This context has chef Ramsey!");
        }
    }
}
