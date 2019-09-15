package pl.connectis;

import pl.connectis.person.Person;

public class Postman extends Person {

    public void canAccess() {
        //Cannot access default access modifier even when inheriting
        firstNameDefault;
        //Can access protected from same package
        String firstNameProtected = this.firstNameProtected;
        //Public field can be accessed anywhere
        String firstNamePublic = this.firstNamePublic;
        // Private can be only accessed in owning class
        firstNamePrivate;
    }
}
