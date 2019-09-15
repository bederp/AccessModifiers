package pl.connectis.person;

public class Person {

    String firstNameDefault;
    protected String firstNameProtected;
    public String firstNamePublic;
    private String firstNamePrivate;

    String getFirstNameDefault() {
        return firstNameDefault;
    }

    protected String getFirstNameProtected() {
        return firstNameProtected;
    }

    public String getFirstNamePublic() {
        return firstNamePublic;
    }

    private String getFirstNamePrivate() {
        return firstNamePrivate;
    }
}
