package pl.connectis.person;


public class Main {
    public static void main(String[] args) {


        Person person = new Person();

        //Can access default from same package
        String firstNameDefault = person.firstNameDefault;
        //Can access protected from same package
        String firstNameProtected = person.firstNameProtected;
        //Public field can be accessed anywhere
        String firstNamePublic = person.firstNamePublic;
        // Private can be only accessed in owning class
        String firstNamePrivate = person.firstNamePrivate;



    }
}
