package src;

import java.util.*;

/**
 * 
 */
public class App {

    /**
     * Default constructor
     */
    public static void main(String[] args) {
        EneignantCreator ce = new EneignantCreator();
        User e1 = ce.factory();

        AdminCreator ca = new AdminCreator();
        User a1 = ca.factory();

        EtudiantCreator cet = new EtudiantCreator();
        User eti1 = cet.factory();

        System.out.println(eti1.getClass());
        System.out.println(a1.getClass());
        System.out.println(e1.getClass());

    }

}