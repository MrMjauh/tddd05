import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;


/**
 * Created by rasmus on 2016-04-29.
 */
@Configuration
public class MainAnnotationExample {


    @Bean
    Ingredient modifiedIngredient() {
        return new Ingredient() {
            public String toString() {
                return "I am a modified ingredient!";
            }
        };
    }

    @Bean
    @Qualifier("chefRasmey")
    public IUser chefRamsey() {
        Author chefRamsey = new Author();
        chefRamsey.setName("Ramsey");
        chefRamsey.setTitle("Chef");
        return chefRamsey;
    }

    @Bean
    @Qualifier("userPleb")
    public IUser someUser() {
        User someUser = new User();
        someUser.setName("pleb");
        return someUser;
    }

    @Bean
    @Scope("prototype")
    public Author someAuthor() {
        Author author = new Author();
        author.setTitle("Test");
        author.setName("aurther");
        return author;
    }

    @Bean
    @Scope("singleton")
    public User someUserSingleton() {
        User user = new User();
        user.setName("someUser");
        return user;
    }

    @Bean
    public ChefRamseyIsHere getChefRamseyIsHere() {
        return new ChefRamseyIsHere();
    }

    @Bean
    Recipe getARecipe() {
        return new Recipe();
    }



    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainAnnotationExample.class);

        Recipe contextRecipe = context.getBean(Recipe.class);

        System.out.println(contextRecipe.getDependentIngredient());
        System.out.println(contextRecipe.getTheOneAndOnlyauthor().getPublicUserName());
        System.out.println(contextRecipe.getInitProp());

        System.out.println("dispProp>" + contextRecipe.getDispProp());

        // This test should return same user
        User user = context.getBean("someUserSingleton",User.class);
        User user1 = context.getBean("someUserSingleton",User.class);

        if (user.equals(user1)) {
            System.out.println("getBean returned same user");
        } else {
            System.out.println("getBean did not return same user");
        }

        // This test should return different authors
        Author author = context.getBean("someAuthor",Author.class);
        Author author1 = context.getBean("someAuthor",Author.class);

        if (author.equals(author1)) {
            System.out.println("getBean returned same author");
        } else {
            System.out.println("getBean did not return same author");
        }

        context.destroy();

        System.out.println("dispProp>" + contextRecipe.getDispProp());
    }
}
