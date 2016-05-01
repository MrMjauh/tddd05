/**
 * Created by rasmus on 2016-04-29.
 */
public class User implements IUser {

    private String name;

    @Override
    public String getPublicUserName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
