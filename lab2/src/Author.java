/**
 * Created by rasmus on 2016-04-29.
 */
public class Author extends User {

    private String title;

    @Override
    public String getPublicUserName() {
        return title + " " +  getName();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
