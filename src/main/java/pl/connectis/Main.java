package pl.connectis;


import pl.connectis.person.Person;

public class Main {
    public static void main(String[] args) {


        Person person = new Person();

        //Cannot access from other package
        person.firstNameDefault;
        //Cannot access from other package unless in inherited class
        person.firstNameProtected;
        // Cannot access from other package
        person.firstNamePublic;
        // Cannot access private from other package
        person.firstNamePrivate;


    }
}
